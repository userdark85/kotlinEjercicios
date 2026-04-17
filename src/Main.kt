//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    var continuar = "sí"

    while (continuar == "sí") {

        println("Bienvenido a mi calculadora")

        println("Ingresa el primer número:")
        val numero1 = readln().toDouble()

        println("Ingresa la operación (+, -, *, /):")
        val operacion = readln()

        println("Ingresa el segundo número:")
        val numero2 = readln().toDouble()

        if (operacion == "+") {
            val resultado = numero1 + numero2
            println("El resultado es: $resultado")
        }

        else if (operacion == "-") {
            val resultado = numero1 - numero2
            println("El resultado es: $resultado")
        }

        else if (operacion == "*") {
            val resultado = numero1 * numero2
            println("El resultado es: $resultado")
        }

        else if (operacion == "/") {
            if (numero2 == 0.0) {
                println("No se puede dividir entre cero.")
            } else {
                val resultado = numero1 / numero2
                println("El resultado es: $resultado")
            }

        }

        else {
            println("Error: Operación no válida.")
        }

        println("¿Deseas realizar otro cálculo? (escribe 'sí' o 'no'):")

        continuar = readln()

    }

    println("¡Gracias por usar la calculadora, hasta pronto!")

}