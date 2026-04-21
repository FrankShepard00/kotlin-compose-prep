package ejercicios5Abril

/*
Ejercicio 4 - Clasificar número
Escribe una función de expresión con when que clasifique
un número según su valor.

- Negativo  → "Negativo"
- 0         → "Cero"
- 1..9      → "Pequeño"
- 10..99    → "Mediano"
- Cualquier otro → "Grande"

- Recibe: n: Int
- Retorna: String
- Usa función de expresión (sin return ni llaves)
*/

fun clasificar(n: Int) = when {
    n < 0 -> "Negativo"
    n == 0 -> "Cero"
    n in 1..9 -> "Pequeño"
    n in 10..99 -> "Mediano"
    else -> "Grande"
}


fun main() {
    println(clasificar(-5))  // Negativo
    println(clasificar(0))   // Cero
    println(clasificar(7))   // Pequeño
    println(clasificar(50))  // Mediano
    println(clasificar(200)) // Grande
}