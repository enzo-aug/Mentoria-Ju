package com.example.projetomentoria.solid.lsp.billing

class BusinessLicense: License {
    override fun calculateLicenseFee(): Double {
        return 200.0
    }
}