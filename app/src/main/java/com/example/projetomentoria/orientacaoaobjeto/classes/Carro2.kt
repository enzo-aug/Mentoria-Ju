package com.example.projetomentoria.orientacaoaobjeto.classes


/* Repare que o mecanismo de aceleração é inserido no carro ao ser construído, e
        não o vemos nem podemos modificá-lo, isto é, não tem getter nem setter.
        Já o "modelo" pode ser visto, mas não alterado. */

open class Carro2(
    val modelo: String,
    val mecanismoAceleracao: MecanismoAceleracao,
    val velocidade: Double = 0.0
) {
    /* podemos mudar a cor do carro quando quisermos */
    var cor: String? = null

    fun acelerar() {
        mecanismoAceleracao.acelerar()
    }

    fun frear() {
        /* código do carro para frear */
    }

    fun acenderFarol() {
        /* código do carro para acender o farol */
    }

    private fun setVelocidade() {
        /* código para alterar a velocidade do carro */
        /* Como só o próprio carro deve calcular a velocidade, 
            esse método não pode ser chamado de fora, por isso é "private" */
    }
}