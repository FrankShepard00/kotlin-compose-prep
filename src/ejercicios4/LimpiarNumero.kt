package ejercicios4

/*
Ejercicio 6 - Limpiar número de teléfono
La función recibe un String con un número de teléfono
que puede tener espacios, guiones y paréntesis, y debe
retornar solo los dígitos.

- Recibe: String
- Devuelve: String con solo los dígitos
*/

fun limpiarTelefono(telefono: String) = telefono.filter { it.isDigit() }


fun main() {
    println(limpiarTelefono("+52 (222) 123-4567"))  // 522221234567
    println(limpiarTelefono("555.123.4567"))         // 5551234567
    println(limpiarTelefono("(800) 123 4567"))       // 8001234567
}