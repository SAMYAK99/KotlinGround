package Class

/*
* extend a class with new functionality
   without having to inherit from the class or use design patterns such as Decorator.
* Work as it is the member of the class
*/


class Students(val firstName : String , val lastName : String)

fun Students.fullName() =  "${this.firstName}, ${this.lastName} "

fun Int.getEven() : Int{
    if(this % 2 == 0){
        return this
    }
    else
        return this+1
}

fun main(){
    val student  = Students ("Alex" , "Brown")
    println("Full name of Student is ${student.fullName()}")

  val x : Int = 23
    println("The even age is ${x.getEven()}")

}

