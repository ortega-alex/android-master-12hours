package com.dev.androidmaster

fun main() {
    ifMultiple()
}

fun ifMultipleOr() {
    var pet = "dog"
    if (pet == "dog" || pet == "cat") {
        println("Es un perro o un gato")
    } else {
        println("No es un perro o un gato")
    }
}

fun ifMultiple() {
    var age = 18
    var parentPermission = false
    if (age >= 18 && parentPermission) {
        println("Beber cerveza")
    } else {
        println("No puede beber cerveza")
    }
}

fun ifInt() {
    var age = 29
    if (age >= 18) {
        println("Beber cerveza")
    } else {
        println("Beber jugo")
    }
}

fun ifBoolean (){
    var soyFeliz:Boolean = false
    // si nada == true
    // con ! al principo == false
    if (!soyFeliz) {
        println("Estoy triste")
    }
}

fun ifAnimal(){
    val animal = "dog"
    if (animal == "dog") {
        println("Es un perrito")
    } else if (animal == "cat") {
        println("Es un gato")
    } else if (animal == "bird") {
        println("Es un pajaro")
    } else {
        println("no es un  animal contemplado")
    }
}

fun ifElse() {
    val name = "Aris"
    if (name == "Pedro") {
        println("Oye, la variable name es ARIS")
    } else {
        println("Este no es Aris")
    }
}

fun ifBasico() {
    val name = "Aris"
    if (name == "Aris") {
        println("Oye, la variable name es ARIS")
    }
}