package ejercicios5Abril

/*
Ejercicio 2 - Procesar email
Escribe una función que reciba un email nullable y:
1. Si es null → retorna "Email es null"
2. Si no contiene "@" → retorna "Email inválido"
3. Si es válido → retorna "Enviando a: [email en minúsculas]"

- Recibe: email: String?
- Retorna: String
- Usa ?.let para manejar el nullable
*/

fun procesarEmail(email: String?): String {
    return email?.let { if (email.contains('@')) "Enviando a: ${email.lowercase()}" else "Email inválido" }
        ?: "Email es null"
}

fun main() {
    println(procesarEmail("ANA@EJEMPLO.COM"))  // Enviando a: ana@ejemplo.com
    println(procesarEmail("invalido"))          // Email inválido
    println(procesarEmail(null))                // Email es null
}