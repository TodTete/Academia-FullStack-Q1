package com.bootcamp.controller;

import com.bootcamp.dto.ProductRequest;
import com.bootcamp.dto.ProductResponse;
import com.bootcamp.service.ProductService;

import jakarta.validation.Valid;

import lombok.RequiredArgsConstructor;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/*
 * REST Controller encargado de exponer los endpoints HTTP
 * para gestionar productos.
 *
 * Sigue el estilo RESTful usando los verbos HTTP correctos:
 *
 * GET    -> obtener datos
 * POST   -> crear recurso
 * PUT    -> actualizar recurso
 * DELETE -> eliminar recurso
 */

@RestController
@RequestMapping("/api/v1/products") // ruta base de la API
@RequiredArgsConstructor
public class ProductController {

    // Inyección del service usando Lombok
    private final ProductService service;

    /*
     * GET /api/v1/products
     *
     * Retorna todos los productos disponibles.
     *
     * Response:
     * 200 OK + lista de productos
     */
    @GetMapping
    public ResponseEntity<List<ProductResponse>> getAllProducts() {

        List<ProductResponse> products = service.findAll();

        return ResponseEntity.ok(products);
    }


    /*
     * GET /api/v1/products/{id}
     *
     * Retorna un producto específico por su ID.
     *
     * Response:
     * 200 OK + producto
     * 404 Not Found si no existe
     */
    @GetMapping("/{id}")
    public ResponseEntity<ProductResponse> getProductById(
            @PathVariable Long id) {

        ProductResponse product = service.findById(id);

        return ResponseEntity.ok(product);
    }


    /*
     * POST /api/v1/products
     *
     * Crea un nuevo producto.
     *
     * @Valid activa las validaciones definidas
     * en ProductRequest.
     *
     * Response:
     * 201 Created
     */
    @PostMapping
    public ResponseEntity<ProductResponse> createProduct(
            @Valid @RequestBody ProductRequest request) {

        ProductResponse created = service.create(request);

        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }


    /*
     * PUT /api/v1/products/{id}
     *
     * Actualiza un producto existente.
     *
     * Response:
     * 200 OK + producto actualizado
     * 404 Not Found si no existe
     */
    @PutMapping("/{id}")
    public ResponseEntity<ProductResponse> updateProduct(
            @PathVariable Long id,
            @Valid @RequestBody ProductRequest request) {

        ProductResponse updated = service.update(id, request);

        return ResponseEntity.ok(updated);
    }


    /*
     * DELETE /api/v1/products/{id}
     *
     * Elimina un producto.
     *
     * Response:
     * 204 No Content
     */
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteProduct(
            @PathVariable Long id) {

        service.delete(id);

        return ResponseEntity.noContent().build();
    }


    /*
     * GET /api/v1/products/search?name=laptop
     *
     * Busca productos por nombre.
     *
     * Response:
     * 200 OK + lista de resultados
     */
    @GetMapping("/search")
    public ResponseEntity<List<ProductResponse>> searchProducts(
            @RequestParam String name) {

        List<ProductResponse> results = service.searchByName(name);

        return ResponseEntity.ok(results);
    }
}