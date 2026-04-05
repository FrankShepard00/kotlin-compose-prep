package ejercicios4

fun main() {
    val numero = 42
    val decimal = 3.14159

    println("%d".format(numero)) // 42
    println("%05d".format(numero)) // "00042
    println("%.2f".format(decimal)) // 3.14
    println("%8.2f".format(decimal)) // "    3.14"
    println("%.4f".format(decimal)) // 3.1416


    val texto = "Kotlin"

    println("%s".format(texto)) // "Kotlin"
    println("%10s".format(texto)) // "    kotlin"
    println("%-10s".format(texto)) // "Kotlin    "
    println("%-10s|".format(texto)) // "Kotlin   |"


    val tasa = 0.0875

    println("Tasa: %.1f%%".format(tasa * 100)) // 8.8
    println("Tasa: %.2f%%".format(tasa * 100)) // 8.75


}