package ejercicios4

/*
Ejercicio 5 - Generar lista HTML
La función recibe una lista de strings y debe retornar
un string con formato de lista HTML usando joinToString.

- Recibe: List<String>
- Devuelve: String con formato HTML

*/

fun generarListaHTML(items: List<String>): String {
    return items.joinToString(
        separator = "\n",
        prefix = "<ul>\n",
        postfix = "\n</ul>"
    ) { "\t<li>$it</li>" }
}

fun main() {
    val frutas = listOf("Manzana", "Naranja", "Plátano")
    println(generarListaHTML(frutas))
    // <ul>
    //   <li>Manzana</li>
    //   <li>Naranja</li>
    //   <li>Plátano</li>
    // </ul>
}