package com.example.homework

fun calculate(string: String): Float{

    val values = string.split(" ")
    if(values.size != 3){
        println("Ошибка. Недопустимый ввод")
        return Float.NaN
    }
    val operand1 = values[0].toFloatOrNull()
    val operator = values[1]
    val operand2 = values[2].toFloatOrNull()

    if(operand1 == null || operand2 == null){
        println("Ошибка. Недопустимые значения")
        return Float.NaN
    }
    return when(operator){

        "+" -> operand1 + operand2
        "-" -> operand1 - operand2
        "*" -> operand1 * operand2
        "/" -> operand1 / operand2
        else ->{
            println("Ошибка. Недопустимый оператор")
            return Float.NaN
        }
    }
}


fun main(){
    println(calculate("5 + 5"))
    println(calculate ("6 * 0"))
    println(calculate("14 +* 1"))
    println(calculate(" + 5"))
    println(calculate("-"))

}