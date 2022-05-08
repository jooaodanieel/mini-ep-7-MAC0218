package domain.criterios

import domain.Boletim

@Suppress("unused")
class Rigoroso : CriterioDeAprovacao {
    override fun estaAprovado(boletim: Boletim): Boolean {
        return boletim.mediaEPs >= 8.0 && boletim.mediaMiniEPs >= 8.5
    }
}