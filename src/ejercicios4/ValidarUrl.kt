package ejercicios4

/*
Ejercicio 11 - Validar URL
Escribe una función llamada `validarUrl` que reciba:
- url: String

Y retorne true si cumple TODAS estas condiciones:
- No está en blanco
- Empieza con "https://" (ignoreCase = true)
- Contiene al menos un punto
- Termina con ".com", ".mx" o ".org" (ignoreCase = true)
*/

fun validarUrl(url: String): Boolean {
    return url.isNotBlank() &&
            url.startsWith("https://", ignoreCase = true) &&
            url.contains('.') &&
            (url.endsWith(".com", ignoreCase = true) ||
                    url.endsWith(".mx", ignoreCase = true) ||
                    url.endsWith(".org", ignoreCase = true))
}

fun main() {
    println(validarUrl("https://ejemplo.com")) // true
    println(validarUrl("https://ejemplo.mx")) // true
    println(validarUrl("http://ejemplo.com")) // false (no es https)
    println(validarUrl("https://ejemplo")) // false (sin extensión)
    println(validarUrl("")) // false (vacía)
}
