import modelo.Comercial
import modelo.Repartidor

fun main(args: Array<String>) {

    val repartidor1 = Repartidor("Franklin", 21, 100, "zona 3")
    val repartidor2 = Repartidor("Sofia", 28, 100, "zona 3")
    val repartidor3 = Repartidor("Daniel", 26, 300, "zona 3")

    val comercial1 = Comercial("Miguel", 45, 788, 25.6)
    val comercial2 = Comercial("Xinia", 51, 600, 29.7)
    val comercial3 = Comercial("Fabian", 31, 400, 201.0 )

    println("=== Repartidores sin el PLUS ===")
    println()

    println(repartidor1.toString())
    println(repartidor2.toString())
    println(repartidor3.toString())

    println()

    repartidor1.plus()
    repartidor2.plus()
    repartidor3.plus()

    println("=== Repartidores con el PLUS ===")
    println()

    println(repartidor1.toString())
    println(repartidor2.toString())
    println(repartidor3.toString())

    println()

    println("=== Comerciales sin el PLUS ===")
    println()

    println(comercial1.toString())
    println(comercial2.toString())
    println(comercial3.toString())

    println()

    comercial1.plus()
    comercial2.plus()
    comercial3.plus()

    println("=== Comerciales con el PLUS ===")
    println()

    println(comercial1.toString())
    println(comercial2.toString())
    println(comercial3.toString())

    println()

    println("")
}