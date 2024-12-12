package com.example.projetomentoria.solid.lsp.billing

class Billing(
    private val license: License
) {
    fun calculateLicenseFee(): Double {
        println("License fee: ${license.calculateLicenseFee()}")
        return license.calculateLicenseFee()
    }
}