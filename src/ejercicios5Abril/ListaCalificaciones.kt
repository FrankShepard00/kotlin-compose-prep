package ejercicios5Abril

/*
Ejercicio 4 - Procesar lista de calificaciones
Reescribe la función eliminando el uso de !! y haciéndola segura.
Si la lista es null o está vacía, retorna 0.0.
*/

// ❌ Versión peligrosa - NO modificar
fun calcularPromedio(calificaciones: List<Double>?): Double {
    return calificaciones!!.sum() / calificaciones!!.size
}

// ✅ Tu versión segura aquí
fun calcularPromedioSeguro(calificaciones: List<Double>?): Double {
    if (calificaciones.isNullOrEmpty()) return 0.0
    return calificaciones.sum() / calificaciones.size
}

fun main() {
    println(calcularPromedioSeguro(listOf(80.0, 90.0, 100.0)))  // 90.0
    println(calcularPromedioSeguro(emptyList()))                  // 0.0
    println(calcularPromedioSeguro(null))                         // 0.0
}