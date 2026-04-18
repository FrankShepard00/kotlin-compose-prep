package ejercicios5Abril

/*
Ejercicio 4 - Describir valor
Escribe una función que reciba un Any y retorne una descripción
según su tipo. Usa safe cast con when.

- Si es Int   → "Entero: [valor]"
- Si es String → "Texto: [valor en mayúsculas]"
- Si es Double → "Decimal: [valor]"
- Cualquier otro → "Tipo desconocido"

- Recibe: valor: Any
- Retorna: String
*/

fun describirValor(valor: Any): String {
    return when (valor) {
        is Int -> "Entero: $valor"
        is String -> "Texto: ${valor.uppercase()}"
        is Double -> "Decimal: $valor"
        else -> {
            "Tipo desconocido "
        }
    }
}

fun main() {
    println(describirValor(42))       // Entero: 42
    println(describirValor("hola"))   // Texto: HOLA
    println(describirValor(3.14))     // Decimal: 3.14
    println(describirValor(true))     // Tipo desconocido
}