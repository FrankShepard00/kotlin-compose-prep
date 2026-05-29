package ejercicios6Mayo

/*
Ejercicio 5 - Total de ventas con descuento
Dada una lista de montos, usa fold para sumar solo
los montos mayores a 100.0, aplicándoles un 10% de descuento.
- Recibe: List<Double> con los montos
- Retorna: Double con la suma de los montos elegibles con descuento
- Monto elegible: mayor a 100.0
- Descuento: multiplicar el monto por 0.9
*/

fun totalConDescuento(montos: List<Double>): Double {
    return montos.fold(0.0) { acc, d ->
        if (d > 100.0) acc + d * 0.9 else acc
    }
}

fun main() {
    val montos = listOf(50.0, 200.0, 80.0, 300.0, 150.0)
    println(totalConDescuento(montos)) // 585.0
}