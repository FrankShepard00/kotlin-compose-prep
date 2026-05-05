package ejercicios5Abril

/*
Ejercicio 4 - Procesar lista de productos
Escribe como función de expresión una función que reciba
una lista de precios (Double) y retorne la suma de solo
los precios mayores a 100.0
*/

fun sumarMayores(precios: List<Double>) = precios.filter { it > 100.0 }.sum()

fun main() {
    println(sumarMayores(listOf(50.0, 150.0, 200.0, 80.0, 120.0)))  // 470.0
}