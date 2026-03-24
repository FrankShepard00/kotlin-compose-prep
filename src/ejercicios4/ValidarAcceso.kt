package ejercicios4

/*
Ejercicio 4 - Validar acceso
Escribe una función que reciba edad e Int y suscripcion String
y retorne true si el usuario puede acceder a contenido premium.
Condiciones:
- Edad mayor o igual a 18
- Suscripción diferente a "gratuita"
*/

fun puedeAcceder(edad: Int, suscripcion: String) = edad >= 18 && suscripcion != "gratuita"

fun main() {
    println(puedeAcceder(25, "premium"))   // true
    println(puedeAcceder(16, "premium"))   // false
    println(puedeAcceder(25, "gratuita"))  // false
}