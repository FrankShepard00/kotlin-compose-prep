package ejercicios4

fun main() {
    val texto = "Hola123Mundo456"

    val soloLetras = texto.filter { it.isLetter() } // HolaMundo
    val soloNumeros = texto.filter { it.isDigit() } // 123456
    val sinNumeros = texto.filterNot { it.isDigit() } // HolaMundo

    println(soloLetras)
    println(soloNumeros)
    println(sinNumeros)



    val numeros = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    val resultado1 = numeros.filter { it > 5 } // [6, 7, 8, 9, 10]
    val resultado2 = numeros.map { it * 2 } // [2, 4, 6, 8, 10 ... etc]
    val resultado3 = numeros.filter { it % 2 == 0 }.map { it * 3 } // [6, 12, 18... etc]

    println(resultado1)
    println(resultado2)
    println(resultado3)

    val texto3 = "Texto".map { it.uppercaseChar() }
    println(texto3)
    println(texto3::class.simpleName)
    val texto3String = texto3.joinToString("")
    println(texto3String)
    println(texto3String::class.simpleName)

}