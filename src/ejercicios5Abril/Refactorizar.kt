package ejercicios5Abril

/*
Ejercicio 2 - Refactorizar código peligroso
El siguiente código usa !! de forma incorrecta.
Reescribe las dos funciones usando alternativas seguras
sin cambiar los tipos de los parámetros ni el tipo de retorno.
*/

// ❌ Versión peligrosa - NO modificar
fun obtenerLongitud(texto: String?): Int {
    return texto!!.length
}

fun obtenerSaludo(nombre: String?): String {
    return "Hola, ${nombre!!.uppercase()}"
}

// ✅ Tu versión segura aquí
fun obtenerLongitudSegura(texto: String?) = texto?.length ?: 0

fun obtenerSaludoSeguro(nombre: String?) = "Hola, ${nombre?.uppercase() ?: "ANÓNIMO"}"

fun main() {
    println(obtenerLongitudSegura("Kotlin"))  // 6
    println(obtenerLongitudSegura(null))      // 0

    println(obtenerSaludoSeguro("Ana"))       // Hola, ANA
    println(obtenerSaludoSeguro(null))        // Hola, ANÓNIMO
}