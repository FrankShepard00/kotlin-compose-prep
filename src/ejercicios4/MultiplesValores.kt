package ejercicios4

/*
Ejercicio 6 - Formatear múltiples valores
La función recibe nombre (String), edad (Int) y promedio (Double)
y debe retornar un String con el siguiente formato exacto:
"Estudiante: Ana, Edad: 25, Promedio: 9.57"

- Usa format con múltiples especificadores en un solo llamado
- El promedio debe tener exactamente 2 decimales
*/

fun formatearEstudiante(nombre: String, edad: Int, promedio: Double): String {
    return String.format("Estudiante: %s, Edad: %d, Promedio: %.2f", nombre, edad, promedio)
}

fun main() {
    println(formatearEstudiante("Ana", 25, 9.567))   // Estudiante: Ana, Edad: 25, Promedio: 9.57
    println(formatearEstudiante("Carlos", 19, 8.1))  // Estudiante: Carlos, Edad: 19, Promedio: 8.10
}