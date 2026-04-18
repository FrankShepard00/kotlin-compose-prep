package ejercicios5Abril

/*
Ejercicio 4 - Buscar configuración
Escribe una función que busque un valor en el mapa de configuración.
Si la clave no existe (retorna null), lanza una IllegalArgumentException
con el mensaje "Configuración no encontrada: [clave]".

- Recibe: clave: String
- Retorna: String (el valor encontrado)
- Usa el operador Elvis con throw
*/

val configuracion = mapOf(
    "HOST" to "localhost",
    "PORT" to "8080",
    "ENV" to "production"
)

fun obtenerConfiguracion(clave: String) =
    configuracion[clave] ?: throw IllegalArgumentException("Configuración no encontrada: $clave")


fun main() {
    println(obtenerConfiguracion("HOST"))   // localhost
    println(obtenerConfiguracion("PORT"))   // 8080
    // obtenerConfiguracion("DB")  // Lanza IllegalArgumentException: Configuración no encontrada: DB
}