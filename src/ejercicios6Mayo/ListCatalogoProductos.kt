package ejercicios6Mayo

/*
Ejercicio 2 - Gestionar catálogo de productos
Dada la siguiente lista, realiza estas operaciones
usando los métodos del apunte:

1. Imprime el primer y último producto
2. Accede al índice 2 de forma segura (puede no existir)
3. Verifica si "Monitor" está en la lista
4. Imprime el tamaño y los índices de la lista
*/

fun main() {
    val lista = listOf("Laptop", "Mouse", "Teclado", "Monitor", "Auriculares")

    println(lista.first())
    println(lista.last())
    println(lista.getOrNull(2))
    println("Monitor" in lista)
    lista.forEachIndexed { index, string -> println("$index.- $string") }
}