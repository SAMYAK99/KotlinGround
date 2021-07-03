fun main(){

    // If Else Single Statements
    val age = 18
    var vote : String = ""
    vote = if(age >= 18) "Eligible" else "Not Eligible"
    println(vote)


    // When
    val x = 2
    when (x) {
        0, 1 -> println("x == 0 or x == 1")
        2 -> println("x==2")
        else -> print("otherwise")
    }
    val time : Int = 10
    when(time){
        in 6..12 -> println("Morning")
        in 12..18 -> println("AfterNoon")
        else -> println("Night")
    }



    // While Statements
    var y = 2
    while (y!=0){
        print(y)
        y--
    }

    // For Loops

//    for (item in collection) {
        // body of loop
//    }

    for(i in 1..3){
        println(i)                 // 1 2 3
    }

    for (i in 6 downTo 0 step 2) {
        println(i)                // 6 4 2 0
    }

    for(i in 1 until 5){
       print(i)                  // 1 2 3 4
    }

     for(i in 1..5 step 2){
         print(i)                // 1 3 5
     }



}