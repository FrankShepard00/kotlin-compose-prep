package ejercicios6Mayo

/*
Ejercicio 10 - Sistema de notificaciones
Escribe una función de orden superior que procese
una lista de eventos y notifique según el tipo.

- Recibe: eventos: List<String>, onExito: (String) -> Unit, onError: (String) -> Unit
- Si el evento empieza con "ERROR" → llama onError
- Si no → llama onExito
*/

fun procesarEventos(
    eventos: List<String>,
    onExito: (String) -> Unit,
    onError: (String) -> Unit
) {
    eventos.forEach {
        if (it.startsWith("ERROR")) onError(it) else onExito(it)
    }
}

fun main() {
    val eventos = listOf("Pago procesado", "ERROR: timeout", "Usuario creado", "ERROR: sin conexión")

    procesarEventos(
        eventos,
        onExito = { println("✅ $it") },
        onError = { println("❌ $it") }
    )
    // ✅ Pago procesado
    // ❌ ERROR: timeout
    // ✅ Usuario creado
    // ❌ ERROR: sin conexión
}