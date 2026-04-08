package ejercicios4

/*
Ejercicio 5 - Procesar configuración
La función recibe un Map<String, String> con configuración
y debe retornar un objeto Config con los tipos correctos.
Usa las funciones de conversión adecuadas.
Si algún valor no es válido usa los valores por defecto indicados.

- "timeout" → Int (default: 30)
- "factor" → Float (default: 1.0f)
- "maxRegistros" → Long (default: 1000L)
- "activo" → Boolean (default: false)
*/

data class Config(
    val timeout: Int,
    val factor: Float,
    val maxRegistros: Long,
    val activo: Boolean
)

fun parsearConfig(datos: Map<String, String>): Config {
    val timeout = datos["timeout"]?.toIntOrNull() ?: 30
    val factor = datos["factor"]?.toFloatOrNull() ?: 1.0f
    val maxRegistros = datos["maxRegistros"]?.toLongOrNull() ?: 1000L
    val activo = datos["activo"].toBoolean()
    return Config(timeout, factor, maxRegistros, activo)
}

fun main() {
    val datos = mapOf(
        "timeout" to "60",
        "factor" to "1.5",
        "maxRegistros" to "9999999999",
        "activo" to "true"
    )
    println(parsearConfig(datos))
    // Config(timeout=60, factor=1.5, maxRegistros=9999999999, activo=true)

    val datosInvalidos = mapOf(
        "timeout" to "abc",
        "factor" to "xyz",
        "maxRegistros" to "nope",
        "activo" to "nope"
    )
    println(parsearConfig(datosInvalidos))
    // Config(timeout=30, factor=1.0, maxRegistros=1000, activo=false)
}