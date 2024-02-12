package com.example.homework

abstract class Book(val title: String,
                val isbn: String,
                val description: String)

class FictionBook(title: String,
                  isbn: String,
                  description: String,
                  val genre: String):
                  Book(title, isbn, description)

class ScientificBook(title: String,
                     isbn: String,
                     description: String,
                     val discoveryDate: String):
                     Book(title, isbn, description)

class ChildrenBook(title: String,
                   isbn: String,
                   description: String,
                   val age: Int):
                   Book(title, isbn, description)

class Library(){
    val books = hashMapOf<String, Book>()

    fun add(book: Book){
        books[book.title] = book
        println("Книга добалена")
    }

    fun remove(book: Book){
        books.remove(book.title)
        println("Книга удалена")
    }

    fun search(title: String): Book?{
        return books[title]



    }


}

fun main(){
    val library = Library()
    val childrenBook = ChildrenBook("Колобок", "123","Описание колобка", 5)
    val fictionBook = FictionBook("Фантастика", "456", "Описание фантастики", "Жанр: детектив")
    val scientificBook = ScientificBook("Научная книга", "789", "Описание","15.08.1974")

    library.add(childrenBook)
    library.add(fictionBook)
    library.add(scientificBook)


    val searchLibrary = library.search("Колобок")
    if(searchLibrary != null){
        println("Книга найдена ${searchLibrary.title}")
    } else println("Книга не найдена")

    library.remove(fictionBook)
}

