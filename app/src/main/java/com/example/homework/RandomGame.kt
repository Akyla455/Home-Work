package com.example.homework




fun generateRandomNumber(min: Int, max: Int): Int {
    return (min..max).random()
}

fun checkUserInput(userInput: Int, randomNumber: Int): Boolean {
    if (userInput != randomNumber) {
        if (userInput > randomNumber) {
            println("Неверно. Загаданное число меньше ")
        } else {
            println("Неверно. Загаданное число больше")
        }
        return false
    } else {
        println("Поздравляю! Верный ответ.")
        return true
    }
}

fun readUserInput(): Int? {
    println("Угадайте число от 1 до 10")
    return readLine()?.toIntOrNull()
}

fun askToPlayAgain() {
    println("Сыграем ещё? (да/нет)")
    val userInput = readLine()?.trim()?.toLowerCase()

    when (userInput) {
        "да" -> randomGame()
        "нет" -> println("Спасибо за игру.")

        else -> {
            println("Ошибка! Недопустимый ввод.")
            askToPlayAgain()
        }
    }
}

fun randomGame() {
    val min = 1
    val max = 10

        val randomNumber = generateRandomNumber(min, max)
        var result = false

        while (!result) {
            val userInput = readUserInput()
            if (userInput != null) {
                result = checkUserInput(userInput, randomNumber)
            }
        }
        askToPlayAgain()
    }


fun main() {
    randomGame()
}