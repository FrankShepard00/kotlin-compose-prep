package ejercicios6Mayo

/*
Ejercicio 4 - Gestionar etiquetas de artículo
Realiza estas operaciones:

1. Agrega "android" y "mobile" al conjunto
2. Intenta agregar "kotlin" (ya existe) — imprime si se agregó o no
3. Elimina "mobile"
4. Imprime el tamaño final
*/

fun main() {
    val etiquetas = mutableSetOf("kotlin", "programación", "tutorial")

    etiquetas.addAll(listOf("android", "mobile"))
    etiquetas.add("kotlin")
    println(etiquetas)
    println(etiquetas.add("kotlin"))  // false — ya existe
    etiquetas.remove("mobile")
    println(etiquetas.size)
    println(etiquetas)
}