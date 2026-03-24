package ejercicios4

/*
Ejercicio 4 - Calcular propina
Escribe una función que calcule el total a pagar
incluyendo una propina.
- Recibe: subtotal Double, porcentajePropina Double (0.15 = 15%)
- Devuelve: Double
- Usa operadores de asignación compuesta (+=)
*/

fun calcularTotal(subTotal: Double, porcentajePropina: Double) = subTotal + (subTotal * porcentajePropina)


fun main() {
    println(calcularTotal(100.0, 0.15))  // 115.0
    println(calcularTotal(200.0, 0.20))  // 240.0



    val lista1 = listOf(1, 2, 3)
    val lista2 = listOf(1, 2, 3)

    println(lista1 == lista2) // true (mismo contenido), false (objetos distintos) A
    println(lista1 === lista2)

}