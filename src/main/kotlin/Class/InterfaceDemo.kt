package Class

/* Interfaces are used for multiple inheritances
* A Class can have as many interfaces
* interfaces doesn't have constructors
* Interfaces are same as abstract classes with a difference they doesn't have backing field
  and therefore accessors declared in interfaces can't reference them.
  that means interfaces cannot store state
*/

interface MyInterface {
    val prop: Int // abstract

    val propertyWithImplementation: String
        get() = "foo"

    fun foo() {
        print(prop)
    }
}

class Child : MyInterface{
    override val prop: Int = 29
}

fun main(){

    val obj = Child()
    println(obj.propertyWithImplementation)
    println(obj.foo())
}