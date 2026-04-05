package ejercicios4

/*
Ejercicio 4 - Validar formato de fecha
La función recibe un String con una fecha y debe verificar si tiene
el formato correcto: DD-MM-YYYY

- Recibe: un String (ej: "25-01-2024")
- Devuelve: true si tiene exactamente 3 partes separadas por "-",
  donde la primera tiene 2 caracteres, la segunda 2 y la tercera 4
- No necesitas validar si los números son fechas reales, solo el formato
*/

fun esFechaValida(fecha: String): Boolean {
    val partes = fecha.split("-")
    if (partes.size != 3) return false
    return partes[0].length == 2 && partes[1].length == 2 && partes[2].length == 4
}

fun main() {
    println(esFechaValida("25-01-2024"))  // true
    println(esFechaValida("2024-1-25"))   // false
    println(esFechaValida("hola"))        // false
    println(esFechaValida("01-01-24"))    // false
}