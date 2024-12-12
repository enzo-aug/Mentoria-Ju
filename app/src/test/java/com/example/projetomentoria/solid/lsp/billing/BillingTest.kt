package com.example.projetomentoria.solid.lsp.billing

import org.junit.Test


class BillingTest {
    @Test
    fun testCalculateLicenseFeePersonal() {
        // O usuário escolhe na tela a licença que deseja comprar
        val licenseType = "personal"
        // if personal
        val personalLicense = PersonalLicense()
        val billing = Billing(personalLicense)
        billing.calculateLicenseFee()
    }

    @Test
    fun testCalculateLicenseFeeBusiness() {
        // O usuário escolhe na tela a licença que deseja comprar
        val licenseType = "business"
        // if business
        val businessLicense = BusinessLicense()
        val billing = Billing(businessLicense)
        billing.calculateLicenseFee()
    }
}