package ejercicios6Mayo

/*
Ejercicio 3 - Un pedido por cliente
Dada una lista de pedidos, retorna un pedido representativo
por cada cliente (el primero que aparezca).
- Usa distinctBy
- Retorna List<Pedido>
*/

data class Pedido(val id: Int, val cliente: String, val total: Double)

fun pedidosPorCliente(pedidos: List<Pedido>) = pedidos.reversed().distinctBy { it.cliente }


fun main() {
    val pedidos = listOf(
        Pedido(1, "María", 150.0),
        Pedido(2, "Carlos", 200.0),
        Pedido(3, "María", 300.0),
        Pedido(4, "Luis", 100.0),
        Pedido(5, "Carlos", 50.0)
    )
    println(pedidosPorCliente(pedidos))
    // [Pedido(id=1, cliente=María, total=150.0),
    //  Pedido(id=2, cliente=Carlos, total=200.0),
    //  Pedido(id=4, cliente=Luis, total=100.0)]
}