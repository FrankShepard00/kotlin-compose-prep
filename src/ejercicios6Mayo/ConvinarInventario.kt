package ejercicios6Mayo


/*
Ejercicio 3 - Combinar inventario
Tienes dos listas y debes combinarlas en objetos.
- Usa zip con transformación para crear la lista de objetos directamente
- Retorna List<Articulo>
*/

data class Articulo1(val codigo: String, val cantidad: Int)

fun construirInventario(codigos: List<String>, cantidades: List<Int>): List<Articulo1> {

    return codigos.zip(cantidades) { codigo, cantidad ->
        Articulo1(codigo, cantidad)
    }

}

fun main() {
    val codigos = listOf("A01", "B02", "C03")
    val cantidades = listOf(10, 5, 8)
    println(construirInventario(codigos, cantidades))
    // [Articulo(codigo=A01, cantidad=10), Articulo(codigo=B02, cantidad=5), Articulo(codigo=C03, cantidad=8)]
}