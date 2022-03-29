package modelo

class Comercial: Empleado {

    private var comision: Double

    constructor(nombre: String, edad: Int, salario: Int, comision: Double) : super(nombre, edad, salario) {
        this.comision = comision
    }

    override fun plus() {
        if(this.edad > 30 && comision > 200){
            salario += PLUS
        }
    }
}