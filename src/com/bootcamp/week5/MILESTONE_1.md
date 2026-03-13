# Project Milestone 1 – Data Model and Repositories

## Overview

This milestone focuses on building the **data layer of the project** using Spring Boot and Spring Data JPA.

The objective is to create a working persistence layer including:

- JPA entities
- Relationships between entities
- Repository interfaces
- Database configuration
- Initial dataset

The project uses **H2 in-memory database** for development and testing.

---

# Technologies Used

- Java 17
- Spring Boot
- Spring Data JPA
- Maven
- H2 Database
- Lombok

---

# Project Structure

```

src/main/java/com/bootcamp
│
├── model
│   ├── Product.java
│   ├── Customer.java
│   └── Order.java
│
├── repository
│   ├── ProductRepository.java
│   ├── CustomerRepository.java
│   └── OrderRepository.java
│
└── BootcampApplication.java

````

---

# Entity Design

The system includes three main entities:

- Product
- Customer
- Order

Relationship:

Customer → OneToMany → Orders

---

# Product Entity

```java
package com.bootcamp.model;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "products")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String description;

    private BigDecimal price;

    private String category;

    private boolean inStock;

    private LocalDateTime createdAt;

}
````

---

# Customer Entity

```java
package com.bootcamp.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "customers")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String email;

    private String phone;

    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
    private List<Order> orders;
}
```

---

# Order Entity

```java
package com.bootcamp.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "orders")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDateTime createdAt;

    private double total;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;
}
```

---

# Repository Layer

Spring Data JPA repositories are used to interact with the database.

---

# ProductRepository

```java
package com.bootcamp.repository;

import com.bootcamp.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigDecimal;
import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {

    List<Product> findByCategory(String category);

    List<Product> findByPriceBetween(BigDecimal min, BigDecimal max);

    List<Product> findByNameContainingIgnoreCase(String keyword);
}
```

---

# CustomerRepository

```java
package com.bootcamp.repository;

import com.bootcamp.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

    Optional<Customer> findByEmail(String email);
}
```

---

# OrderRepository

```java
package com.bootcamp.repository;

import com.bootcamp.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderRepository extends JpaRepository<Order, Long> {

    List<Order> findByCustomerId(Long customerId);
}
```

---

# H2 Database Configuration

File: `application.properties`

```properties
spring.datasource.url=jdbc:h2:mem:bootcampdb
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=

spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
spring.jpa.hibernate.ddl-auto=create

spring.h2.console.enabled=true
spring.h2.console.path=/h2-console
```

Access console:

```
http://localhost:8080/h2-console
```

---

# Initial Data

File: `data.sql`

```sql
INSERT INTO products (name, description, price, category, in_stock, created_at)
VALUES
('Laptop', 'Gaming laptop', 1200, 'Electronics', true, CURRENT_TIMESTAMP),
('Mouse', 'Wireless mouse', 25, 'Electronics', true, CURRENT_TIMESTAMP),
('Keyboard', 'Mechanical keyboard', 80, 'Electronics', true, CURRENT_TIMESTAMP),
('Monitor', '27 inch monitor', 300, 'Electronics', true, CURRENT_TIMESTAMP),
('Headphones', 'Noise cancelling', 150, 'Electronics', true, CURRENT_TIMESTAMP);

INSERT INTO customers (name, email, phone)
VALUES
('Alice', 'alice@email.com', '123456789'),
('Bob', 'bob@email.com', '987654321'),
('Charlie', 'charlie@email.com', '555555555'),
('Diana', 'diana@email.com', '444444444'),
('Ethan', 'ethan@email.com', '333333333');
```

---

# Running the Application

Run the application using:

```
./mvnw spring-boot:run
```

Verify the database using the H2 console.

---

# Milestone Completion Checklist

✔ GitHub repository created
✔ Spring Boot project initialized
✔ 3 JPA entities created
✔ Entity relationships implemented
✔ Repository interfaces with custom queries
✔ H2 database configured
✔ Initial dataset added
✔ Application starts without errors

---

# Conclusion

At this milestone, the project now includes a fully functional **data persistence layer** with:

* Structured entities
* Database relationships
* Spring Data repositories
* Initial dataset

This foundation allows the next milestone to implement:

* Service layer
* REST API
* Validation
* Exception handling
* Unit tests

```

