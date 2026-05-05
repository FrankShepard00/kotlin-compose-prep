package ejercicios5Abril

/*
Ejercicio 4 - Validar y ejecutar
Escribe una función inline que valide una condición
antes de ejecutar un bloque. Si la condición falla,
lanza IllegalArgumentException.

- Recibe: condicion: Boolean, mensaje: String, accion: () -> Unit
- Retorna: Unit
*/

inline fun validarYEjecutar(
    condicion: Boolean,
    mensaje: String,
    accion: () -> Unit
) {
    if (condicion) accion() else throw IllegalArgumentException(mensaje)
}

fun main() {
    validarYEjecutar(true, "Edad inválida") {
        println("Ejecutando acción válida")  // Se imprime
    }

    validarYEjecutar(false, "Edad inválida") {
        println("Esto no se imprime")  // Lanza excepción
    }
}