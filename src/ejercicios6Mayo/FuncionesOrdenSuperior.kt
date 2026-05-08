package ejercicios6Mayo

/*
Ejercicio 3 - Declarar y usar función de orden superior
Escribe una función de orden superior que reciba una lista
de enteros, un filtro y una transformación, y retorne
la lista filtrada y transformada.

- Recibe: numeros: List<Int>, filtro: (Int) -> Boolean, transformacion: (Int) -> Int
- Retorna: List<Int>
*/

fun procesarLista(
    numeros: List<Int>,
    filtro: (Int) -> Boolean,
    transformacion: (Int) -> Int
): List<Int> {
    return numeros.filter(filtro).map(transformacion)
}

fun main() {
    val numeros = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    val resultado = procesarLista(
        numeros,
        { it % 2 == 0 },   // Solo pares
        { it * 10 }        // Multiplicar por 10
    )

    println(resultado)  // [20, 40, 60, 80, 100]
}