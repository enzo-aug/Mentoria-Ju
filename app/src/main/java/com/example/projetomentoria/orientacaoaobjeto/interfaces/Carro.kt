package com.example.projetomentoria.orientacaoaobjeto.interfaces

class Carro: Automovel {
    override fun acelerar() {
        println("Acelerando o carro pisando no acelerador")
    }

    override fun frear() {
        println("Freando o carro pisando no freio")
    }
}