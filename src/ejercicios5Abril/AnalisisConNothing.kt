package ejercicios5Abril

/*
Ejercicio 4 - Análisis de flujo con Nothing
Escribe una función que use Elvis con error() para
garantizar que un valor no sea null.
El compilador debe inferir que después del Elvis,
la variable es non-nullable.

- Recibe: usuario: Usuario?
- Retorna: String (el email en mayúsculas)
- Si usuario es null → error("Usuario requerido")
- Si email es null  → error("Email requerido")
*/

data class Usuario4(val nombre: String, val email: String?)

fun obtenerEmail(usuario: Usuario4?): String {
    if (usuario == null) error("Usuario requerido")
    if (usuario.email == null) error("Email requerido")
    return usuario.email.uppercase()
}

fun main() {
    val u = Usuario4("Ana", "ana@email.com")
    println(obtenerEmail(u))    // ANA@EMAIL.COM
    // obtenerEmail(null)        // Lanza: Usuario requerido
    obtenerEmail(Usuario4("Carlos", null))  // Lanza: Email requerido
}