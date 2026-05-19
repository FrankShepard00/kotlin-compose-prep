package ejercicios6Mayo

/*
Ejercicio 2 - Sistema de soporte
Dado el mapa de tickets, encuentra:
1. El primer ticket crítico (prioridad == "CRÍTICA")
2. El primer ticket asignado a "Ana" con seguridad
   (sabes que existe, usa find o first según corresponda)
3. Un ticket con ID 999 que no existe — maneja el null
*/

data class Ticket(val id: Int, val titulo: String, val prioridad: String, val asignado: String)

fun main() {
    val tickets = listOf(
        Ticket(1, "Login falla", "MEDIA", "Carlos"),
        Ticket(2, "App crashea", "CRÍTICA", "Ana"),
        Ticket(3, "UI bug", "BAJA", "Ana"),
        Ticket(4, "DB lenta", "CRÍTICA", "Pedro")
    )
    val ticketCritico = tickets.find { it.prioridad == "CRÍTICA" }
    println("Primer ticket crítico: ${ticketCritico?.titulo ?: "No encontrado"}")

    val primeroAna = tickets.first { it.asignado == "Ana" }
    println("El primero de Ana: ${primeroAna.titulo}")

    val idNoExiste = tickets.find { it.id == 999 }
    println("Ticket 999: ${idNoExiste?.titulo ?: "El ticket no existe."}")
}