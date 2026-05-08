package ejercicios5Abril

/*
Ejercicio 2 - Reescribir con trailing lambda
Reescribe estas tres llamadas usando trailing lambda
en su forma más concisa.
*/

fun operar(a: Int, b: Int, operacion: (Int, Int) -> Int): Int = operacion(a, b)
fun validar(mensaje: String, condicion: () -> Boolean): Boolean {
    println(mensaje)
    return condicion()
}

fun transformar(texto: String, transformacion: (String) -> String): String = transformacion(texto)

fun main() {
    // ❌ Reescribe estas tres líneas con trailing lambda
    //val suma = operar(10, 5, { a, b -> a + b })
    operar(10, 5) { a, b -> a + b }
    //val esValido = validar("Validando...", { 10 > 5 })
    validar("Validando...") { 10 > 5 }
    //val resultado = transformar("hola", { it.uppercase() })
    transformar("hola") { it.uppercase() }
}