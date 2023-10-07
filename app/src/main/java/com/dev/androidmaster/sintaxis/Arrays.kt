package com.dev.androidmaster

fun main() {
    var name:String = "AristiDevs"

    // indice de 0-6
    // tamanio 7

    // el array no permite agregar propiedades solo modificar
    val weekDays = arrayOf("Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domindo")
    println(weekDays[0])

    // nos permite obtener el tamanio
    println(weekDays.size)

    // si el indice no existe da error
    // println(weekDays[7])

    // recorer un array
    // por indices
    /*
    for (position in weekDays.indices) {
        println("He pasado por aqui $position")
        println(weekDays[position])
    }
    */

    // por valor e index
    /*
    for ((position, value) in weekDays.withIndex()) {
        println("La posicion $position contiene $value")
    }
     */

    // por valor
    for (weeDay in weekDays) {
        println("Ahora es $weeDay")
    }
}