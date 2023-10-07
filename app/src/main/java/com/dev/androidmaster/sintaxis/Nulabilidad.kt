package com.dev.androidmaster

fun main() {
    var name:String? = "Aris"
    println(name!!.get(3)) // afirma que el valor exite
    println(name?.get(3)) // previene si es null
}

