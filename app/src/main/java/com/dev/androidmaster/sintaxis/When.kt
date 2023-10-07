package com.dev.androidmaster

fun main() {
    var result = getTrimestreReturn2(2)
    println(result)
}

fun getTrimestreReturn2(month: Int) = when (month) {
    in 1..3 -> "Primer trimestre"
    in 4..6 -> "Segundo Trimestre"
    in 8..9 -> "Tercer Trimestre"
    10, 11, 12 -> "Cuarto Trimestre"
    else -> "Semestre no valido"
}

fun getTrimestreReturn(month: Int): String {
    return when (month) {
        in 1..3 -> "Primer trimestre"
        in 4..6 -> "Segundo Trimestre"
        in 8..9 -> "Tercer Trimestre"
        10, 11, 12 -> "Cuarto Trimestre"
        else -> "Semestre no valido"
    }
}

fun result(value: Any) { // puede ser cualquier valor
    when (value) {
        is Int -> value + value
        is String -> println(value)
        is Boolean -> if (value) println("Holiwi")
    }
}

fun getTrimestre(month: Int) {
    when (month) {
        in 1..3 -> println("Primer trimestre") // rangos
        in 4..6 -> println("Segundo Trimestre")
        in 8..9 -> println("Tercer Trimestre")
        10, 11, 12 -> println("Cuarto Trimestre") // separado por comas
        !in 1..12 -> println("Semestre no valido") // forma para negarlo o sustituir el else
    }
}

fun getMonth(month: Int) {
    when (month) {
        1 -> println("Enero")
        1 -> println("Febrero")
        1 -> println("Marzo")
        1 -> println("Abril")
        1 -> println("Mayo")
        1 -> println("Junio")
        1 -> println("Julio")
        1 -> println("Agosto")
        1 -> println("Septiembre")
        1 -> println("Octubre")
        1 -> println("Noviembre")
        1 -> println("Diciembre")
        else -> println("No es un mes valido")
    }
}

