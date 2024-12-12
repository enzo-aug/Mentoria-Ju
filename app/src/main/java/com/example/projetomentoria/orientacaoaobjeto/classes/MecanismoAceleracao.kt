package com.example.projetomentoria.orientacaoaobjeto.classes

interface MecanismoAceleracao {
    fun acelerar()
}

class MecanismoAceleracaoImpl : MecanismoAceleracao {
    override fun acelerar() {
       println("acelerou")
    }
}
