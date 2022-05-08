package domain.criterios

import domain.Boletim

class Basico : CriterioDeAprovacao {
    override fun estaAprovado(boletim: Boletim): Boolean {
        return boletim.mediaEPs >= 5.0 && boletim.mediaMiniEPs >= 5.0
    }

    override fun mediaFinal(boletim: Boletim): Double {
        return (boletim.mediaEPs + boletim.mediaMiniEPs) / 2
    }
}