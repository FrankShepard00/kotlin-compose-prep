package ejercicios4

/*
Ejercicio 4 - Validar edad
Escribe una función que valide que una edad sea positiva
y menor a 150. Si no cumple, lanza una excepción con error().
- Recibe: Int
- Devuelve: Int si es válida
- Usa error() para los casos inválidos
*/

fun validarEdad(edad: Int) = if (edad in 1..150) edad else error("Edad Invalida")


fun main() {
    println(validarEdad(25))   // 25
    println(validarEdad(-5))   // Lanza excepción
    println(validarEdad(200))  // Lanza excepción
}