package ejercicios4

/*
Ejercicio 8 - Vista previa de texto
Escribe una función llamada `vistaPrevia` que reciba:
- texto: String
- maximo: Int (por defecto 20)

Si el texto es más largo que maximo, retorna los primeros
`maximo` caracteres seguidos de "..."
Si no, retorna el texto tal cual.
*/

fun vistaPrevia(texto: String, maximo: Int = 20): String {
    return if (texto.length > maximo) {
        "${texto.take(maximo)}..."
    } else {
         texto
    }
}

fun main() {
    println(vistaPrevia("Kotlin es un lenguaje increíble"))  // "Kotlin es un lenguaj..."
    println(vistaPrevia("Hola"))                             // "Hola"
    println(vistaPrevia("Hola Mundo", 5))                   // "Hola ..."
}