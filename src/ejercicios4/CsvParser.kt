package ejercicios4

/*
Ejercicio 5 - Parsear línea CSV
La función recibe un String con datos separados por comas y debe
retornar un objeto Persona con esos datos.

- Recibe: un String con formato "nombre,edad,ciudad"
- Devuelve: un objeto Persona con los campos correspondientes
- La edad debe convertirse a Int
*/

data class Persona(val nombre: String, val edad: Int, val ciudad: String)

fun parsearPersona(linea: String): Persona {
    val (nombre, edad, ciudad) = linea.split(",")
    return Persona(nombre, edad.toInt(), ciudad)
}

fun main() {
    val p = parsearPersona("Ana,25,Puebla")
    println(p.nombre)  // Ana
    println(p.edad)    // 25
    println(p.ciudad)  // Puebla
}