package ejercicios5Abril

/*
Ejercicio 3 - Procesar dato de Java
Simula recibir un valor de Java como platform type.
Escribe una función que procese el dato de forma segura
usando las tres estrategias que menciona el apunte:
A) Con valor por defecto (Elvis)
B) Lanzando excepción si es null
C) Con let para procesar solo si existe

- Recibe: dato: String? (simula un platform type)
- Imprime el resultado de cada estrategia
*/

fun procesarDatoJava(dato: String?) {
    val dato1: String = dato ?: "Sin dato"
    println(dato1)
    dato?.let { println(it.uppercase()) }
}

fun main() {
    procesarDatoJava("Kotlin")
    println("---")
    procesarDatoJava(null)
}