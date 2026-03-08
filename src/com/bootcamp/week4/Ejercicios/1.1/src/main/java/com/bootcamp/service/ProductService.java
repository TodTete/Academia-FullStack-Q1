package com.bootcamp.service;

import com.bootcamp.dto.ProductRequest;
import com.bootcamp.dto.ProductResponse;
import com.bootcamp.model.Product;
import com.bootcamp.repository.ProductRepository;
import com.bootcamp.exception.ResourceNotFoundException;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository repository;

    public List<ProductResponse> findAll() {
        return repository.findAll()
                .stream()
                .map(this::toResponse)
                .toList();
    }

    public ProductResponse findById(Long id) {
        Product product = repository.findById(id)
                .orElseThrow(() ->
                        new ResourceNotFoundException("Product not found: " + id));

        return toResponse(product);
    }

    public ProductResponse create(ProductRequest request) {

        if (repository.existsByNameIgnoreCase(request.name())) {
            throw new IllegalArgumentException("Product already exists");
        }

        Product product = Product.builder()
                .name(request.name())
                .price(request.price())
                .description(request.description())
                .category(request.category())
                .stock(request.stock())
                .build();

        return toResponse(repository.save(product));
    }

    public ProductResponse update(Long id, ProductRequest request) {

        Product product = repository.findById(id)
                .orElseThrow(() ->
                        new ResourceNotFoundException("Product not found: " + id));

        product.setName(request.name());
        product.setPrice(request.price());
        product.setDescription(request.description());
        product.setCategory(request.category());
        product.setStock(request.stock());

        return toResponse(repository.save(product));
    }

    public void delete(Long id) {

        Product product = repository.findById(id)
                .orElseThrow(() ->
                        new ResourceNotFoundException("Product not found: " + id));

        repository.delete(product);
    }

    public List<ProductResponse> searchByName(String keyword) {
        return repository.findByNameContainingIgnoreCase(keyword)
                .stream()
                .map(this::toResponse)
                .toList();
    }

    private ProductResponse toResponse(Product product) {
        return new ProductResponse(
                product.getId(),
                product.getName(),
                product.getPrice(),
                product.getDescription(),
                product.getCategory(),
                product.getStock(),
                product.getCreatedAt()
        );
    }
}