package domain

class BoletimFechado(
    override val mediaEPs: Double,
    override val mediaMiniEPs: Double,
    val mediaFinal: Double,
    val foiAprovado: Boolean
) : Boletim(mediaEPs, mediaMiniEPs)