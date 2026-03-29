package ejercicios4

/*
Ejercicio 6 - Extraer partes de un email
Dado el email "usuario@ejemplo.com", usa substring()
combinado con indexOf() y lastIndexOf() para imprimir:
- El nombre de usuario (antes del @)
- El dominio (entre @ y el último punto)
- La extensión (después del último punto)
*/

fun emailPartes(email: String): List<String> {
    val nombre = email.substring(0, email.indexOf('@'))
    val dominio = email.substring(email.indexOf('@') + 1, email.lastIndexOf('.'))
    val extension = email.substring(email.lastIndexOf('.') + 1)
    return listOf(nombre, dominio, extension)
}

fun main() {
    val email = "usuario@ejemplo.com"
    // Tu código aquí
    println(emailPartes(email))
}