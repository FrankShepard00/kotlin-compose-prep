package ejercicios5Abril

/*
Ejercicio 2 - Procesar lista mixta
Dada una lista de elementos de tipo Any, extrae solo los strings
y retornalos en mayúsculas. Los elementos que no sean String
deben ignorarse.

- Recibe: elementos: List<Any>
- Retorna: List<String>
- Usa safe cast con mapNotNull
*/

fun extraerTextos(elementos: List<Any>): List<String> {
    return elementos.mapNotNull { (it as? String)?.uppercase() }
}

fun main() {
    val datos = listOf("Kotlin", 42, "Android", 3.14, true, "Jetpack")
    println(extraerTextos(datos))  // [KOTLIN, ANDROID, JETPACK]
}