package com.example.projetomentoria.orientacaoaobjeto.interfaces

class Moto: Automovel {
    override fun acelerar() {
        println("Acelerando a moto usando o guidão")
    }

    override fun frear() {
        println("Freando a moto usando o guidão")
    }
}