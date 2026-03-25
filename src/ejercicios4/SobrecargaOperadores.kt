package ejercicios4

/*
Ejercicio 4 - Sobrecarga de operador
Crea una data class llamada `Vector` con dos propiedades:
- x: Int
- y: Int

Sobrecarga el operador `-` para que reste dos vectores
(resta x con x, y con y).
*/

data class Vector(val x: Int, val y: Int){
    operator fun minus(otro: Vector): Vector {
        return Vector(x - otro.x, y - otro.y)
    }
}


fun main() {
    val v1 = Vector(10, 8)
    val v2 = Vector(3, 2)

    println(v1 - v2)  // Vector(x=7, y=6)
}