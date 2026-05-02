package ejercicios5Abril

/*
Ejercicio 4 - Funciones helper
Reescribe esta función usando require, check y error
en lugar de if + throw manual.

- edad debe ser mayor a 0
- nombre no puede estar en blanco
- estado debe ser "activo" (usa check ya que es estado del objeto)
- Si llega a un punto inesperado, usa error()
*/

// ❌ Versión manual
fun registrarUsuarioManual(nombre: String, edad: Int, estado: String) {
    if (edad <= 0) throw IllegalArgumentException("Edad inválida")
    if (nombre.isBlank()) throw IllegalArgumentException("Nombre vacío")
    if (estado != "activo") throw IllegalStateException("Estado inválido")
    println("Usuario registrado: $nombre")
}

// ✅ Tu versión con helpers
fun registrarUsuario(nombre: String, edad: Int, estado: String) {
    require(edad > 0) { "Edad inválida" }
    require(nombre.isNotBlank()) { "Nombre vacío" }
    check(estado == "activo") { "Estado inválido" }
    println("Usuario registrado: $nombre")

}

fun main() {
    registrarUsuario("Ana", 25, "activo")  // Usuario registrado: Ana
    //registrarUsuario("", 25, "activo")  // IllegalArgumentException
    //registrarUsuario("Ana", -1, "activo") // IllegalArgumentException
    //registrarUsuario("Ana", 25, "inactivo") // IllegalStateException
}