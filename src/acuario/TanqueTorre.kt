package acuario

import kotlin.math.PI

class TanqueTorre(override var alto: Int, var diametro: Int):
Acuario(alto = alto, ancho = diametro, largo = diametro) {
    override var volumen: Int
        // área elíptica = π * r1 * r2
        get() = (ancho / 2 * largo / 2 * alto / 1000 * PI).toInt()
        set(valor) {
            alto = ((valor * 1000 / PI) / (ancho/2 * largo/2)).toInt()
        }

    override var agua: Double = volumen * 0.8
    override val forma = "cilindro"
}