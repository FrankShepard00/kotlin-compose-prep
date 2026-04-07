package ejercicios4

fun main() {
    println("3.14".toDoubleOrNull()) //  3.14
    println("abc".toDoubleOrNull()) // null
    println("12,50".toDoubleOrNull()) // null
    println("50".toDoubleOrNull()) // 50.0
    println("abc".toDoubleOrNull() ?: 0.0)  // 0.0
}