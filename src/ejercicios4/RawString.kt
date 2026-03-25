package ejercicios4

/*
Ejercicio 7 - Raw string con interpolación
Crea un raw string que imprima este recibo usando
las variables dadas. Usa trimIndent().

Variables:
- cliente = "Carlos"
- total = 1500.0
- fecha = "24/03/2026"

Salida esperada:
*** Recibo ***
Cliente: Carlos
Fecha: 24/03/2026
Total: $1500.0
*/

fun main() {
    val cliente = "Carlos"
    val total = 1500.0
    val fecha = "24/03/2026"

    val recibo = """
        *** Recibo ***
        Cliente: $cliente
        Fecha: $fecha
        Total: $$total
    """.trimIndent()
    println(recibo)

    val precio = 100

    println("El precio es $$precio")
    println("Cuesta: $$$precio dólares")
}