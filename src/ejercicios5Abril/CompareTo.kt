package ejercicios5Abril

fun main() {
    println("Ana" < "Carlos")    // true  — Ana va antes
    println("Carlos" > "Beatriz") // true — Carlos va después

    val nombres = listOf("Carlos", "Ana", "Beatriz")
    println(nombres.sorted())  // [Ana, Beatriz, Carlos]

    // Ordenar sin distinguir mayúsculas
    val mezclados = listOf("ana", "Carlos", "BEATRIZ")
    println(mezclados.sortedWith(String.CASE_INSENSITIVE_ORDER))
    // [ana, BEATRIZ, Carlos]

    println()
    println("Ana".compareTo("Carlos"))    // -2 (negativo — Ana < Carlos)
    println("Ana".compareTo("Ana"))       // 0        — son iguales
    println("Carlos".compareTo("Ana"))    // 2 (positivo — Carlos > Ana)

    // Ignorando mayúsculas
    println("kotlin".compareTo("Kotlin", ignoreCase = true))  // 0

    println()
    val a = "Kotlin"
    val b = "kotlin"
    val c = "Kotlin"

    println(a == b)
    println(a == c)
    println(a.equals(b, ignoreCase = true))
    println(a.compareTo(c))
    println(a.compareTo(b, ignoreCase = true))
    println("Ana" < "Carlos")
    println()

    val texto1: String = "Hola"
    val texto2: String = "Hola"
    val texto3: String? = null

    println(texto1 == texto2)
    println(texto1 == texto3)
    println(texto3 == null)
    println(texto1?.equals(texto3))
    

}