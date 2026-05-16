package ejercicios6Mayo

/*
Ejercicio 2 - Acceso a valores
Dado el siguiente mapa de productos y precios, realiza:

1. Accede al precio de "Teclado" con []
2. Accede a un producto que no existe con []
3. Usa getOrDefault para "Monitor" con valor 0.0
4. Verifica si "Mouse" existe como clave
5. Imprime todas las claves y todos los valores por separado
*/

fun main() {
    val precios = mapOf(
        "Laptop" to 15000.0,
        "Mouse" to 300.0,
        "Teclado" to 800.0
    )

    precios.forEach { producto, costo -> println("$producto tiene un valor de $costo") }
    println()
    for (nombre in precios) {
        println(nombre)
    }


}