fun main(){

    val num = arrayOf(1, 2, 3, 4)   //implicit type declaration
    val num1 = arrayOf<Int>(1, 2, 3) //explicit type declaration

    for (i in 0..num.size-1){
        print(" "+num[i])
    }
    println()


    val num2 = arrayOf(1, 2, 3, 4, 5)

    num.set(0, 10)  // set the first element equal to 10
    num.set(1, 6)   // set the secondelement equal to 6

    println(num.get(0)) // print the first element using get()
    println(num[1]) // print the second element using []

}