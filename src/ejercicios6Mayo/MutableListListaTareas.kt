package ejercicios6Mayo

/*
Ejercicio 2 - Gestionar lista de tareas
Realiza estas operaciones sobre la lista:

1. Agrega "Revisar PR" al final
2. Agrega "Standup" en la posición 0
3. Modifica "Escribir tests" por "Escribir tests unitarios"
4. Elimina "Documentar API"
5. Imprime la lista final
*/

fun main() {
    val tareas = mutableListOf(
        "Escribir tests",
        "Documentar API",
        "Hacer deploy"
    )

    tareas.add("Revisar PR")
    tareas.add(0, "Standup")
    tareas[1] = "Escribir test unitarios"
    tareas.remove("Documentar API")

    println(tareas)

}