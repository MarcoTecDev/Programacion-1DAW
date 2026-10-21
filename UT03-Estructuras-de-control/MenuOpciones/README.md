# 🧩 MenuOpciones

Programa con un menú de ventanas (`JOptionPane`) que se repite hasta que el usuario elige salir.

## 📝 Enunciado

Crear un programa con un menú que se repita hasta elegir la opción 6:

1. **Comprobar hora** → dice si una hora con formato `HH:MM:SS` es válida.
2. **Día de la semana** → pide un número del 1 al 7 y muestra el día (`1` → Lunes...).
3. **Número primo** → pide un número y dice si es primo.
4. **Caracteres de un nombre** → pide un nombre y muestra cuántos caracteres tiene.
5. **Vocales, consonantes y espacios** → pide una frase y los cuenta.
6. **Salir** → pregunta si de verdad quieres salir antes de cerrar.

Si la opción no es válida, se vuelve a pedir.

## 🧠 Qué se practica

| Concepto | Dónde se usa |
|----------|--------------|
| `do-while` | El menú se muestra al menos una vez y se repite hasta salir |
| `switch` con `char` | Elegir la opción del menú y el día de la semana |
| `for` | Comprobar que lo escrito son cifras y buscar divisores del primo |
| `charAt()` y `length()` | Recorrer textos y comprobar la hora letra a letra |
| Operador `%` | Saber si una división es exacta |
| `break` | Salir del bucle en cuanto se sabe que no es primo |

El programa **no se cierra con error** si el usuario pulsa Intro sin escribir nada, pulsa Cancelar o escribe letras donde va un número.

## ▶️ Ejecutar

Abrir la carpeta con NetBeans y pulsar **Run**, o desde la terminal:

```bash
mvn compile exec:java
```
