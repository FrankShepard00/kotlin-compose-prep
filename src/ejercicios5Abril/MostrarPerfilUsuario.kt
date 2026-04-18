package ejercicios5Abril

/*
Ejercicio 4 - Mostrar perfil de usuario
Dado un objeto Usuario, imprime su información. El nombre siempre existe,
pero el teléfono es opcional.

- Si el teléfono existe, imprime: "Teléfono: [numero]"
- Si no existe, imprime: "Teléfono: No registrado"

Recibe: usuario: Usuario
Retorna: Unit
*/
    
data class Usuario(val nombre: String, val telefono: String?)

fun mostrarPerfil(usuario: Usuario) {
    println("Nombre: ${usuario.nombre}")
    println("Teléfono: ${usuario.telefono ?: "No registrado"}")
}

fun main() {
    mostrarPerfil(Usuario("Ana", "555-1234"))
    // Nombre: Ana
    // Teléfono: 555-1234

    mostrarPerfil(Usuario("Carlos", null))
    // Nombre: Carlos
    // Teléfono: No registrado
}