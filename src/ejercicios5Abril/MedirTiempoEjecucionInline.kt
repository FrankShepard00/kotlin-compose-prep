package ejercicios5Abril

/*
Ejercicio 2 - Medir tiempo de ejecución
Escribe una función inline que mida el tiempo
que tarda en ejecutarse un bloque de código.

- Recibe: bloque: () -> Unit
- Retorna: Long (milisegundos que tardó)
- Usa System.currentTimeMillis()
*/

inline fun medirTiempo(bloque: () -> Unit): Long {
    val inicio = System.currentTimeMillis()
    bloque()
    val tiempoTotal = System.currentTimeMillis() - inicio
    return tiempoTotal
}

fun main() {
    val tiempo = medirTiempo {
        var suma = 0
        for (i in 1..1_000_000) suma += i
        println("Suma: $suma")
    }
    println("Tiempo: ${tiempo}ms")
}