//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

        val producto1 = Producto("Laptop", 8000.0, 5, 2)
        val producto2 = Producto("Mouse", 50.0, 10, 3)
        val producto3 = Producto("Teclado", 100.0, 2, 3)

        val inventario = Inventario()

        inventario.agregarProducto(producto1)
        inventario.agregarProducto(producto2)
        inventario.agregarProducto(producto3)

        producto1.vender(3)
        producto3.vender(1)

        producto3.abastecer(5)

        inventario.reportar()
}