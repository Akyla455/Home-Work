package com.example.homework

import kotlin.random.Random

fun randomGame(){
    val min = 1
    val max = 10

    val randomNumbers = Random.nextInt(min, max +1)
   while (true){
       println("Угадайте число от 1 до 10")
       val userInput = readln().toIntOrNull()
       if (userInput != null && userInput != randomNumbers){
           if(userInput > randomNumbers){
               println("Неверно. Загаданное число меньше ")
           } else println("Неверно. Загаданное число больше")
       }
       if(userInput == randomNumbers) {
           println("Поздравляю! Верный ответ. Сыграем ещё?")
           break
       }
   }
}

fun main(){
    randomGame()
}