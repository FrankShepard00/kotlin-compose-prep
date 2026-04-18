package ejercicios5Abril

/*
Ejercicio 2 - Obtener iniciales de usuario
Escribe una función que reciba nombre y apellido (ambos opcionales)
y retorne sus iniciales en mayúsculas concatenadas.

- Recibe: nombre: String?, apellido: String?
- Retorna: String (las iniciales encontradas, o cadena vacía si ambos son null)
- Usa safe call para obtener el primer carácter de cada uno

Ejemplo: "ana", "garcía" → "AG"
         null, "garcía"  → "G"
         "ana", null     → "A"
         null, null      → ""
*/

fun obtenerIniciales(nombre: String?, apellido: String?) =
    "${nombre?.first()?.uppercase() ?: ""}${apellido?.first()?.uppercase() ?: ""}"

fun main() {
    println(obtenerIniciales("ana", "garcía"))  // AG
    println(obtenerIniciales(null, "garcía"))   // G
    println(obtenerIniciales("ana", null))      // A
    println(obtenerIniciales(null, null))       // (vacío)
}