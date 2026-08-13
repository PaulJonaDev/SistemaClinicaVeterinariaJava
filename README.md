# 🐾 VetCare - Sistema de Clínica Veterinaria (Java)

Sistema diseñado para demostrar el uso correcto de **Herencia, Clases Abstractas, Interfaces y Polimorfismo puro** en Java, sin utilizar `casting` ni `instanceof`.

---

## 📐 Mapa del Sistema

| Clase / Interfaz | Herencia / Contrato | Tipo | Propósito |
| :--- | :--- | :--- | :--- |
| **`Animal`** | — | **Abstracta** | Base compartida (`nombre`, `edad`, `dueño`). Exige implementar `calcularCostoConsulta()`. |
| **`Perro`** | `extends Animal implements Vacunable, Asegurable` | Concreta[cite: 1] | Consulta por edad[cite: 1] + prima de seguro[cite: 1] + control de vacunas[cite: 1]. |
| **`Gato`** | `extends Animal implements Vacunable, Asegurable`[cite: 1] | Concreta[cite: 1] | Consulta fija[cite: 1] + prima por esterilización[cite: 1] + vacunas[cite: 1]. |
| **`Ave`** | `extends Animal`[cite: 1] | Concreta[cite: 1] | Consulta según su peso en gramos[cite: 1]. |
| **`Clinica`** | `implements Asegurable`[cite: 1] | Concreta[cite: 1] | Entidad institucional asegurable fuera de la jerarquía de `Animal`[cite: 1]. |

---

## 📂 Estructura del Proyecto

```text
src/
├── interfaces/   # Asegurable.java | Vacunable.java
├── model/        # Animal.java | Perro.java | Gato.java | Ave.java | Clinica.java
└── Main.java     # Suite de pruebas polimórficas (Animal[] y Asegurable[])