package com.example.projetomentoria.orientacaoaobjeto.classes

open class Carro(
    var modelo: String,
    var velocidade: Double = 0.0
) {

    fun acelerar() {
        velocidade += 1
        println("acelerando a ${velocidade} km/h")
    }

    open fun frear() {
        if (velocidade > 0) {
            println("freando a ${velocidade} km/h")
        } else {
            println("o carro já está parado")
        }
    }

    fun acenderFarol() {
        println("farol aceso")
    }
}
