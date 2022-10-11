package Class


// Nested Class - Classes withn  a class
// Nested class doesn't have its own existence it will only be used with its parent class
// inner class is used to access variables of parent class as nested class can't use its parent variables
// Anonymous Class - For changing just a function inside a class


class Ben10(var name: String) {

    inner class Aliens() {
        fun xlr8() {
            println("This is $name")
        }
    }

}

fun main(){

    Ben10("XLR8").Aliens().xlr8()
}