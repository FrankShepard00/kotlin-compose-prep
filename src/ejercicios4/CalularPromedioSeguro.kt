package ejercicios4

/*
Ejercicio 3 - Calcular promedio seguro
La función recibe una lista de Strings que pueden o no ser
números decimales válidos y debe retornar el promedio
de los valores válidos. Si no hay ningún válido, retorna 0.0.

- Recibe: List<String>
- Devuelve: Double con el promedio de los válidos
*/

fun promedioSeguro(datos: List<String>): Double {
    val validos = datos.mapNotNull { it.toDoubleOrNull() }
    return if ( validos.isNotEmpty() ) validos.average() else 0.0
}


fun main() {
    println(promedioSeguro(listOf("10.5", "abc", "20.5", "xyz")))  // 15.5
    println(promedioSeguro(listOf("1.0", "2.0", "3.0")))           // 2.0
    println(promedioSeguro(listOf("abc", "xyz")))                   // 0.0
}