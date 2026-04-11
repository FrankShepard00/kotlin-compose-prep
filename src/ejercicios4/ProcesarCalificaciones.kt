package ejercicios4

/*
Ejercicio 8 - Procesar calificaciones
La función recibe una lista de strings que pueden o no
ser números válidos y debe:
- Ignorar los valores no numéricos
- Ignorar calificaciones menores a 6
- Retornar las calificaciones válidas transformadas
  al formato "Aprobado: X.X"

- Recibe: List<String>
- Devuelve: List<String>
*/

fun procesarCalificaciones(datos: List<String>): List<String> {
    return datos.mapNotNull { it.toDoubleOrNull() }
        .filter { it >= 6.0 }
        .map { "Aprobado: ${"%.1f".format(it)}"
    }
}

fun main() {
    val datos = listOf("8.5", "abc", "4.0", "9.0", "xyz", "6.5", "3.0")
    println(procesarCalificaciones(datos))
    // [Aprobado: 8.5, Aprobado: 9.0, Aprobado: 6.5]
}