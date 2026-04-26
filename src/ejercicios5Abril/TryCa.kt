package ejercicios5Abril

fun conectar(url: String): String {
    return try {
        if (url.isEmpty()) throw Exception("URL vacía")
        "Conectado a $url"
    } catch (e: Exception) {
        "Error: ${e.message}"
    } finally {
        println("Cerrando conexión")  // siempre se ejecuta
    }
}

fun main() {
    println(conectar("api.ejemplo.com"))
    // Cerrando conexión
    // Conectado a api.ejemplo.com

    println(conectar(""))
    // Cerrando conexión
    // Error: URL vacía
}