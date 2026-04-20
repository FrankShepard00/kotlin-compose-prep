package ejercicios5Abril

/*
Ejercicio 4 - Validar acceso
Escribe una función que valide el acceso de un usuario.
Usa when SIN argumento ya que las condiciones son independientes.

- usuario vacío → "Error: usuario vacío"
- password vacío → "Error: password vacío"
- usuario == "admin" && password == "1234" → "Acceso concedido"
- usuario == "admin" → "Password incorrecto"
- cualquier otro → "Usuario no encontrado"

- Recibe: usuario: String, password: String
- Retorna: String
*/

fun validarAcceso(usuario: String, password: String): String {
    return when {
        usuario.isEmpty() -> "Error: usuario vacío"
        password.isEmpty() -> "Error: password vacío"
        usuario == "admin" && password == "1234" -> "Acceso concedido"
        usuario == "admin" -> "Password incorrecto"
        else -> "Usuario no encontrado"
    }
}


fun main() {
    println(validarAcceso("admin", "1234"))   // Acceso concedido
    println(validarAcceso("admin", "wrong"))  // Password incorrecto
    println(validarAcceso("", "1234"))        // Error: usuario vacío
    println(validarAcceso("otro", "1234"))    // Usuario no encontrado
}