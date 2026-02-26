# 📘 Módulo 3 – Excepciones, Flujos y Patrones de Diseño

## 📌 Descripción General

Este proyecto corresponde a la entrega semanal del **Módulo 3**, donde se desarrollan seis ejercicios enfocados en el manejo avanzado de excepciones, clases internas, principios de diseño orientado a objetos y la implementación de patrones de diseño en Java.

El objetivo principal es aplicar buenas prácticas de programación, garantizar robustez mediante el manejo adecuado de errores y estructurar soluciones siguiendo principios sólidos de diseño.

---

## 🧩 Temas Cubiertos

* Tipos de excepciones
* `try-catch-finally`
* Multi-catch
* `try-with-resources`
* Excepciones personalizadas
* Clases anidadas, internas y anónimas
* Enums
* Interfaces funcionales
* Principios de diseño:

  * JavaBeans
  * Relación *is-a*
  * Relación *has-a*
* Patrones de diseño:

  * Singleton
  * Builder
  * Factory
  * Immutable Objects
* Inyección de dependencias

---

# 📚 Ejercicios Desarrollados

## ✅ Ejercicio 1 – Manejo básico de Excepciones

* Uso de `try-catch-finally`
* Validación de datos
* Captura de errores comunes

---

## ✅ Ejercicio 2 – Sistema Bancario con Excepciones Personalizadas

* Creación de excepciones propias
* Uso de `try-with-resources`
* Implementación de `AutoCloseable`
* Registro de transacciones

Patrones aplicados:

* **Singleton** (TransactionLog)

---

## ✅ Ejercicio 3 – Clases Internas y Anidadas

* Static nested class
* Inner class
* Clase anónima
* Organización lógica del código

---

## ✅ Ejercicio 4 – Enums e Interfaces Funcionales

* Uso de `enum` para representar estados
* Expresiones lambda
* Interfaces funcionales personalizadas

---

## ✅ Ejercicio 5 – Principios de Diseño (POO)

* Implementación de JavaBeans
* Relación *is-a* (herencia)
* Relación *has-a* (composición)
* Diseño orientado a objetos correctamente estructurado

---

## ✅ Ejercicio 6 – Patrones de Diseño y Dependency Injection

Patrones implementados:

### 🔹 Singleton

Garantiza una única instancia compartida en la aplicación.

### 🔹 Builder

Permite construir objetos complejos paso a paso.

### 🔹 Factory

Encapsula la creación de objetos.

### 🔹 Immutable Object

Objetos inmutables mediante:

* Atributos `final`
* Sin setters
* Constructor completo

### 🔹 Dependency Injection

Inyección de dependencias mediante constructor para reducir acoplamiento.

---

# 🧠 Diagrama de Clases (Simplificado)

```
Cuenta
 ├── depositar()
 ├── retirar()
 └── transferir()

TransactionLog (Singleton)
 └── log()

Usuario (JavaBean)

Animal (abstract)
 ├── Perro
 └── Gato

Producto (Builder Pattern)

DocumentoFactory (Factory Pattern)
 ├── crearPDF()
 └── crearWord()
```

---

# ⚙️ Manejo de Excepciones

* Validación de montos inválidos
* Control de fondos insuficientes
* Multi-catch
* Mensajes descriptivos
* Cierre automático de recursos

---
