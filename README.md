<div align="center">

# ☕ Programación · 1º DAW

**Ejercicios y proyectos del módulo de Programación del ciclo de Desarrollo de Aplicaciones Web**

![Java](https://img.shields.io/badge/Java-25-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Maven](https://img.shields.io/badge/Maven-C71A36?style=for-the-badge&logo=apachemaven&logoColor=white)
![NetBeans](https://img.shields.io/badge/NetBeans-1B6AC6?style=for-the-badge&logo=apachenetbeanside&logoColor=white)
![Curso](https://img.shields.io/badge/Curso-2026%2F27-2EA44F?style=for-the-badge)

</div>

---

## 📖 Sobre este repositorio

Aquí voy guardando los ejercicios que hago en el módulo de **Programación** de 1º de DAW, ordenados por unidades del temario.
Cada ejercicio es un proyecto **Maven** independiente que se puede abrir directamente con NetBeans.

## 🗂️ Temario

| Unidad | Tema | Contenidos |
|:------:|------|------------|
| **UT02** | Estructura y elementos de un programa Java | Variables, tipos primitivos, operadores, `String`, entrada y salida con `JOptionPane` |
| **UT03** | [Estructuras de control](UT03-Estructuras-de-control) | `if`, `switch`, `while`, `do-while`, `for`, `break` y `continue` |

## 🧩 Ejercicios

| Ejercicio | Unidad | Descripción |
|-----------|:------:|-------------|
| [MenuOpciones](UT03-Estructuras-de-control/MenuOpciones) | UT03 | Menú con ventanas que comprueba horas, dice el día de la semana, detecta números primos y cuenta caracteres, vocales y consonantes |

## 📁 Estructura

```
Programacion-1DAW/
├── README.md
└── UT03-Estructuras-de-control/
    └── MenuOpciones/
        ├── pom.xml
        ├── README.md
        └── src/main/java/daw/bingo/MenuOpciones.java
```

## ▶️ Cómo ejecutar un ejercicio

**Con NetBeans**

1. Clona el repositorio o descárgalo como ZIP.
2. `File` → `Open Project` y elige la carpeta del ejercicio (por ejemplo `MenuOpciones`).
3. Pulsa **Run** (F6).

**Desde la terminal**

```bash
cd UT03-Estructuras-de-control/MenuOpciones
mvn compile exec:java
```

> Necesitas tener instalado el **JDK 25** y **Maven**.

---

<div align="center">

Hecho por [MarcoTecDev](https://github.com/MarcoTecDev) mientras aprendo a programar 🚀

</div>
