package ejercicios5Abril

/*
Ejercicio 2 - Procesar nombres opcionales
Dada una lista que puede contener nombres null,
obtén solo los nombres válidos en mayúsculas.

- Recibe: nombres: List<String?>
- Retorna: List<String> (sin nulls, en mayúsculas)
- Usa mapNotNull
*/

fun procesarNombres(nombres: List<String?>): List<String> {
    return nombres.mapNotNull { it?.uppercase() }
}

fun main() {
    val datos = listOf("Ana", null, "Carlos", null, "María")
    println(procesarNombres(datos))  // [ANA, CARLOS, MARÍA]
}