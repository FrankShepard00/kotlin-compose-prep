package ejercicios4

/*
Ejercicio 9 - Enmascarar tarjeta
Escribe una función llamada `enmascararTarjeta` que reciba:
- numero: String (16 dígitos)

Y retorne el número con los primeros 12 dígitos reemplazados
por asteriscos, mostrando solo los últimos 4.

Ejemplo: "1234567890123456" → "************3456"
Usa takeLast() y repeat()
*/

fun enmascararTarjeta(numero: String) = "${"*".repeat(12)}${numero.takeLast(4)}"



fun main() {
    println(enmascararTarjeta("1234567890123456"))  // ************3456
    println(enmascararTarjeta("9876543210987654"))  // ************7654
}