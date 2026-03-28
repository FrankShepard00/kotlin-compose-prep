package ejercicios4

/*
Ejercicio 4 - Validar usuario
Escribe una función que valide si un usuario puede registrarse.
Condiciones:
- Edad entre 18 y 120
- Email debe contener "@" y "."
- Debe haber aceptado términos
- Recibe: edad Int, email String, aceptoTerminos Boolean
- Devuelve: Boolean
*/

fun validarUsuario(edad: Int, mail: String, aceptoTerminos: Boolean): Boolean {
    return edad in 18..120
            && mail.contains('@')
            && mail.contains('.')
            && aceptoTerminos
}

fun main() {
    println(validarUsuario(25, "ana@email.com", true))   // true
    println(validarUsuario(15, "ana@email.com", true))   // false
    println(validarUsuario(25, "emailinvalido", true))   // false
    println(validarUsuario(25, "ana@email.com", false))  // false

    var mensaje = "Hola"
    mensaje += "!"
    println(mensaje)

    val numeros = mutableListOf(1, 2, 3, 4, 5)
    println(numeros::class.simpleName)
    numeros += listOf(1, 2)
    println(numeros)
    println(numeros::class.simpleName)
    numeros -= 2
    println(numeros)
    println(numeros::class.simpleName)

    println("---")


}