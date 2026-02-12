# Bootcamp Java — Semana 1 — Ejercicios Prácticos

**Autor:** Ricardo Vallejo Sánchez  

## Descripción

Este repositorio contiene una colección de ejercicios progresivos desarrollados durante la Semana 1 del Bootcamp de Java.  
El objetivo es reforzar los fundamentos del lenguaje, buenas prácticas de programación orientada a objetos y el uso correcto de estructuras básicas del lenguaje.

Todos los ejercicios compilan correctamente, están organizados por tema y siguen principios básicos de claridad, encapsulamiento y reutilización.

---

## Temas Cubiertos

- Estructura de clases en Java, packages e imports  
- Tipos primitivos vs tipos de referencia  
- Operadores y control de flujo (if, else, loops)  
- Manejo de Strings y modificadores de acceso  
- Uso de StringBuilder  
- Arrays y ArrayList  
- Wrapper classes  
- Constructores y encapsulamiento  
- Herencia  
- Clases abstractas e interfaces  
- Polimorfismo  
- Métodos `equals()`, `hashCode()`, `toString()`  
- Uso de `instanceof`  

---

## Estructura del Proyecto

src/

└── com.bootcamp.week1

  ├── ejercicio1 → Hola Mundo Mejorado
  
  ├── ejercicio2 → Calculadora (Sobrecarga de métodos)
  
  ├── ejercicio3 → Clasificador de Números
  
  ├── ejercicio4 → Manipulador de Strings
  
  ├── ejercicio5 → Gestión de Estudiantes
  
  └── ejercicio6 → Herencia de Vehículos


Cada ejercicio está separado por tema y diseñado para reforzar un conjunto específico de conceptos.

---

## Ejercicios Incluidos

1. **Hola Mundo Mejorado**  
   Variables, tipos primitivos, concatenación y `String.format()`.

2. **Calculadora Básica**  
   Sobrecarga de métodos y manejo de arrays.

3. **Clasificador de Números**  
   Control de flujo, lógica condicional, estadísticas básicas.

4. **Manipulador de Strings**  
   `StringBuilder`, palíndromos, conteo de vocales y construcción de patrones.

5. **Gestión de Estudiantes**  
   Encapsulamiento, `ArrayList`, validación, cálculo de promedio, `toString()`.

6. **Herencia de Vehículos**  
   Interfaces, clases abstractas, herencia, polimorfismo e `instanceof`.

---

## Requisitos Cumplidos

- README con nombre y descripción del proyecto   
- Código compilable sin errores   
- Ejercicios organizados por tema   
- Historial con commits descriptivos   

---

## Compilación y Ejecución

Compilar desde la raíz del proyecto:

```bash
javac -d out src/com/bootcamp/week1/**/*.java
```

Ejecutar un ejercicio:
```bash
java -cp out com.bootcamp.week1.ejercicioX.NombreClase
```

Objetivo Académico
Este repositorio forma parte del proceso de formación en desarrollo Java, con enfoque en:

Pensamiento lógico

Buenas prácticas

Programación orientada a objetos

Preparación para proyectos más complejos
