package ejercicios4

/*
Ejercicio 5 - Agregar comentarios apropiados
El siguiente código funciona, pero está sin documentar.
Agrega comentarios de una línea en los lugares correctos:
- Uno explicando qué hace la función
- Uno explicando la validación
- Un TODO para algo pendiente
*/

// Registra al usuario siempre y cuando sea mayor de edad
fun registrarUsuario(email: String, edad: Int): String {
    // Valida que el usuario sea mayor de edad.
    if (edad < 18) {
        return "Acceso denegado"
    }
    // TODO: Validar correo
    return "Usuario registrado: $email"
}

fun main() {
    println(registrarUsuario("ana@gmail.com", 25))
    println(registrarUsuario("carlos@gmail.com", 16))
}