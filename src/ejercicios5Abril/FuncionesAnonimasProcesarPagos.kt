package ejercicios5Abril

/*
Ejercicio 2 - Procesar pagos
Procesa una lista de pagos. Para cada pago:
- Si es negativo → agrega "Error: monto negativo" y salta al siguiente
- Si es 0 → agrega "Error: monto cero" y salta al siguiente
- Si es válido → agrega "Pago procesado: $monto"

Usa función anónima para los returns locales.

- Recibe: pagos: List<Double>
- Retorna: List<String>
*/

fun procesarPagos(pagos: List<Double>): List<String> {
    val resultados = mutableListOf<String>()
    pagos.forEach(fun(monto: Double) {
        if (monto < 0.0) {
            resultados.add("Error: monto negativo")
            return
        }
        if (monto == 0.0) {
            resultados.add("Error: monto cero")
            return
        }
        resultados.add("Pago procesado: $monto")

    })
    return resultados
}


fun main() {
    val pagos = listOf(100.0, -50.0, 0.0, 200.0, -10.0, 150.0)
    procesarPagos(pagos).forEach { println(it) }
    // Pago procesado: 100.0
    // Error: monto negativo
    // Error: monto cero
    // Pago procesado: 200.0
    // Error: monto negativo
    // Pago procesado: 150.0


    println()

    val saludar = fun(nombre: String) {
        println("Hola $nombre")
    }
    saludar("Frank")

    val saludarExp = fun(nombre: String) = println("Hola $nombre expresión")
    saludarExp("Frank")
}