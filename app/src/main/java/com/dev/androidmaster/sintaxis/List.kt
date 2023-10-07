package com.dev.androidmaster

fun main() {
  // inmutableList()
    mutableList()
}

fun mutableList() {
    val weekDays:MutableList<String> = mutableListOf("Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domindo")
    println(weekDays)

    // agregar una propiedad
    // weekDays.add("AristiDay") // .add agregar el valor al final
    weekDays.add(0, "AristiDay") // si sele indica el indice agrade en esa posicion y lo demas lo desplaza
    println(weekDays)

    // como saver si contiene elemenentos
    println(weekDays.isEmpty())
    println(weekDays.isNotEmpty()) // saver si no esta vacia

    // tabien se pude recorrer con for
    for (value in weekDays) {
        println(value)
    }
}

fun inmutableList() {
    val readOnly:List<String> = listOf("Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domindo")
    println(readOnly.size)

    println(readOnly) // es lo mismo que  readOnly.toString() ya que lo realiza automaticamente

    // acceder a un indice
    println(readOnly[0])

    // obtener el ultimo valor
    println(readOnly.last())

    // obtener el primero de la lista
    println(readOnly.first())

    // filtar | filtar todos los valores que contengan una 'a', tomar en cuenta que es case sensitive
    // val example = readOnly.filter { it.contains("a") }

    val example = readOnly.filter { item ->  item.contains("a") } // tambien se puede ( val example = readOnly.filter { it.contains("a") } )
    println(example)

    // forma de iterar lista
    readOnly.forEach {weekDay ->  println(weekDay)} // tambien se puede simplificar a (readOnly.forEach {println(it)})

}