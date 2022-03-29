package modelo

class Repartidor : Empleado {

    private var zona: String

    constructor(nombre: String, edad: Int, salario: Int, zona: String) : super(nombre, edad, salario) {
        this.zona = zona
    }

    override fun plus() {
        if(this.edad > 25 && zona == "zona 3"){
            salario += PLUS
        }
    }
}