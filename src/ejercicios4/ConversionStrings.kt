package ejercicios4

fun main() {
    println("36.5".toFloat()) // 36.5 (es un float)
    println("3.141592653589793".toFloat()) // pierde precisión
    println("3.141592653589793".toDouble()) // 3.141592653589793 mismo número
    println("true".toBoolean()) // true
    println("TRUE".toBoolean()) // true
    println("yes".toBoolean()) // false
    println("1".toBoolean()) // false
    println("9999999999".toLong()) // 9999999999
}