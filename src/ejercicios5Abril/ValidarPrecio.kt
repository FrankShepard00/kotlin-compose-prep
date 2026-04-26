package ejercicios5Abril

/*
Ejercicio 2 - Validar precio
Escribe una función que valide un precio usando throw.
Usa throw con Elvis para lanzar excepción si el precio es null,
y throw directo si el precio es negativo o cero.

- Recibe: precio: Double?
- Retorna: Double (el precio validado)
- precio null → IllegalArgumentException("Precio requerido")
- precio <= 0  → IllegalArgumentException("Precio debe ser positivo")
*/

fun validarPrecio(precio: Double?): Double {
    if (precio == null) throw IllegalArgumentException("Precio requerido")
    if (precio <= 0) throw IllegalArgumentException("Precio debe ser positivo")
    return precio
}

fun main() {
    println(validarPrecio(100.0))  // 100.0
    //validarPrecio(null)   // Lanza: Precio requerido
    validarPrecio(-5.0)   // Lanza: Precio debe ser positivo
}