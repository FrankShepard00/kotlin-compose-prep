package ejercicios4

fun main() {
    val nombres = listOf("Ana", "Carlos", "María")
    val numeros = listOf(1, 2, 3, 4, 5)

    println(nombres.joinToString())
    println(nombres.joinToString(" - "))
    println(nombres.joinToString(""))
    println(
        numeros.joinToString(
            separator = " + ",
            prefix = "(",
            postfix = ") = ${numeros.sum()}"
        )
    )

    val numeros2 = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val palabras = listOf("hola", "mundo", "kotlin")

    println(numeros2.joinToString(limit = 3))
    println(numeros2.joinToString(limit = 3, truncated = "y ${numeros2.size - 3} más"))
    println(palabras.joinToString { it.uppercase() })
}


// 1, 2, 3, ...
// 1, 2, 3, y 7 más
// HOLA, MUNDO, KOTLIN

// Ana, Carlos María
// Ana - Carlos - María
// AnaCarlosMaría
//(1 + 2 + 3 + 4 + 5) = 15

