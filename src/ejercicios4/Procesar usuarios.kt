package ejercicios4

/*
Ejercicio 4 - Procesar datos de usuario
Escribe una función llamada `obtenerPerfil` que reciba tres parámetros nullable:
- nombre: String?
- edad: Int?
- ciudad: String?

Debe retornar un String con el formato:
"Nombre: X | Edad: X | Ciudad: X"

Donde:
- Si nombre es null → usar "Desconocido"
- Si edad es null → usar 0
- Si ciudad es null → usar "Sin ciudad"
*/

fun obtenerPerfil(nombre: String?, edad: Int?, ciudad: String?): String {
    return "Nombre: ${nombre ?: "Desconocido"} | Edad: ${edad ?: 0} | Ciudad: ${ciudad ?: "Sin ciudad"}"
}

fun main() {
    println(obtenerPerfil("Ana", 25, "CDMX"))
    // Nombre: Ana | Edad: 25 | Ciudad: CDMX

    println(obtenerPerfil(null, null, "Puebla"))
    // Nombre: Desconocido | Edad: 0 | Ciudad: Puebla

    println(obtenerPerfil(null, null, null))
    // Nombre: Desconocido | Edad: 0 | Ciudad: Sin ciudad
}