package com.example.homework

fun List<String?>.concatenate(): String {
    val result = StringBuilder()
    for(string in this){
        string?.let{ result.append(it) }
    }
    return result.toString()
}

fun main(){
    val nullableString = listOf("П", null, "ри", null, null, "ве", null, "т")
    val concatenateString = nullableString.concatenate()
    println(concatenateString)
}