package ejercicios6Mayo

/*
Ejercicio 3 - Ordenar empleados
Dada una lista de empleados, ordénalos primero por departamento
(alfabético ascendente) y luego por salario (descendente).
- Recibe: List<Empleado>
- Retorna: List<Empleado> ordenada
- Usar sortedWith y compareBy
*/

data class Empleado2(val nombre: String, val depto: String, val salario: Double)

fun ordenarEmpleados(empleados: List<Empleado2>): List<Empleado2> {
    return empleados.sortedWith(compareBy<Empleado2> { it.depto }.thenByDescending { it.salario })
}

fun main() {
    val empleados = listOf(
        Empleado2("Carlos", "Tech", 45000.0),
        Empleado2("Ana", "HR", 35000.0),
        Empleado2("María", "Tech", 45000.0),
        Empleado2("Luis", "HR", 38000.0)
    )
    ordenarEmpleados(empleados).forEach { println("${it.depto} | ${it.nombre} | ${it.salario}") }
    // HR   | Luis   | 38000.0
    // HR   | Ana    | 35000.0
    // Tech | Carlos | 45000.0
    // Tech | María  | 45000.0
}