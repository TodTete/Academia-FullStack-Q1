# Spring Boot E‑Commerce API (Bootcamp Project)

## Descripción general

Este proyecto es una API REST desarrollada con **Spring Boot** que simula el backend de un sistema básico de comercio electrónico.

El objetivo del proyecto es practicar y demostrar conocimientos fundamentales de desarrollo backend con Java, incluyendo:

* Arquitectura por capas
* Desarrollo de APIs REST
* Uso de Spring Boot
* Persistencia con Spring Data JPA
* Manejo de excepciones
* Validación de datos
* Manejo de relaciones entre entidades
* Gestión de pedidos con control de stock

El sistema permite:

* Administrar productos
* Administrar clientes
* Crear pedidos
* Controlar el stock de productos
* Manejar errores de forma estructurada

---

# Tecnologías utilizadas

* Java 17+
* Spring Boot
* Spring Web
* Spring Data JPA
* Lombok
* Maven
* Base de datos (H2 / MySQL / PostgreSQL compatible)

---

# Arquitectura del proyecto

El proyecto sigue una arquitectura **por capas**, lo cual es una práctica estándar en aplicaciones backend.

Capas principales:

1. Controller
2. Service
3. Repository
4. Model (Entidades)
5. DTO
6. Exception

Flujo general:

Client → Controller → Service → Repository → Database

---

# Estructura del proyecto

```
src/main/java/com/bootcamp

├── controller
│   ├── ProductController.java
│   ├── CustomerController.java
│   └── OrderController.java
│
├── service
│   ├── ProductService.java
│   ├── CustomerService.java
│   └── OrderService.java
│
├── repository
│   ├── ProductRepository.java
│   ├── CustomerRepository.java
│   └── OrderRepository.java
│
├── model
│   ├── Product.java
│   ├── Customer.java
│   ├── Order.java
│   └── OrderItem.java
│
├── dto
│   ├── ProductRequest.java
│   ├── ProductResponse.java
│   └── ErrorResponse.java
│
├── exception
│   ├── ResourceNotFoundException.java
│   └── GlobalExceptionHandler.java
│
└── BootcampApplication.java
```

---

# Modelo de datos

## Product

Representa un producto disponible en el sistema.

Campos principales:

* id
* name
* price
* description
* category
* stock
* createdAt

Responsabilidades:

* Representar productos del catálogo
* Controlar disponibilidad mediante el campo stock

---

## Customer

Representa un cliente del sistema.

Campos comunes:

* id
* name
* email
* createdAt

---

## Order

Representa un pedido realizado por un cliente.

Campos:

* id
* customer
* items
* total
* createdAt

Relaciones:

* Un cliente puede tener múltiples pedidos
* Un pedido puede tener múltiples items

---

## OrderItem

Representa un producto dentro de un pedido.

Campos:

* id
* product
* quantity
* price
* order

Responsabilidades:

* Asociar productos a un pedido
* Guardar el precio al momento de la compra

---

# Controladores (Controllers)

Los controllers exponen los endpoints REST de la API.

Todos los endpoints siguen la convención:

```
/api/v1/
```

---

# ProductController

Endpoints principales:

## Obtener todos los productos

GET

```
/api/v1/products
```

Respuesta:

```
200 OK
```

---

## Obtener producto por ID

GET

```
/api/v1/products/{id}
```

Respuesta:

```
200 OK
404 NOT FOUND
```

---

## Crear producto

POST

```
/api/v1/products
```

Body:

```
{
  "name": "Laptop",
  "price": 1200,
  "description": "Laptop profesional",
  "category": "Electronics",
  "stock": 10
}
```

Respuesta:

```
201 CREATED
400 BAD REQUEST
```

---

## Actualizar producto

PUT

```
/api/v1/products/{id}
```

---

## Eliminar producto

DELETE

```
/api/v1/products/{id}
```

---

# CustomerController

Permite administrar clientes del sistema.

Endpoints comunes:

GET /api/v1/customers

GET /api/v1/customers/{id}

POST /api/v1/customers

PUT /api/v1/customers/{id}

DELETE /api/v1/customers/{id}

---

# OrderController

Permite crear pedidos y consultarlos.

## Crear pedido

POST

```
/api/v1/orders
```

Ejemplo:

```
{
  "customer": {
    "id": 1
  },
  "items": [
    {
      "product": { "id": 2 },
      "quantity": 1
    },
    {
      "product": { "id": 3 },
      "quantity": 2
    }
  ]
}
```

El sistema automáticamente:

* Valida que el cliente exista
* Valida que el producto exista
* Verifica stock
* Reduce stock
* Calcula el total del pedido

---

## Obtener pedido

GET

```
/api/v1/orders/{id}
```

---

# Manejo de excepciones

El proyecto incluye un sistema global de manejo de errores.

Clase principal:

```
GlobalExceptionHandler
```

Utiliza:

```
@RestControllerAdvice
```

Esto permite interceptar errores de todos los controllers.

---

# Tipos de errores manejados

## ResourceNotFoundException

Se utiliza cuando un recurso no existe en la base de datos.

Ejemplo:

* Producto no encontrado
* Cliente no encontrado
* Pedido inexistente

Respuesta:

```
404 NOT FOUND
```

Ejemplo JSON:

```
{
  "timestamp": "2026-01-01T12:00:00",
  "error": "Resource Not Found",
  "message": "Product not found"
}
```

---

## IllegalArgumentException

Se utiliza cuando la petición del cliente es inválida.

Ejemplo:

* Producto duplicado
* Datos inválidos

Respuesta:

```
400 BAD REQUEST
```

---

## Exception

Manejo genérico de errores inesperados.

Respuesta:

```
500 INTERNAL SERVER ERROR
```

---

# Lógica de negocio

La lógica de negocio se encuentra en la capa **Service**.

Ejemplo de responsabilidades:

ProductService

* Crear productos
* Validar duplicados
* Transformar entidades a DTO

OrderService

* Crear pedidos
* Validar stock
* Reducir inventario
* Calcular total

---

# DTO (Data Transfer Objects)

Los DTO se utilizan para separar:

* Modelo de base de datos
* Respuestas de la API

Ventajas:

* Seguridad
* Flexibilidad
* Control de datos expuestos

---

# Configuración del proyecto

## Clonar repositorio

```
git clone https://github.com/usuario/proyecto-spring-boot-ecommerce
```

---

## Entrar al proyecto

```
cd proyecto-spring-boot-ecommerce
```

---

## Ejecutar proyecto

```
mvn spring-boot:run
```

---

# Base de datos

Puede utilizar:

* H2
* MySQL
* PostgreSQL

Ejemplo configuración application.properties:

```
spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=

spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
spring.jpa.hibernate.ddl-auto=update

spring.h2.console.enabled=true
```

---

# Ejemplo de flujo completo

1 Crear cliente

2 Crear productos

3 Crear pedido

4 Sistema valida stock

5 Sistema calcula total

6 Pedido guardado

---

# Posibles mejoras futuras

* Autenticación JWT
* Seguridad con Spring Security
* Paginación
* Swagger / OpenAPI
* Docker
* Tests unitarios
* Tests de integración

---

# Autor
@TodTete Ricardo Vallejo S.
Proyecto desarrollado como práctica de backend con Spring Boot.

Objetivo: consolidar conocimientos para desarrollo backend profesional.
