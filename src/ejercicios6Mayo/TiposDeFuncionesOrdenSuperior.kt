package ejercicios6Mayo

/*
Ejercicio 6 - Tipos de función con nombres de parámetros
Declara estas variables usando tipos de función explícitos
CON nombres de parámetros para mejorar legibilidad.

1. Una función que recibe precio: Double e impuesto: Double, retorna Double
2. Una función que recibe nombre: String y edad: Int, retorna String
*/

fun main() {
    // Tu declaración aquí
    { precio: Double, impuesto: Double -> precio + (precio * impuesto) }
    { nombre: String, edad: Int -> "$nombre tiene $edad años" }

    val calcularTotal: (precio: Double, impuesto: Double) -> Double =
        { precio, impuesto -> precio + (precio * impuesto) }
    
    val formatearUsuario: (nombre: String, edad: Int) -> String = { nombre, edad -> "$nombre tiene $edad años" }


    println(calcularTotal(100.0, 0.16))   // 116.0
    println(formatearUsuario("Ana", 25))  // Ana tiene 25 años
}