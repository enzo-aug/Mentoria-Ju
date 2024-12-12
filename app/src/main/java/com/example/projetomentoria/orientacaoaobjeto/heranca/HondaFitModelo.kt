package com.example.projetomentoria.orientacaoaobjeto.heranca

import com.example.projetomentoria.orientacaoaobjeto.classes.Carro

open class HondaFitModelo(
    modeloHonda: String
): Carro(
    modelo = modeloHonda,
    velocidade = 0.0,
) {
    override fun frear() {
        println("freando o Honda Fit")
        super.frear()
    }
}