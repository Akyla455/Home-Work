package com.example.homework

fun сalculate2(string: String): Float {

    // разделяем входящую строку на элементы
    val values = string.split(" ")
    // делаем проверку на нечётное количество элементов
    if (values.size % 2 == 0) {
        //Выкидываем ошибку, если элементов чётное количество
        println("Ошибка. Недопустимый ввод")
        return Float.NaN
    }
    val stack = mutableListOf<Float>()
    //Добавляем первый элемент в stack и приводим к типу Float
    stack.add(values[0].toFloat())
    // Перебираем элементы начиная со второго исключаяя последний с шагом 2
    for (i in 1 until values.size step 2) {
        val operator = values[i]
        val operand = values[i + 1].toFloatOrNull()
        if (operand == null) {
            println("Ошибка. Недопустимые значения")
            return Float.NaN
        }
        when (operator) {
            "+" -> stack.add(operand)
            "-" -> stack.add(-operand)
            "*" -> stack[stack.lastIndex] *= operand
            "/" -> stack[stack.lastIndex] /= operand
            else -> {
                println("Ошибка. Недопустимый оператор")
                return Float.NaN
            }
        }
    }
    return stack.sum()
}

fun main() {
    println(сalculate2("* 2 + 3"))
    println(сalculate2("2 * 2 = 4"))
    println(сalculate2("2 * 2 + 3"))
    println(сalculate2("2 + 2 * 3"))
    println(сalculate2("2 + 2 + 2 + 2 * 3"))

}