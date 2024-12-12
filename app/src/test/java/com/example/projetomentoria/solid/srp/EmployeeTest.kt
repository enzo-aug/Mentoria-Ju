package com.example.projetomentoria.solid.srp

import org.junit.Test


class EmployeeTest {

        @Test
        fun `should calculate pay`() {
            val ju = Employee("John", 40, CalculatePay(), Save(), ReportHours())
            ju.calculatePay()
        }

        @Test
        fun `should save employee`() {
            val gloria = Employee("John", 40, CalculatePay(), Save(), ReportHours())
            gloria.save()
        }

        @Test
        fun `should report hours`() {
            val enzo = Employee("John", 40, CalculatePay(), Save(), ReportHours())
            enzo.reportHours()
        }
}