package domain

import domain.criterios.Basico
import domain.criterios.CriterioDeAprovacao
import domain.criterios.Intermediario
import domain.criterios.Rigoroso
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import kotlin.test.assertIs

@Suppress("unused")
internal class AnalisadorDeAprovacaoTest {

    private lateinit var underTest: AnalisadorDeAprovacao

    @BeforeEach
    fun setup() {
        underTest = AnalisadorDeAprovacao()
    }

    @Test
    fun `aceita definir e redefinir o criterio`() {
        // dado
        val criterios: List<CriterioDeAprovacao> = listOf(Basico(), Intermediario(), Rigoroso())

        // quando ..., então
        criterios.forEach { criterio ->
            Assertions.assertDoesNotThrow { underTest.defineCriterio(criterio) }
        }
    }

    @Test
    fun `aceita fechar um boletim`() {
        // dado
        val boletim = Boletim(mediaEPs = 7.0, mediaMiniEPs = 9.0)
        underTest.defineCriterio(Basico())

        // quando
        val resultado = underTest.fechaBoletim(boletim)

        // então
        assertIs<BoletimFechado>(resultado)
    }
}