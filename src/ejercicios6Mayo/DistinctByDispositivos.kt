package ejercicios6Mayo

/*
Ejercicio 5 - Dispositivos únicos por tipo y marca
Dada una lista de dispositivos, retorna uno por cada
combinación única de tipo + marca.
- Usa distinctBy
- El criterio debe combinar dos propiedades
- Retorna List<Dispositivo>
*/

data class Dispositivo(val nombre: String, val tipo: String, val marca: String)

fun dispositivosUnicos(dispositivos: List<Dispositivo>): List<String> {
    return dispositivos.distinctBy { it.tipo to it.marca }.map { it.nombre }
}

fun main() {
    val dispositivos = listOf(
        Dispositivo("Galaxy S24", "phone", "Samsung"),
        Dispositivo("iPhone 15", "phone", "Apple"),
        Dispositivo("Galaxy Tab", "tablet", "Samsung"),
        Dispositivo("Galaxy S23", "phone", "Samsung"),
        Dispositivo("iPad Pro", "tablet", "Apple"),
        Dispositivo("iPhone 14", "phone", "Apple")
    )
    println(dispositivosUnicos(dispositivos))
    // [Galaxy S24, iPhone 15, Galaxy Tab, iPad Pro]
}