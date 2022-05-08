package domain.criterios

import domain.Boletim

interface CriterioDeAprovacao {

    fun estaAprovado(boletim: Boletim): Boolean

    fun mediaFinal(boletim: Boletim): Double

}