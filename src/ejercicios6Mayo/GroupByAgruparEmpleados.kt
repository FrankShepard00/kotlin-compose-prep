package ejercicios6Mayo

/*
Ejercicio 9 - Agrupar empleados
Dado el listado de empleados, genera:
1. Un mapa agrupado por departamento
2. Imprime cuántos empleados hay en cada departamento
3. Imprime los nombres del departamento "Ingeniería"
*/

data class Empleado(val nombre: String, val departamento: String, val salario: Double)

fun main() {
    val empleados = listOf(
        Empleado("Ana", "Ingeniería", 45000.0),
        Empleado("Carlos", "Marketing", 35000.0),
        Empleado("María", "Ingeniería", 50000.0),
        Empleado("Pedro", "Marketing", 32000.0),
        Empleado("Laura", "Ingeniería", 48000.0)
    )

    val grupoPorDepartamento = empleados.groupBy { it.departamento }
    grupoPorDepartamento.forEach { (depto, empleados) -> println("$depto: ${empleados.map { it.nombre }}") }

    println()

    val empleadosPorDepartamento = empleados.groupBy { it.departamento }
    empleadosPorDepartamento.forEach { (departamento, empleados) -> println("$departamento: ${empleados.size}") }

    println()
    println("Ingenieros")
    empleados
        .filter { it.departamento == "Ingeniería" }
        .forEach { println(it.nombre) }
}