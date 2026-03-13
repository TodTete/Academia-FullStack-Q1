# GitHub Copilot Exercises – Module 5

## Overview

This repository contains the exercises completed for **Module 7**, focused on the use of **Artificial Intelligence tools in software development**, specifically **GitHub Copilot**.

The goal of this module was to understand how AI-assisted development can improve productivity while still requiring developer supervision to ensure code quality, security, and maintainability.

---

# Topics Covered

- Introduction to Artificial Intelligence
- Applications of AI in software development
- Ethical considerations in AI
- Introduction to GitHub Copilot
- Installation and configuration
- Using Copilot inside the IDE
- AI-assisted code generation
- Code documentation with AI
- AI-assisted debugging and code analysis

---

# Repository Structure

```

.
├── src
│
├── screenshots
│   ├── copilot-entity-suggestion.png
│   ├── copilot-service-suggestion.png
│   └── copilot-test-suggestion.png
│
├── COMPARISON.md
├── BUG_REPORT.md
├── MILESTONE_1.md
├── MILESTONE_2.md
└── README.md

```

---

# Exercises Included

## Exercise 1 – Copilot Code Generation Race

This exercise compares development speed **with and without GitHub Copilot**.

Two development rounds were performed:

### Round 1 – Without Copilot

Classes were created manually:

- Product Entity
- ProductRepository
- ProductService

The development time and issues were recorded.

### Round 2 – With Copilot

The same classes were generated using Copilot suggestions by writing descriptive comments.

Results were compared in:

```

COMPARISON.md

```

---

## Exercise 2 – Bug Hunting

GitHub Copilot generated a service class with several problems.

The following issues were identified:

1. NullPointerException risk
2. Incorrect Optional usage
3. SQL Injection vulnerability
4. Performance problem
5. Architecture issue

Each problem was:

- identified
- explained
- corrected

The corrected implementation and explanations can be found in:

```

BUG_REPORT.md

```

---

## Exercise 3 – Project Milestone 1

This milestone focuses on building the **data layer of the project**.

Implemented components:

- JPA Entities
- Entity relationships
- Spring Data repositories
- Database configuration
- Initial dataset

Entities created:

- Product
- Customer
- Order

Relationship implemented:

```

Customer → OneToMany → Orders

```

Documentation and code examples are available in:

```

MILESTONE_1.md

```

---

## Exercise 4 – Project Milestone 2

This milestone focuses on implementing the **application API**.

Components implemented:

- Service layer
- REST Controllers
- CRUD operations
- Validation rules
- Global exception handling
- Unit tests

Main features:

- Product CRUD API
- Bean Validation
- Centralized error handling
- Service layer business logic
- Automated tests

Documentation is available in:

```

MILESTONE_2.md

```

---

# Example API Endpoints

| Method | Endpoint | Description |
|------|------|------|
| GET | /api/products | Get all products |
| GET | /api/products/{id} | Get product by ID |
| POST | /api/products | Create new product |
| PUT | /api/products/{id} | Update product |
| DELETE | /api/products/{id} | Delete product |

---

# Running the Project

Start the application:

```

./mvnw spring-boot:run

```

Test the API:

```

curl [http://localhost:8080/api/products](http://localhost:8080/api/products)

```

Run tests:

```

mvn test

```

---

# Screenshots

The repository includes screenshots showing GitHub Copilot suggestions during development.

Examples include:

- Entity generation
- Service layer suggestions
- Unit test generation

Example:

```

screenshots/copilot-entity-suggestion.png

```

---

# Observations About GitHub Copilot

Advantages:

- Faster generation of repetitive code
- Quick scaffolding for entities and services
- Useful suggestions for unit tests
- Helpful documentation generation

Limitations:

- Generated code sometimes requires corrections
- Security issues may appear
- Business logic still requires manual design
- Developers must review generated code carefully

---

# Conclusion

GitHub Copilot is a powerful development assistant that can significantly improve productivity. However, it does not replace the need for a developer to understand the generated code.

Effective use of AI tools requires:

- critical thinking
- code review
- security awareness
- solid software engineering principles

When used correctly, Copilot can greatly accelerate development while maintaining high code quality.
```
 commit profesionales**, para que su repositorio se vea **mucho más sólido cuando lo revise el instructor**.
