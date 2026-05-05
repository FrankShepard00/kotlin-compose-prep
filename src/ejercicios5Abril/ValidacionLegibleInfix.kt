package ejercicios5Abril

/*
Ejercicio 2 - Validación legible
Crea dos funciones infix para validar un usuario
de forma legible como lenguaje natural.

- Usuario.tiene(edad: Int): Boolean → compara la edad
- Usuario.seLlama(nombre: String): Boolean → compara el nombre

Úsalas en un if combinado con &&
*/

data class UsuarioInfix(val nombre: String, val edad: Int)

infix fun UsuarioInfix.seLlama(nombre: String): Boolean = nombre == this.nombre
infix fun UsuarioInfix.tiene(edad: Int): Boolean = edad == this.edad

fun main() {
    val usuario = UsuarioInfix("Ana", 25)

    if (usuario seLlama "Ana" && usuario tiene 25) {
        println("Usuario válido")  // Usuario válido
    }
}