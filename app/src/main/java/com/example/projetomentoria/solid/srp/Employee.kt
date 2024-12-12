package com.example.projetomentoria.solid.srp

class Employee(
    val name: String,
    val hoursWorked: Int,
    val calculatePay: CalculatePay,
    val save: Save,
    val reportHours: ReportHours
) {

    fun calculatePay() {
        calculatePay.calculatePay()
    }

    fun save() {
        save.save()
    }

    fun reportHours() {
        reportHours.reportHours()
    }
}