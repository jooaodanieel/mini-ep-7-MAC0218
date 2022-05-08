package domain.criterios

import domain.Boletim

class Intermediario : CriterioDeAprovacao {
    override fun estaAprovado(boletim: Boletim): Boolean {
        return boletim.mediaEPs >= 6.5 && boletim.mediaMiniEPs >= 7.5
    }

    override fun mediaFinal(boletim: Boletim): Double {
        return (2 * boletim.mediaEPs + boletim.mediaMiniEPs) / 3
    }
}