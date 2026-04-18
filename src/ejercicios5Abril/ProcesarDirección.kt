/*
Ejercicio 4 - Procesar dirección de envío
Dadas las clases siguientes, obtén la calle de la dirección
del usuario de forma segura. Si cualquier parte de la cadena
es null, retorna "Sin dirección".

- Recibe: usuario: Usuario?
- Retorna: String (la calle o "Sin dirección")
*/

data class Direccion(val calle: String, val ciudad: String)
data class Usuario(val nombre: String, val direccion: Direccion?)

fun obtenerCalle(usuario: Usuario?) = usuario?.direccion?.calle ?: "Sin Dirección"


fun main() {
    val u1 = Usuario("Ana", Direccion("Reforma", "CDMX"))
    val u2 = Usuario("Carlos", null)
    val u3: Usuario? = null

    println(obtenerCalle(u1))  // Reforma
    println(obtenerCalle(u2))  // Sin dirección
    println(obtenerCalle(u3))  // Sin dirección
}