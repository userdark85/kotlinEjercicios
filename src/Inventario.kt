class Inventario {

    private val productos = mutableListOf<Producto>()

    fun agregarProducto(producto: Producto) {
        productos.add(producto)
    }

    fun productosEnAlerta(): List<Producto> {
        return productos.filter { it.estaEnStockCritico() }
    }

    fun valorTotalInventario(): Double {
        return productos.sumOf { it.calcularValorTotal() }
    }

    fun reportar() {
        println("REPORTE DE INVENTARIO")

        for (p in productos) {
            println("Producto: ${p.nombre}")
            println("Precio: ${p.precio}")
            println("Cantidad: ${p.cantidad}")
            println("Valor total: ${p.calcularValorTotal()}")
            println("--------------------------")
        }

        println("Valor total del inventario: ${valorTotalInventario()}")

        println("Productos en alerta:")
        for (p in productosEnAlerta()) {
            println("- ${p.nombre}")
        }
    }
}