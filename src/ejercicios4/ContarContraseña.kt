package ejercicios4

/*
Ejercicio 3 - Validar contraseña con count
La función recibe un String y debe verificar que cumpla:
- Longitud mínima de 8 caracteres
- Al menos 2 dígitos
- Al menos 1 mayúscula

- Recibe: String
- Devuelve: Boolean
*/

fun esPasswordValida(password: String): Boolean {
    return password.count() >= 8 &&
            password.count { it.isDigit() } >= 2 &&
            password.count { it.isUpperCase() } >= 1
}

fun main() {
    println(esPasswordValida("Kotlin25!"))   // true
    println(esPasswordValida("Kotlin2!"))    // false (solo 1 dígito)
    println(esPasswordValida("kotlin25!"))   // false (sin mayúscula)
    println(esPasswordValida("Ko25"))        // false (menos de 8)
}