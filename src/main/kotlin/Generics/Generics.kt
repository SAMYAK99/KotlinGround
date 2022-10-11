package Generics

/*
* Generics can work with different data types
* 
* Generic functions : Making general functions that is not type dependent
* LIst , Map etc.. are generic classes as they can be used with any type of objects
*
*  Generic functions and classes allow code reusablity and allow all us to use these functions for
any classes that inherit the class “Any?”.
*
specify a type parameter during their declaration and any statement calling these functions, has to
specify the type parameter while invoking the said function.
* */

// GENERICS WITH FUNCTIONS
fun <T> printName (content : T){
    println("The content is $content")
}

// GENERICS WITH CLASSES
class Container<T>(var data : T){
    fun setValue(value : T){
           data = value
    }

    fun getValue() : T{
         return data
    }
}
fun main(){
    printName<String>("Alex")
    printName<Int>(5)

    val obj = Container<Int>(3)
    obj.setValue(10)
    obj.getValue()

    val obj1 = Container<String>("Parker")
}