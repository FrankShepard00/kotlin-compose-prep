package ejercicios5Abril

/*
Ejercicio 4 - Contador independiente
Escribe una función que retorne una lambda (closure).
Cada lambda creada debe tener su propio contador
independiente que incremente con cada llamada.

- crearContador(): () -> Int
- Cada llamada a la lambda retorna el siguiente número
- Dos contadores creados son completamente independientes
*/

fun crearContador(): () -> Int {
    var contador = 1

    return {
        contador++
    }
}

fun main() {
    val contador1 = crearContador()
    val contador2 = crearContador()

    println(contador1())  // 1
    println(contador1())  // 2
    println(contador2())  // 1 ← independiente
    println(contador1())  // 3
    println(contador2())  // 2
}