package Class

/*
Inheritance - Inheritance is one in which a new class is created (derived class)
 that inherits the features from the already existing class(Base class).

Polymorphism - Object behaving differently for same class

Open keyword is used for inheritance  and
override keyword is used in derived class for overriding the class
 */

 open class Car (val name :String){

    init {
        println("This is Main Car")
    }

    open var age = 1
    open fun isMoving(){
        println("Car is moving")
    }
}

// Inheriting the Properties of class Car
class Amaze(name : String , val Manufacturer : String , override var age : Int) : Car(name){

    init {
        println("This is Amaze")
    }


    override fun isMoving() {
       println("Inside the amaze overrided")
        // accessing properties and functions of Immediate parent class by super keyword
        super.isMoving()
    }


}

fun main(){

    val car = Amaze("Amaze-1" ,"Honda" , 4)
    car.isMoving()
    println("The age of car is ${car.age}")


}