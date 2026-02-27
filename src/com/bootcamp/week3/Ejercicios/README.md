
# 📘 Entrega Semanal – Módulo 4

**Academia FullStack – Q1**

## 📌 Descripción del Proyecto

Este repositorio contiene la resolución de los ejercicios correspondientes al **Módulo 4**, enfocados en el uso avanzado de colecciones, programación funcional con Java, Streams, Generics y concurrencia.

El objetivo principal fue aplicar buenas prácticas de diseño, programación declarativa y procesamiento de datos mediante APIs modernas del lenguaje.

---

## 🧠 Temas Cubiertos

* Colecciones avanzadas: `List`, `Set`, `Map`, `Queue`
* `Generics` (clases, interfaces y métodos genéricos)
* `Comparator` vs `Comparable`
* Expresiones Lambda
* Functional Interfaces
* `Optional`
* Streams:

  * Operaciones intermedias y terminales
  * `groupingBy`, `counting`, `summingDouble`, `averagingDouble`
  * Primitive Streams (`mapToInt`, `mapToDouble`, `mapToLong`)
  * Pipelines avanzados
* Concurrencia:

  * `Thread`
  * `ExecutorService`
  * `CompletableFuture`
  * Manejo de timeouts

---

## 📂 Estructura del Proyecto

```
src/com/bootcamp/week3/Ejercicios
│
├── Uno    → Gestor de Contactos (Collections, Comparable, Optional)
├── Dos    → Caché Genérico con Expiración (Generics, Map, Optional)
├── Tres   → Validador Composable (Lambdas, Functional Interfaces)
├── Cuatro → Análisis de Ventas (Streams Avanzados)
├── Cinco  → Procesamiento de Texto (flatMap, groupingBy, counting)
└── Seis   → Web Scraper Concurrente (ExecutorService, CompletableFuture)
```

Cada ejercicio incluye:

* Implementación completa
* Uso de Streams y Lambdas
* Aplicación de principios de inmutabilidad cuando corresponde
* Pruebas en método `main`

---

## 🚀 Características Técnicas Destacadas

### ✔ Uso de Streams y Lambdas

Procesamiento declarativo de datos con pipelines encadenados y operaciones funcionales.

### ✔ Implementación de Generics

Uso de clases y métodos genéricos para estructuras reutilizables (`ExpiringCache<K,V>`).

### ✔ Programación Funcional

Composición de validadores mediante interfaces funcionales.

### ✔ Concurrencia

Ejecución paralela de tareas con `ExecutorService` y `CompletableFuture`, incluyendo manejo de timeout y agregación de resultados.

---

## 🛠 Requisitos Técnicos

* Java 17 o superior
* IDE recomendado: IntelliJ IDEA
* Compilación estándar con JDK

---

## 📝 Historial de Commits

El repositorio contiene al menos **5 commits descriptivos**, documentando la evolución del desarrollo:

1. Implementación ejercicio 1 – Collections
2. Implementación ejercicio 2 – Generics y Cache
3. Implementación ejercicio 3 – Validadores funcionales
4. Implementación ejercicio 4 y 5 – Streams avanzados
5. Implementación ejercicio 6 – Concurrencia

---
