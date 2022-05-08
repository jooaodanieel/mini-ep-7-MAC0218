package domain

import org.junit.jupiter.api.BeforeEach

@Suppress("unused")
internal class AnalisadorDeAprovacaoTest {

    private lateinit var underTest: AnalisadorDeAprovacao

    @BeforeEach
    fun setup() {
        underTest = AnalisadorDeAprovacao()
    }

}