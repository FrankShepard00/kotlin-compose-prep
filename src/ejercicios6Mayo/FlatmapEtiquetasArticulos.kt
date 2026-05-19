package ejercicios6Mayo

/*
Ejercicio 7 - Etiquetas de artículos
Dada la lista de artículos, obtén todas las etiquetas
únicas usadas en todos los artículos combinados.
*/

data class Articulo(val titulo: String, val etiquetas: List<String>)

fun main() {
    val articulos = listOf(
        Articulo("Kotlin Básico", listOf("kotlin", "tutorial", "programación")),
        Articulo("Android Compose", listOf("android", "compose", "kotlin")),
        Articulo("Corrutinas", listOf("kotlin", "async", "programación"))
    )

    // Tu código aquí
    // Resultado: etiquetas únicas sin duplicados

    val etiquetasUnicas = articulos.flatMap { it.etiquetas }.distinct()
    println("Etiquetas únicas: $etiquetasUnicas")
}