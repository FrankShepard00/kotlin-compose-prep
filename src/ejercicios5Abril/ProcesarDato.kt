package ejercicios5Abril

/*
Ejercicio 4 - Procesar dato con limpieza
Escribe una función que intente convertir un texto a Int
y divida 100 entre ese número. Usa finally para imprimir
"Procesamiento terminado" siempre al final.

- Si el texto no es número → captura NumberFormatException
- Si el número es 0 → captura ArithmeticException
- En ambos casos retorna null
- finally siempre imprime "Procesamiento terminado"

- Recibe: texto: String
- Retorna: Int?
*/

fun procesarDato(texto: String): Int? {
    return try {
        100 / texto.toInt()
    } catch (e: NumberFormatException) {
        null
    } catch (e: ArithmeticException) {
        null
    } finally {
        println("Procesamiento terminado")
    }
}

fun main() {
    println(procesarDato("10"))   // Procesamiento terminado \n 10
    println(procesarDato("abc"))  // Procesamiento terminado \n null
    println(procesarDato("0"))    // Procesamiento terminado \n null
}