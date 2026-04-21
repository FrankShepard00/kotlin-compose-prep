package ejercicios5Abril

/*
Ejercicio 2 - Buscar en matriz
Dada una matriz de números, busca el primer número
negativo. Cuando lo encuentres, imprime su posición
y sal de AMBOS bucles usando un label.

- Recibe: matriz: List<List<Int>>
- Retorna: Unit
*/

fun buscarNegativo(matriz: List<List<Int>>) {
    etiqueta@ for (fila in matriz.indices) {
        for (numero in matriz[fila].indices) {
            if (matriz[fila][numero] <= 0) {
                println("Negativo encontrado: ${matriz[fila][numero]} en posición ($fila, $numero)")
                break@etiqueta
            }
        }
    }
}

fun main() {
    val matriz = listOf(
        listOf(1, 2, 3),
        listOf(4, -5, 6),
        listOf(7, 8, 9)
    )
    buscarNegativo(matriz)
    // Negativo encontrado: -5 en posición (1, 1)
}