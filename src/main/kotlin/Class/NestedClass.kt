package Class


// Nested Class - Classes withn  a class
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