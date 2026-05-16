package ejercicios6Mayo

/*
Ejercicio 4 - Índice de usuarios
Dada una lista de usuarios, crea dos Maps:
1. Un mapa de ID → Usuario usando associateBy
2. Un mapa de ID → nombre usando associate

Luego busca el usuario con ID 2 en el primer mapa
y el nombre con ID 3 en el segundo.
*/

data class Usuario(val id: Int, val nombre: String, val email: String)

fun main() {
    val usuarios = listOf(
        Usuario(1, "Ana", "ana@email.com"),
        Usuario(2, "Carlos", "carlos@email.com"),
        Usuario(3, "María", "maria@email.com")
    )

    val mapIdUsuario = usuarios.associateBy { it.id }
    println(mapIdUsuario)

    val mapIdNombre = usuarios.associate { it.id to it.nombre }
    println(mapIdNombre)

    println("Usuario con el ID 2: ${mapIdUsuario.get(2)}")
    println("Nombre con el ID 3: ${mapIdNombre[3]}")
}