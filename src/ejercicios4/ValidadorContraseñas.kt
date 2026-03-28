package ejercicios4

/*
Ejercicio 9 - Validador de contraseña
Escribe una función llamada `validarPassword` que reciba:
- password: String

Y retorne true si cumple TODAS estas condiciones:
- No está en blanco
- Tiene al menos 8 caracteres (usa length)
- Contiene al menos un número (usa any { it.isDigit() })
- No empieza ni termina con espacio
*/

fun validarPassword(password: String): Boolean {
    return password.isNotBlank()
            && password.length >= 8
            && password.any { it.isDigit() }
            && !password.startsWith(' ')
            && !password.endsWith(' ')
}

fun main() {
    println(validarPassword("Pass1234")) // true
    println(validarPassword("pass")) // false (muy corta)
    println(validarPassword("password")) // false (sin número)
    println(validarPassword(" Pass1234")) // false (empieza con espacio)
    println(validarPassword("")) // false (vacía)


    val ruta = "/home/usuario/documentos/archivo.txt"

    val ultimaBarra = ruta.lastIndexOf("/")
    println(ultimaBarra)
    println(ruta.substring(ultimaBarra + 1))

}
