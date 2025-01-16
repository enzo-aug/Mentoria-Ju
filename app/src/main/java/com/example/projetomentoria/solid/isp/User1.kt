package com.example.projetomentoria.solid.isp

import com.example.projetomentoria.solid.isp.operations.OPS

class User1(private val ops: OPS) {
    fun op1() {
        ops.op1()
    }
}