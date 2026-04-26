package ejercicios5Abril

/*
Ejercicio 2 - Función de validación con Nothing
Escribe una función que retorne Nothing y úsala dentro
de un when para validar el día de la semana.
Si el número es válido (1-7) retorna el nombre del día,
si no, usa tu función para lanzar una excepción.

- Recibe: numero: Int
- Retorna: String
*/

fun fallar(mensaje: String): Nothing {
    throw IllegalArgumentException(mensaje)
}

fun obtenerDia(numero: Int): String {
    return when (numero) {
        1 -> "Lunes"
        2 -> "Martes"
        3 -> "Miércoles"
        4 -> "Jueves"
        5 -> "Viernes"
        6 -> "Sábado"
        7 -> "Domingo"
        else -> fallar("Día inválido")

    }
}

fun main() {
    println(obtenerDia(1))   // Lunes
    println(obtenerDia(5))   // Viernes
    obtenerDia(8)         // Lanza excepción
}