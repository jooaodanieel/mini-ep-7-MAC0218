package domain

import domain.criterios.Basico
import domain.criterios.CriterioDeAprovacao
import domain.criterios.Intermediario
import domain.criterios.Rigoroso
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

@Suppress("unused")
internal class AnalisadorDeAprovacaoTest {

    private lateinit var underTest: AnalisadorDeAprovacao

    @BeforeEach
    fun setup() {
        underTest = AnalisadorDeAprovacao()
    }

    @Test
    fun `aceita definir e redefinir o criterio`() {
        val criterios: List<CriterioDeAprovacao> = listOf(Basico(), Intermediario(), Rigoroso())

        criterios.forEach { criterio ->
            Assertions.assertDoesNotThrow { underTest.defineCriterio(criterio) }
        }
    }
}