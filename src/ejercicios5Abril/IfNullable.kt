package ejercicios5Abril

fun saludar(nombre: String?) {
    if (nombre != null) {
        println("Hola, $nombre")         // smart cast: nombre es String aquí
        println("Letras: ${nombre.length}")
    } else {
        println("Nombre no disponible")
    }
}

fun main() {
    saludar("Ana")   // Hola, Ana / Letras: 3
    saludar(null)    // Nombre no disponible
}