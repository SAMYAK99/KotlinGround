package Class

/*
* Data Class -
* Stores only data
* Only Properties inside the constructor
* No function and properties inside the data class
*/


data class  Student(val name : String , val section : String){
    var age : Int = 8
}

fun main(){

    val student = Student("Alex","C")
    student.age = 20
    val student1 = Student("Alex","C")

    // Data class has predefined inbuilt functions

    //equals
    //data class only considers the properties inside the constructor
    println("Line 1 equals ${student.equals(student1)}")

    // to string
    println("Line 2 : to string sunction ${student1.toString()}")


}
