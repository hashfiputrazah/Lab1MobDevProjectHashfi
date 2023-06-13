package com.tsu.lab1mobdevprojecthashfi

object Validator {

    fun validateInput(amount: Int, desc:String): Boolean {
        return !(amount <= 0 || desc.isEmpty())
    }
}