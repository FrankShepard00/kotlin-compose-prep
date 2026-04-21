package ejercicios5Abril

/*
Ejercicio 2 - Sumar hasta límite
Escribe una función que sume números consecutivos
empezando desde 1 hasta que la suma supere el límite dado.
Retorna la suma final.

- Recibe: limite: Int
- Retorna: Int (primera suma que supera el límite)
- Usa while ya que no sabes cuántas iteraciones necesitas
*/

fun sumarHastaLimite(limite: Int): Int {
    var suma = 0
    var contador = 1
    while (suma <= limite) {
        suma += contador
        contador++
    }
    return suma
}

fun main() {
    println(sumarHastaLimite(50))   // 55 (1+2+...+10)
    println(sumarHastaLimite(10))   // 15 (1+2+3+4+5)
    println(sumarHastaLimite(100))  // 105 (1+2+...+14)
}