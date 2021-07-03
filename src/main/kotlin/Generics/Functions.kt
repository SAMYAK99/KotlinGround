package Generics

/*
* Generics can work with differnet data types
* 
* Generic functions
specify a type parameter during their declaration and any statement calling these functions, has to
specify the type parameter while invoking the said function.
*
* Generic functions and classes allow code reusability and allow all us to use these functions for
any classes that inherit the class “Any?”.
* */


fun <T> printName (content : T){
    println("The content is $content")
}

fun main(){
    printName<String>("Alex")
    printName<Int>(5)
}