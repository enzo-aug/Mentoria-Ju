package com.example.projetomentoria.orientacaoaobjeto.classes

import org.junit.Test

class CarroTest {
    @Test
    fun `testar o carro fusca`() {
        val fusca = Carro("Fusca")
        fusca.acelerar()
        fusca.frear()
        fusca.acenderFarol()
        println(fusca.modelo)
    }

    @Test
    fun `testar o carro gol`() {
        val gol = Carro("Gol")
        gol.acelerar()
        gol.frear()
        gol.acenderFarol()
        println(gol.modelo)
    }
}