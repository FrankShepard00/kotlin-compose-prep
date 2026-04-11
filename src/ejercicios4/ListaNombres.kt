package ejercicios4

/*
Ejercicio 7 - Transformar lista de nombres
La función recibe una lista de nombres y debe retornar
una nueva lista donde cada nombre esté en mayúsculas
y tenga más de 3 caracteres.

- Recibe: List<String>
- Devuelve: List<String> filtrada y transformada
*/

fun procesarNombres(nombres: List<String>) = nombres.filter { it.length > 3 }.map { it.uppercase() }


fun main() {
    val nombres = listOf("Ana", "Carlos", "Li", "María", "Bo", "Sofía")
    println(procesarNombres(nombres))
    // [CARLOS, MARÍA, SOFÍA]
}