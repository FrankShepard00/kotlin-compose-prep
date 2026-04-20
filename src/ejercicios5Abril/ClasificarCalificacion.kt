package ejercicios5Abril

/*
Ejercicio 2 - Clasificar calificación
Escribe una función que reciba una nota (Int) y retorne
su clasificación usando when con rangos.

- 90..100 → "Excelente"
- 80..89  → "Muy bueno"
- 70..79  → "Bueno"
- 60..69  → "Suficiente"
- 0..59   → "Reprobado"
- Cualquier otro → "Nota inválida"

- Recibe: nota: Int
- Retorna: String
*/

fun clasificarNota(nota: Int): String {
    return when (nota) {
        in 90..100 -> "Excelente"
        in 80..89 -> "Muy bueno"
        in 70..79 -> "Bueno"
        in 60..69 -> "Suficiente"
        in 0..59 -> "Reprobado"
        else -> "Nota invalida"
    }
}

fun main() {
    println(clasificarNota(95))   // Excelente
    println(clasificarNota(83))   // Muy bueno
    println(clasificarNota(55))   // Reprobado
    println(clasificarNota(110))  // Nota inválida
}