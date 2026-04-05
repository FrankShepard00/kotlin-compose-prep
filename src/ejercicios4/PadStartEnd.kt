package ejercicios4

fun main() {
//    val num = "42"
//    val texto = "Kotlin"
//
//    println(num.padStart(6, '0')) // 000042
//    println(num.padEnd(6, '0')) // 420000
//    println(texto.padStart(10, '-')) // ----Kotlin
//    println(texto.padEnd(10, '-')) // Kotlin----
//    println(texto.padStart(3, '-')) // Kotlin

    val texto = "Hola"
    val centrado = texto.padStart(8, '-').padEnd(12, '-')
    println(centrado) // ----Hola----

}