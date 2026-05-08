package ejercicios6Mayo

/*
Ejercicio 2 - Type inference
Escribe las dos versiones de cada lambda:
una con tipos explícitos en los parámetros
y otra con tipos en la variable (inferencia).
*/

fun main() {
    // 1. Lambda que recibe Int y retorna su cuadrado
    val cuadrado1 = { numero: Int -> numero * numero }// Con tipos en parámetros
    val cuadrado2: (Int) -> Int = { it * it }// Con tipos en variable

    // 2. Lambda que recibe dos Strings y los concatena con espacio
    val concatenar1 = { txt1: String, txt2: String -> "$txt1 $txt2" } // Con tipos en parámetros
    val concatenar2: (String, String) -> String = { texto1, texto2 -> "$texto1 $texto2" } // Con tipos en variable

    println(cuadrado1(4))          // 16
    println(cuadrado2(4))          // 16
    println(concatenar1("Hola", "Mundo"))  // Hola Mundo
    println(concatenar2("Hola", "Mundo"))  // Hola Mundo
}