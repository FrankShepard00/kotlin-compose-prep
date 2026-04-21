package ejercicios5Abril

/*
Ejercicio 2 - Validar producto
Escribe una función que valide un producto usando early return.
Retorna un mensaje de error en cuanto encuentre el primer problema,
o "Producto válido" si todo está bien.

Validaciones en orden:
1. nombre vacío → "Error: nombre vacío"
2. precio <= 0  → "Error: precio inválido"
3. stock < 0    → "Error: stock negativo"

- Recibe: nombre: String, precio: Double, stock: Int
- Retorna: String
*/

fun validarProducto(nombre: String, precio: Double, stock: Int): String {
    if (nombre.isEmpty()) return "Error: nombre vacío"
    if (precio <= 0) return "Error: precio inválido"
    if (stock < 0) return "Error: stock negativo"

    return "Producto válido"
}

fun main() {
    println(validarProducto("", 100.0, 5))      // Error: nombre vacío
    println(validarProducto("Laptop", -1.0, 5)) // Error: precio inválido
    println(validarProducto("Laptop", 100.0, -1))// Error: stock negativo
    println(validarProducto("Laptop", 100.0, 5)) //
}