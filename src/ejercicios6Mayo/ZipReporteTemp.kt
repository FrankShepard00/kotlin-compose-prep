package ejercicios6Mayo

/*
Ejercicio 5 - Reporte de temperaturas
Dada una lista de temperaturas, calcula cuántas veces
subió la temperatura respecto al día anterior.
- Usa zipWithNext
- Retorna Int con el conteo de subidas
*/

fun contarSubidas(temps: List<Int>): Int {
    return temps.zipWithNext { ayer, hoy -> if (hoy > ayer) 1 else 0 }.sum()
}

fun main() {
    val temps = listOf(15, 18, 16, 20, 22, 19, 21)
    println(contarSubidas(temps)) // 4
}