fun main() {
    val codigoProducto = "PRD-12345"
    println(codigoProducto.take(3)) // PRD
    println(codigoProducto.takeLast(5)) // 12345

    val archivo = "documento_final.txt"
    println(archivo.takeLast(4) == ".txt") // true
}