package ejercicios5Abril

/*
Ejercicio 4 - Comparar return local vs non-local
Escribe DOS versiones de la misma función que busca
el primer número mayor a 3 en una lista.

- Con lambda: el return sale de la función contenedora
- Con función anónima: el return sale solo del forEach

El resultado impreso debe ser diferente en cada versión.
*/

fun buscarConLambda(numeros: List<Int>): String {
    numeros.forEach {
        if (it > 3) return "Encontrado: $it"
        println(it)
    }
    return "No encontrado"
}

fun buscarConAnonima(numeros: List<Int>): String {
    numeros.forEach(fun(numero: Int) {
        if (numero == 4) return
        println(numero)

    })
    return "No encontrado mayor a 3 primero"
}

fun main() {
    val numeros = listOf(1, 2, 3, 4, 5)
    println(buscarConLambda(numeros))
    // 1
    // 2
    // 3
    // Encontrado: 4

    println(buscarConAnonima(numeros))
    // 1
    // 2
    // 3
    // 5
    // No encontrado mayor a 3 primero
}