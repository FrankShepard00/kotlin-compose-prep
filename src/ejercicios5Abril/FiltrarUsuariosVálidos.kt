package ejercicios5Abril

/*
Ejercicio 2 - Filtrar usuarios válidos
Dada una lista de usuarios, imprime solo los que:
- Tienen 18 años o más
- Están activos

Si no cumplen alguna condición, sáltalos con continue.

- Recibe: usuarios: List<Usuario>
- Retorna: Unit
*/

data class Usuario2(val nombre: String, val edad: Int, val activo: Boolean)

fun imprimirValidos(usuarios: List<Usuario2>) {
    for (usuario in usuarios) {
        if (!usuario.activo) {
            println("${usuario.nombre}: inactivo - ignorado"); continue
        }
        if (usuario.edad < 18) {
            println("${usuario.nombre}: menor de edad - ignorado"); continue
        }
        println("${usuario.nombre} ✓ VÁLIDO")
    }
}

fun main() {
    val usuarios = listOf(
        Usuario2("Ana", 25, true),
        Usuario2("Carlos", 17, true),
        Usuario2("María", 30, false),
        Usuario2("Juan", 22, true)
    )
    imprimirValidos(usuarios)
    // Ana: ✓ VÁLIDO
    // Carlos: menor de edad - ignorado
    // María: inactivo - ignorado
    // Juan: ✓ VÁLIDO
}