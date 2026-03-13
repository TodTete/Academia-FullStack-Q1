# Copilot Comparison Report

This experiment compares development speed and productivity when coding a small Spring Boot module with and without GitHub Copilot.

The objective was to measure the impact of AI-assisted coding when implementing a simple backend layer including:

- JPA Entity
- Repository
- Service layer
- Custom queries

---

# Experiment Setup

Two rounds were performed:

Round 1: Copilot disabled  
Round 2: Copilot enabled

Both rounds implemented the same components:

- Product Entity
- ProductRepository
- ProductService

Technologies used:

- Java 17
- Spring Boot
- Spring Data JPA
- Maven
- IntelliJ IDEA / VS Code
- GitHub Copilot

---

# Results

| Metric | Without Copilot | With Copilot |
|------|------|------|
| Time to complete | 25 min | 10 min |
| Lines of code | ~120 | ~120 |
| Bugs found after | 2 | 1 |
| Code quality (1-5) | 4 | 4 |

---

# Observations

## What worked well with Copilot

- Rapid generation of JPA entities
- Automatic generation of getters/setters via Lombok
- Repository query suggestions
- Faster creation of service methods
- Suggestions for JavaDoc and comments

Copilot significantly accelerated repetitive tasks such as:

- DTO generation
- CRUD method scaffolding
- Repository interfaces

---

## What I had to fix in Copilot output

Some corrections were required:

- Incorrect imports
- Missing annotations
- Minor logic adjustments
- Handling Optional values from JPA

Example issue:

Copilot sometimes generated:
# Copilot Comparison Report

This experiment compares development speed and productivity when coding a small Spring Boot module with and without GitHub Copilot.

The objective was to measure the impact of AI-assisted coding when implementing a simple backend layer including:

- JPA Entity
- Repository
- Service layer
- Custom queries

---

# Experiment Setup

Two rounds were performed:

Round 1: Copilot disabled  
Round 2: Copilot enabled

Both rounds implemented the same components:

- Product Entity
- ProductRepository
- ProductService

Technologies used:

- Java 17
- Spring Boot
- Spring Data JPA
- Maven
- IntelliJ IDEA / VS Code
- GitHub Copilot

---

# Results

| Metric | Without Copilot | With Copilot |
|------|------|------|
| Time to complete | 25 min | 10 min |
| Lines of code | ~120 | ~120 |
| Bugs found after | 2 | 1 |
| Code quality (1-5) | 4 | 4 |

---

# Observations

## What worked well with Copilot

- Rapid generation of JPA entities
- Automatic generation of getters/setters via Lombok
- Repository query suggestions
- Faster creation of service methods
- Suggestions for JavaDoc and comments

Copilot significantly accelerated repetitive tasks such as:

- DTO generation
- CRUD method scaffolding
- Repository interfaces

---

## What I had to fix in Copilot output

Some corrections were required:

- Incorrect imports
- Missing annotations
- Minor logic adjustments
- Handling Optional values from JPA

Example issue:

Copilot sometimes generated:
return repository.findById(id).get();

Which can throw `NoSuchElementException`.

It was corrected to:
return repository.findById(id)
.orElseThrow(() -> new ResourceNotFoundException("Product not found"));

---

## Where Copilot was NOT helpful

Copilot struggled with:

- Business logic decisions
- Architecture design
- Error handling strategy
- Proper exception design

These parts required manual implementation.

---

# Conclusion

GitHub Copilot is extremely useful for:

- Boilerplate code
- DTO creation
- Repository interfaces
- Repetitive CRUD patterns

However, developers still need to:

- Review generated code
- Validate security
- Ensure correct architecture
- Understand the generated logic

Copilot works best as a **coding assistant**, not as a replacement for developer knowledge.
