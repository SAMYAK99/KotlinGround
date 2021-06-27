package Class

// class className {  class header
//         property
//          member function
// }

//var <propertyName> [: propertyType] = [- <property_Intialzers>]
//   [<getters>]
//   [<setters>]

class Voter {

    // Variables
   var age : Int = 12
   var name : String = "Walker"

    // Getters
   val isEligible : Boolean
    get() = age > 12

    // Getters and Setters
    var checkName : String ? = null
    get() = field ?: "Unkonown"          // using a field variable instead of checkName to avoid to Recursion
    set(value) {
        if(value!=null)
            field = value
    }

}

fun main(){

    // Creating an object
    var obj : Voter = Voter()

    println("Voter is eligible : ${obj.isEligible}")
    obj.age = 20
    println("Voter is eligible : ${obj.isEligible}")
    println("Name : ${obj.checkName}")
    obj.checkName = "Rahul"
    println("Name : ${obj.checkName}")

}