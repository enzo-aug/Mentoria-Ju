package com.example.projetomentoria.solid.lsp.rectangle

class Square: Rectangle {
    override var height: Int = 0
    override var width: Int = 0

    fun setSide(side: Int) {
        this.height = side
        this.width = side
    }
}