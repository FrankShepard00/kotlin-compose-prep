package ejercicios4

/*
Ejercicio 4 - Gestionar inventario
Escribe una función que simule agregar y vender
unidades de un producto usando += y -=
- Recibe: stockInicial Int, unidadesAgregadas Int, unidadesVendidas Int
- Devuelve: Int (stock final)
- Usa operadores de asignación compuesta
*/

fun gestionarStock(stockInicial: Int, unidadesAgregadas: Int, unidadesVendidas: Int): Int{
    var stock = stockInicial
    stock += unidadesAgregadas
    stock -= unidadesVendidas
    return stock
}

fun main() {
    println(gestionarStock(10, 5, 3))  // 12
    println(gestionarStock(20, 10, 8)) // 22

    for (i in 10 downTo 1) {
        println(i)
    }

    val rango = 1..10 step 3 // 1, 4, 7, 10
    println(rango.toList())

    for (i in 10 downTo 1 step 4) { // 10, 6, 2
        print("$i ")
    }
}