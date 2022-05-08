package domain

class BoletimFechado(
    override val mediaEPs: Double,
    override val mediaMiniEPs: Double,
    @Suppress("unused")
    val mediaFinal: Double,
    @Suppress("unused")
    val foiAprovado: Boolean
) : Boletim(mediaEPs, mediaMiniEPs)