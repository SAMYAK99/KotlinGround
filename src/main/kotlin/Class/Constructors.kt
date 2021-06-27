package Class

/*
A constructor is responsible for constructing the object.
In kotlin we have primary constructor, secondary constructor and init block.

Basically a Kotlin class can have only single primary constructor
and as many init blocks and secondary constructors as required.
*/


class Box(
    var length: Int = 0,
    var width: Int = 0,
    var height: Int = 0
) {

    // init Block can be called multiple times to modify default
    // or overload primary constructor
    init {
        println("Init Block Called")
    }

    // Secondary Constructor (No need)
    constructor() : this(0,0,0){
        println("Secondary constructor called")
    }

    val volume
        get() = length * width * height

    fun fillContents() {
        println("Box is Filled")
    }

    fun open() {
        println("Box Opened")
    }
}

fun main(){

    val box1 = Box()
    val box2 = Box(
        length = 10,
        width = 10,
        height = 10
    )

    println(box1.volume)
    println(box2.volume)
    println(box1.fillContents())
    println(box2.open())
}