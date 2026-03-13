# Project Milestone 2 – Complete API and Tests

## Overview

This milestone focuses on implementing the **service layer, REST API, validations, exception handling, and unit tests** for the project.

At this stage, the system evolves from a data model to a **fully functional REST API** that allows interaction with the application through HTTP requests.

---

# Technologies Used

- Java 17
- Spring Boot
- Spring Data JPA
- Maven
- H2 Database
- Lombok
- Bean Validation
- JUnit 5
- Mockito
- Postman

---

# Project Architecture

The application follows a **layered architecture**:

```

Controller → Service → Repository → Database

````

Responsibilities of each layer:

**Controller**
Handles HTTP requests and responses.

**Service**
Contains business logic.

**Repository**
Handles database access.

**Model**
Represents entities stored in the database.

---

# Service Layer

## ProductService

```java
@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository repository;

    public List<Product> findAll() {
        return repository.findAll();
    }

    public Product findById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Product not found"));
    }

    public Product create(Product product) {
        return repository.save(product);
    }

    public Product update(Long id, Product productData) {

        Product product = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Product not found"));

        product.setName(productData.getName());
        product.setDescription(productData.getDescription());
        product.setPrice(productData.getPrice());
        product.setCategory(productData.getCategory());
        product.setInStock(productData.isInStock());

        return repository.save(product);
    }

    public void delete(Long id) {

        Product product = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Product not found"));

        repository.delete(product);
    }
}
````

---

# REST Controllers

## ProductController

```java
@RestController
@RequestMapping("/api/products")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService service;

    @GetMapping
    public List<Product> getAllProducts() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Product getProduct(@PathVariable Long id) {
        return service.findById(id);
    }

    @PostMapping
    public Product createProduct(@RequestBody Product product) {
        return service.create(product);
    }

    @PutMapping("/{id}")
    public Product updateProduct(@PathVariable Long id,
                                 @RequestBody Product product) {
        return service.update(id, product);
    }

    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable Long id) {
        service.delete(id);
    }
}
```

---

# Bean Validation

Validation ensures that invalid data cannot be stored in the database.

Example inside the Product entity:

```java
@NotBlank
private String name;

@NotNull
private BigDecimal price;

@Positive
private BigDecimal price;
```

If validation fails, the API will return **HTTP 400 Bad Request**.

---

# Global Exception Handler

Centralized error handling improves API consistency.

```java
@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<?> handleNotFound(RuntimeException ex) {

        return ResponseEntity.status(HttpStatus.NOT_FOUND)
                .body(Map.of(
                        "error", "Resource Not Found",
                        "message", ex.getMessage()
                ));
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<?> handleGeneral(Exception ex) {

        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                .body(Map.of(
                        "error", "Internal Server Error",
                        "message", ex.getMessage()
                ));
    }
}
```

---

# API Endpoints

| Method | Endpoint           | Description        |
| ------ | ------------------ | ------------------ |
| GET    | /api/products      | Get all products   |
| GET    | /api/products/{id} | Get product by ID  |
| POST   | /api/products      | Create new product |
| PUT    | /api/products/{id} | Update product     |
| DELETE | /api/products/{id} | Delete product     |

---

# Example Requests

## Create Product

```
POST /api/products
```

Body:

```json
{
  "name": "Laptop",
  "description": "Gaming laptop",
  "price": 1200,
  "category": "Electronics",
  "inStock": true
}
```

---

## Response

```json
{
  "id": 1,
  "name": "Laptop",
  "description": "Gaming laptop",
  "price": 1200,
  "category": "Electronics",
  "inStock": true
}
```

---

# Unit Tests

Unit tests verify the behavior of services and controllers.

## ProductServiceTest

```java
@ExtendWith(MockitoExtension.class)
class ProductServiceTest {

    @Mock
    ProductRepository repository;

    @InjectMocks
    ProductService service;

    @Test
    void shouldReturnProducts() {

        when(repository.findAll()).thenReturn(List.of(new Product()));

        List<Product> products = service.findAll();

        assertEquals(1, products.size());
    }

    @Test
    void shouldThrowExceptionIfProductNotFound() {

        when(repository.findById(1L)).thenReturn(Optional.empty());

        assertThrows(RuntimeException.class,
                () -> service.findById(1L));
    }
}
```

---

# Running Tests

Execute tests using Maven:

```
mvn test
```

All tests should pass successfully.

---

# API Verification

Test the API using curl or Postman.

Start the application:

```
./mvnw spring-boot:run
```

Test endpoint:

```
curl http://localhost:8080/api/products
```

Test validation:

```
curl -X POST http://localhost:8080/api/products \
-H "Content-Type: application/json" \
-d '{}'
```

Expected response: **HTTP 400**

---

# Milestone Completion Checklist

✔ Services implemented
✔ REST controllers created
✔ CRUD endpoints working
✔ Bean Validation implemented
✔ GlobalExceptionHandler implemented
✔ Minimum unit tests passing
✔ API tested with Postman
✔ Maven tests passing
✔ Documentation included

---

# Conclusion

At this milestone the project now includes a **fully functional REST API** with:

* Business logic layer
* CRUD operations
* Validation rules
* Centralized error handling
* Automated unit tests

The application is now ready to be extended with additional features such as authentication, pagination, and production database integration.
