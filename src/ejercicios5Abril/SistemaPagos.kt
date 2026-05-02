package ejercicios5Abril

/*
Ejercicio 2 - Sistema de pagos
Crea dos excepciones personalizadas y úsalas en una función
de procesamiento de pago.

- SaldoInsuficienteException: recibe saldoActual y montoRequerido (ambos Double)
- TarjetaVencidaException: recibe numeroTarjeta (String)

La función procesarPago debe:
- Si monto > saldo → lanzar SaldoInsuficienteException
- Si vencida == true → lanzar TarjetaVencidaException
- Si todo ok → imprimir "Pago procesado: $monto"
*/

// Tus excepciones aquí

class SaldoInsuficienteException(val saldoActual: Double, val montoRequerido: Double) : Exception(
    "Saldo insuficiente: El saldo requerido debe ser menor o igual a $saldoActual"
)

class TarjetaVencidaException(val numeroTarjeta: String) : Exception(
    "Número de tarjeta vencida: $numeroTarjeta"
)

fun procesarPago(monto: Double, saldo: Double, numeroTarjeta: String, vencida: Boolean) {
    if (monto > saldo) throw SaldoInsuficienteException(saldo, monto)
    if (vencida) throw TarjetaVencidaException(numeroTarjeta)
    println("Pago procesado: $monto")
}

fun main() {
    try {
        procesarPago(40.0, 50.0, "1234-5678", true)
    } catch (e: SaldoInsuficienteException) {
        println(e)
        println("Saldo: ${e.saldoActual}, Necesita: ${e.montoRequerido}")
    } catch (e: TarjetaVencidaException) {
        println(e)
        println("Tarjeta vencida: ${e.numeroTarjeta}")
    }
}