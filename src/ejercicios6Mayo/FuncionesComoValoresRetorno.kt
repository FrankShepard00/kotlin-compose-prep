package ejercicios6Mayo

/*
Ejercicio 4 - Funciones como valores de retorno
Escribe una función fábrica que reciba un descuento (Int)
y retorne una función que aplique ese descuento a un precio.

- crearCalculadorDescuento(descuento: Int): (Double) -> Double
- La función retornada recibe un precio y retorna el precio con descuento
*/

fun crearCalculadorDescuento(descuento: Int): (Double) -> Double {
    return { precio -> precio - (precio * descuento / 100) }
}

fun main() {
    val descuento10 = crearCalculadorDescuento(10)
    val descuento25 = crearCalculadorDescuento(25)

    println(descuento10(1000.0))  // 900.0
    println(descuento25(1000.0))  // 750.0
    println(descuento10(500.0))   // 450.0
}