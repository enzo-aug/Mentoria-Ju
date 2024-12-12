package com.example.projetomentoria.orientacaoaobjeto.heranca

class HondaFitHrv: HondaFitModelo(
    modeloHonda = "Honda Fit HRV"
) {
    override fun frear() {
        println("freando o Honda Fit HRV com Abs")
        super.frear()
    }
}