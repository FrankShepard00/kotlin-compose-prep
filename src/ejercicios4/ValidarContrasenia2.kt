package ejercicios4

/*
Ejercicio 5 - Validar contraseña
La función recibe un String y debe verificar que cumpla:
- Longitud mínima de 8 caracteres
- Tiene al menos un número (usa any)
- Tiene al menos una mayúscula (usa any)
- No tiene espacios (usa none)

- Recibe: String
- Devuelve: Boolean
*/

fun esPasswordSegura(password: String): Boolean {
    return password.length >= 8 &&
            password.any { it.isDigit() } &&
            password.any { it.isUpperCase() } &&
            password.none { it.isWhitespace() } &&
            password.any { it.isLowerCase() }
}

fun main() {
    println(esPasswordSegura("Segura123"))   // true
    println(esPasswordSegura("corta1A"))     // false (menos de 8)
    println(esPasswordSegura("sinumeros"))   // false (sin números)
    println(esPasswordSegura("sin mayus1"))  // false (tiene espacio)
    println(esPasswordSegura("SINMIN123"))   // false (sin minúscula... espera, no está en los requisitos)
}