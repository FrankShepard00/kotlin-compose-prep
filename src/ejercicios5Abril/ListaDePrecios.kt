package ejercicios5Abril

/*
Ejercicio 2 - Convertir lista de precios
Dada una lista de Strings que representan precios,
conviértelos a Double usando try como expresión.
Los valores inválidos deben convertirse a 0.0.

- Recibe: precios: List<String>
- Retorna: List<Double>
- Usa try como expresión dentro de un map
*/

fun convertirPrecios(precios: List<String>): List<Double> {
    return precios.map {
        try {
            it.toDouble()
        } catch (e: NumberFormatException) {
            println(e)
            0.0
        }
    }
}

fun main() {
    val precios = listOf("100.0", "abc", "250.5", "xx", "99.9")
    println(convertirPrecios(precios))  // [100.0, 0.0, 250.5, 0.0, 99.9]
}