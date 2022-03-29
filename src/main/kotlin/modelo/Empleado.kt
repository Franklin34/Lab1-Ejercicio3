package modelo

abstract class Empleado {

    val PLUS = 300

    protected var nombre: String = ""
    protected var edad: Int = 0
    protected var salario: Int = 0

    constructor(nombre: String, edad: Int, salario: Int) {
        this.nombre = nombre
        this.edad = edad
        this.salario = salario
    }

    abstract fun plus()

    override fun toString(): String {
        return "Empleado(nombre='$nombre', edad=$edad, salario=$salario)"
    }
}