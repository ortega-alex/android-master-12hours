package com.dev.androidmaster

// COMENTARIOS
/**
 * COMENTARIOS DE MULTIPLES LINEAS
 * */

/**
 * VALUES NUMERICAS = val
 * concencion para escribir lower Camel Case
 * NO PUEDEN EXISTER DOS VARIABLES CON EL MISMO NOMBRE
 * las val son valores que son constantes
 *
 */

/**
 * VARIABLES GLOBALES
 */
val age: Int = 30

fun main() {
    showMyName()
    showMyName2()
    showMyAge(29)
    add(25, 76)
    val mySubstract = subtract(25, 76)
    println(mySubstract)
    val mySubstractCool = subtractColl(25, 76)
    println(mySubstractCool)
}

// Funcion simple
fun showMyName() {
    println("Me llamao")
}

// Parametros por defecto
fun showMyName2(name:String = "Aris") {
    println("Me llamao $name")
}

// Funcion con parametro
fun showMyAge(currentAge: Int) {
    println("Tengo $currentAge anios")
}

// Funcion con mas de un parametro
fun add(firstNumber: Int, seconNumber: Int) {
    println(firstNumber + seconNumber)
}

// Funcion con parametros de salida
fun subtract(firstNumber: Int, seconNumber: Int): Int {
    return firstNumber - seconNumber
}

// Funcion | simplificar funciones con return
fun subtractColl(firstNumber: Int, seconNumber: Int): Int = firstNumber - seconNumber

fun variableAlfanumerico() {

    /**
     * Variable Alfanumericas
     */

    // Char | solo soporta un caracter | se declara con comillas simples
    val charExample1: Char = 'e'
    val charExample2: Char = '2'
    val charExample3: Char = '@'

    // String | se escribe con comillas dobles
    val stringExample: String = "AristiDevs suscribete"
    val stringExample1: String = "2"
    val stringExample2: String = "23"

    print(stringExample1.toInt() + stringExample2.toInt())

    // formas de concatenar valiables dentro de un string
    var stringConcatenada: String = ""
    stringConcatenada = "Hola me llama $stringExample y tengo anios $age"
    println(stringConcatenada)

    print(stringExample)
}

fun variablesBoolean() {
    /**
     * Variables Booleanas
     */

    // Boolean
    val booleanExample: Boolean = true
    val booleanExample2: Boolean = false

}

fun variablesNumericas() {
    /**
     * VARIABLES = var
     */

    val name = "AristiDevs"
    // Int | -2,147,483,647 a  2,147,483,647
    var age2: Int = 30
    // age = 30 // da error al ser una val
    age2 = 39;

    // Long | utiliza mas memoria al poder soportar mas | -9,223,372,036,854,775,807 a 9,223,372,036,854,775,807
    val example: Long = 30

    // Float | para definer floar hay que agregarle una f al final
    val floatExample: Float = 30.5f

    // Doble | es similar a float pero soportan 14 decimales | mas memoria
    val dobleExample: Double = 3241.3223123


    println("Sumar")
    println(age + age2)

    println("Restar")
    println(age - age2)

    println("Multiplicar")
    println(age * age2)

    println("Dividir")
    println(age / age2)

    println("Modulo | Resto ")
    println(age % age2)

    var exampleSuma = age + floatExample.toInt()
}