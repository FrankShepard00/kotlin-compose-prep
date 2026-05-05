package ejercicios5Abril

/*
Ejercicio 2 - Convertir funciones a expresión
Reescribe estas tres funciones como funciones de expresión.
*/

// Versiones tradicionales - NO modificar
//fun esPar(n: Int): Boolean {
//    return n % 2 == 0
//}

//fun saludar(nombre: String): String {
//    return "Hola, $nombre"
//}

//fun clasificar(nota: Int): String {
//    return when {
//        nota >= 90 -> "Excelente"
//        nota >= 70 -> "Bueno"
//        else -> "Reprobado"
//    }
//}

// ✅ Tus versiones de expresión aquí


fun esParEx(n: Int) = n % 2 == 0

fun saludarEx(nombre: String) = "Hola, $nombre"

fun clasificarEx(nota: Int) = when {
    nota >= 90 -> "Excelente"
    nota >= 70 -> "Bueno"
    else -> "Reprobado"
}


fun main() {
    println(esParEx(4))
    println(saludarEx("Frank"))
    println(clasificarEx(85))
}