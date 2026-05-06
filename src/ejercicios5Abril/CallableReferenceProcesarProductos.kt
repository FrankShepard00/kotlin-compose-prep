package ejercicios5Abril

/*
Ejercicio 2 - Procesar lista de productos
Dada una lista de nombres, crea Productos usando
referencia a constructor, y luego obtén solo los
nombres usando referencia a propiedad.

- Usa ::Producto para crear los objetos
- Usa Producto::nombre para extraer los nombres
*/

data class ProductoCall(val nombre: String)

fun main() {
    val nombres = listOf("Laptop", "Mouse", "Teclado")

    // Crear productos con referencia a constructor
    val productos: List<ProductoCall> = nombres.map(::ProductoCall)

    // Obtener nombres con referencia a propiedad
    val nombresExtraidos: List<String> = productos.map(ProductoCall::nombre)

    println(productos)        // [Producto(nombre=Laptop), ...]
    println(nombresExtraidos) // [Laptop, Mouse, Teclado]
}