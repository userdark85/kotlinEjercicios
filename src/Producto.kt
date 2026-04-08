class Producto(
    var nombre: String,
    var precio: Double,
    var cantidad: Int,
    var cantidadMinima: Int
) {

    fun estaEnStockCritico(): Boolean {
        return cantidad <= cantidadMinima
    }

    fun calcularValorTotal(): Double {
        return precio * cantidad
    }

    fun abastecer(unidades: Int) {
        cantidad += unidades
    }

    fun vender(unidades: Int): Boolean {
        return if (cantidad >= unidades) {
            cantidad -= unidades
            true
        } else {
            false
        }
    }
}