package com.example.homework

import kotlin.random.Random

fun randomGame(){
    val min = 1
    val max = 10
    var playAgain = true

   while (playAgain){
       val randomNumbers = Random.nextInt(min, max +1)
       var result = false

       println("Угадайте число от 1 до 10")

       while (!result){

       val userInput = readln().toIntOrNull()
       if (userInput != null && userInput != randomNumbers){
           if(userInput > randomNumbers){
               println("Неверно. Загаданное число меньше ")
           } else println("Неверно. Загаданное число больше")
       }
       if(userInput == randomNumbers) {
           println("Поздравляю! Верный ответ.")
           result = true
       }
       }
       println("Сыграем ещё?(да/нет)")
       val userInput2 = readlnOrNull()?.trim()?.toLowerCase()

       when(userInput2){
           "да" -> playAgain = true
           "нет" -> playAgain = false
           else -> println("Ошибка! Недопустимый ввод. Игра остановлена.")
       }
       playAgain = false
   }
}

fun main(){
    randomGame()
}