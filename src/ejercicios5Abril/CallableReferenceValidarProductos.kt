package ejercicios5Abril

/*
Ejercicio 4 - Validar productos
Tienes tres funciones de validación. Úsalas como
callable references en una lista de validaciones
y aplícalas con all.

- Recibe: producto: Producto
- Retorna: Boolean (true si pasa todas las validaciones)
*/

data class ProductoCallRef(val nombre: String, val precio: Double, val stock: Int)

fun nombreValido(p: ProductoCallRef): Boolean = p.nombre.isNotBlank()
fun precioValido(p: ProductoCallRef): Boolean = p.precio!! > 0
fun stockValido(p: ProductoCallRef): Boolean = p.stock!! >= 0

fun validarProducto(producto: ProductoCallRef): Boolean {
    val validaciones = listOf(::nombreValido, ::precioValido, ::stockValido)
    return validaciones.all { it(producto) }
}

fun main() {
    println(validarProducto(ProductoCallRef("Laptop", 15000.0, 5)))  // true
    println(validarProducto(ProductoCallRef("", 15000.0, 5)))        // false
    println(validarProducto(ProductoCallRef("Laptop", -1.0, 5)))     // false
}