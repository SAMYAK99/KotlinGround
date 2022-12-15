package Features

import java.lang.Integer.sum


/*
* Functional Programming : Normal Functions can be treated as objects
*
* Higher Order Functions
* Functions that accepts functions as arguments or return functions or both
*
* Lambda's : These are anonymous functions which doesn't have any name
* -> Multiline lambda's can be used with multiple statements having last line as the return type
* */
class HigherOrderFunctions {

    // In functional programming
    fun sum(a : Int , b : Int) : Int {
        return a+b
    }

    // Functions as an Input
    fun calculator(a : Int , b : Int ,gn : (Int ,Int) -> Int) : Unit {
         val res = gn(a,b)
        println(res)
    }

}

fun main(){

    // Storing functions inside a variable
    var a = ::sum
    println(a(4,5))

    val ho = HigherOrderFunctions()

    ho.calculator(3,4, :: sum)
    val lambda = {x : Int , y  :Int -> x+y}

    // Single parameter lambda does need to define the input : it can be used
    val lambda2 : (Int) -> Int = {x -> x*x}
    val lambda3 : (Int) -> Int = {it * it}
}
