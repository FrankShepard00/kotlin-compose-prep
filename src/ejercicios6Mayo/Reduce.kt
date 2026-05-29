package ejercicios6Mayo

fun main() {
    val concatenado = listOf<String>("Kotlin", "es", "genial!").reduce { acc, s -> "$acc $s" }

    println(concatenado)

    val precios = listOf(50.0, 120.0, 35.0, 200.0)
    val total = precios.reduce { acc, d -> acc + d }
    println("Total: $total")
}