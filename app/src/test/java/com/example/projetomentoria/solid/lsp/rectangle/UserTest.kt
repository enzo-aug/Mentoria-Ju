package com.example.projetomentoria.solid.lsp.rectangle

import org.junit.Test


class UserTest {
    @Test
    fun `testRectangleArea`() {
        val rectangle = RectangleImpl()
        rectangle.height = 10
        rectangle.width = 5
        val user = User()
        user.calculateArea(rectangle)
    }

    @Test
fun `testSquareArea`() {
        val square = Square()
        square.setSide(5)
        val user = User()
        user.calculateArea(square)
    }
}