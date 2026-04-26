package ejercicios5Abril

/*
Ejercicio 2 - Conversión segura
Escribe una función que convierta un String a Int
usando try como expresión. Si falla, retorna null.

- Recibe: texto: String
- Retorna: Int?
- Usa try como expresión directamente en el return
*/

fun convertirSeguro(texto: String): Int? {
    return try {
        texto.toInt()
    } catch (e: NumberFormatException) {
        null
    }
}

fun main() {
    println(convertirSeguro("123"))  // 123
    println(convertirSeguro("abc"))  // null
    println(convertirSeguro("0"))    // 0
}