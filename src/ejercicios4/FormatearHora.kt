package ejercicios4

/*
Ejercicio 5 - Formatear hora
La función recibe horas, minutos y segundos como Int y debe
retornar un String con formato HH:MM:SS, asegurando que cada
parte tenga siempre 2 dígitos.

- Recibe: tres Int (horas, minutos, segundos)
- Devuelve: String con formato "HH:MM:SS"
*/

fun formatearHora(horas: Int, minutos: Int, segundos: Int): String {
    return "${horas.toString().padStart(2, '0')}:${minutos.toString().padStart(2, '0')}:${segundos.toString().padStart(2, '0')}"
}

fun main() {
    println(formatearHora(9, 5, 3))     // 09:05:03
    println(formatearHora(14, 30, 45))  // 14:30:45
    println(formatearHora(0, 0, 7))     // 00:00:07
}

