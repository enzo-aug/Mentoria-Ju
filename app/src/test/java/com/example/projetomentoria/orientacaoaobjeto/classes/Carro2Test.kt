package com.example.projetomentoria.orientacaoaobjeto.classes

import org.junit.Test

class Carro2Test {
    @Test
    fun `testar o carro2`() {

        val gol = Carro2(
            "gol",
            MecanismoAceleracaoImpl(),
        )

        gol.cor = "vermelho"
        println(gol.velocidade)
        gol.acelerar()
    }
}