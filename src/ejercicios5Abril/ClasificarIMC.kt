package ejercicios5Abril

/*
Ejercicio 5 - Clasificar IMC
La función recibe peso (Double) y altura (Double) y debe
retornar una clasificación según el IMC calculado.
IMC = peso / (altura * altura)

- Menor a 18.5 → "Bajo peso"
- 18.5 a 24.9 → "Normal"
- 25.0 a 29.9 → "Sobrepeso"
- 30.0 o más → "Obesidad"

- Recibe: Double, Double
- Devuelve: String
*/

fun clasificarIMC(peso: Double, altura: Double): String {
    val imc = peso / (altura * altura)
    return if (imc < 18.5) {
        "Bajo peso"
    } else if (imc in 18.5..24.9) {
        "Normal"
    } else if (imc in 25.0..29.9) {
        "Sobrepeso"
    } else {
        "Obesidad"
    }
}

fun main() {
    println(clasificarIMC(50.0, 1.70))   // Bajo peso
    println(clasificarIMC(70.0, 1.70))   // Normal
    println(clasificarIMC(85.0, 1.70))   // Sobrepeso
    println(clasificarIMC(100.0, 1.70))  // Obesidad
}