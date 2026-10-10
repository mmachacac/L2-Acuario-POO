package acuario

open class Acuario(
    open var largo: Int = 100,
    open var ancho: Int = 20,
    open var alto: Int = 40
) {
    init {
        println("inicializando acuario")
    }

    // Propiedad calculada mediante un getter
    open var volumen: Int
        get() = ancho * alto * largo / 1000
        set(valor) {
            alto = (valor * 1000) / (ancho * largo)
        }

    open val forma = "rectángulo"
    open var agua: Double = 0.0
        get() = volumen * 0.9

    // Constructor secundario
    constructor(numeroDePeces: Int) : this() {
        // 2000 cm³ por pez + 10% de espacio adicional
        val tanque = numeroDePeces * 2000 * 1.1
        alto = (tanque / (largo * ancho)).toInt()
    }

    fun imprimirTamano() {
        println(forma)
        println("Ancho: $ancho cm " +
                "Largo: $largo cm " +
                "Alto: $alto cm ")
        println("Volumen: $volumen l Agua: $agua l (${agua/volumen*100.0}% lleno)")
    }
}