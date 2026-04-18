package ejercicios5Abril

/*
Ejercicio 4 - Formatear nombre completo
Escribe una función que reciba nombre y apellido, ambos siempre
presentes, y retorne el nombre completo en mayúsculas.

- Recibe: nombre: String, apellido: String
- Retorna: String (nombre completo en mayúsculas)
- Ejemplo: "ana", "lópez" → "ANA LÓPEZ"
*/

fun formatearNombre(nombre: String, apellido: String) = "${nombre.uppercase()} ${apellido.uppercase()}"


fun main() {
    println(formatearNombre("ana", "lópez"))    // ANA LÓPEZ
    println(formatearNombre("carlos", "pérez")) // CARLOS PÉREZ
}