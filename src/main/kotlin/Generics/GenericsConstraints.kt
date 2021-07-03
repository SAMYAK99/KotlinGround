package Generics

import java.io.Serializable

// Restricting a generic class
fun<T> printPrices(price : T) where T:Number , T:Serializable{
    println("The Price is : $price")
}

fun main(){
    printPrices(23)
    printPrices(42)
//    printPrices("alex")
}