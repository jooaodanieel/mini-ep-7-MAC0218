package domain.criterios

import domain.Boletim

class Intermediario : CriterioDeAprovacao {
    override fun estaAprovado(boletim: Boletim): Boolean {
        return boletim.mediaEPs >= 6.5 && boletim.mediaMiniEPs >= 7.5
    }
}