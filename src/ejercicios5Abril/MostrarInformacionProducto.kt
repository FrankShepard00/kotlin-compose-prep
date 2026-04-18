package ejercicios5Abril

/*
Ejercicio 2 - Mostrar información de producto
Escribe una función que reciba un Producto y retorne un String
con su información formateada. Los campos precio y stock son
opcionales — usa valores por defecto si son null.

- precio null → 0.0
- stock null → 0

- Recibe: producto: Producto
- Retorna: String con el formato exacto del main
*/

data class Producto(
    val nombre: String,
    val precio: Double?,
    val stock: Int?
)

fun mostrarProducto(producto: Producto): String {
    return "Nombre: ${producto.nombre} | Precio: ${producto.precio ?: 0.0} | Stock: ${producto.stock ?: 0}"
}

fun main() {
    println(mostrarProducto(Producto("Laptop", 15000.0, 5)))
    // Nombre: Laptop | Precio: 15000.0 | Stock: 5

    println(mostrarProducto(Producto("Mouse", null, null)))
    // Nombre: Mouse | Precio: 0.0 | Stock: 0
}