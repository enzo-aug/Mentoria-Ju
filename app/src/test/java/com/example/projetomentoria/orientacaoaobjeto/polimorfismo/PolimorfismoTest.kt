package com.example.projetomentoria.orientacaoaobjeto.polimorfismo

import com.example.projetomentoria.orientacaoaobjeto.interfaces.Automovel
import com.example.projetomentoria.orientacaoaobjeto.interfaces.Carro
import com.example.projetomentoria.orientacaoaobjeto.interfaces.Moto
import org.junit.Test

class PolimorfismoTest {
    @Test
    fun testPolimorfismo() {
        val moto = Moto()
        val carro = Carro()

        val automoveis: List<Automovel> = listOf(carro, moto)

        automoveis.forEach { automovel ->
            automovel.acelerar()
            automovel.frear()
        }
    }
}