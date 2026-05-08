package ejercicios6Mayo

/*
Ejercicio 8 - Function type con receiver
Escribe una función que reciba un StringBuilder con receiver
y construya un mensaje formateado.

- Recibe: accion: StringBuilder.() -> Unit
- Crea un StringBuilder, aplica la acción y retorna el String
*/

fun construirMensaje(accion: StringBuilder.() -> Unit): String {
    val sb = StringBuilder()
    sb.accion()
    return sb.toString()
}

fun main() {
    val mensaje = construirMensaje {
        append("Hola, ")
        append("Kotlin")
        append("!")
    }
    println(mensaje)  // Hola, Kotlin!
}