package com.example.projetomentoria.solid.lsp.billing

class PersonalLicense: License {
    override fun calculateLicenseFee(): Double {
        return 100.0
    }
}