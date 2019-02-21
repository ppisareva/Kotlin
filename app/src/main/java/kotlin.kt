import java.util.*

fun main(args: Array<String>) {
    println("Hello, world!")
    println(canAddFish(10.0, listOf(3,3,3)))
    println(canAddFish(8.0, listOf(2,2,2), hasDecorations = false))
    println(canAddFish(9.0, listOf(1,1,3), 3))
    println(canAddFish(10.0, listOf(), 7, true))

   println( whatShouldIDoToday("happy", weather = "sunny"))

    println( whatShouldIDoToday("bed", "sunny", 5))

    println( whatShouldIDoToday("good", temperature = 25))

    repeat(2){
        println("ololol")


    }

    practisingFilters()
    practisLamda()



}

fun practisLamda() {
    //Create a lambda and assign it to rollDice, which returns a dice roll (number between 1 and 12).
    var rollDice = {Random().nextInt(12) + 1}()
    println(rollDice)
    // Extend the lambda to take an argument indicating the number of sides of the dice used for the roll.
    val rollDiceExt = {sides: Int ->
    Random().nextInt(sides) + 1
}
    //If you haven't done so, fix the lambda to return 0 if the number of sides passed in is 0.
    val rollDiceExtCheck = {arg :Int ->if(arg ==0) 0 else Random().nextInt(arg)+1  }
    //Create a new variable, rollDice2, for this same lambda using the function type notation.
    var rollDice2 : (Int) -> Int  = {arg ->if(arg ==0) 0 else Random().nextInt(arg)+1  }

    // Pass your rollDice2 function as an argument to gamePlay() to generate a dice roll every time gamePlay() is called.
    gamePlay(rollDice2(4))
}
// Create a function gamePlay() that takes a roll of the dice as an argument and prints it out.
fun gamePlay(rollDice : Int){
    println(rollDice)
}

fun practisingFilters(){
    val spices = listOf("curry", "pepper", "cayenne", "ginger", "red curry", "green curry", "red pepper" )
    //gets all the curries and sorts them by string length.
    println(spices.filter{ it.contains("curry") }.sortedBy { it.length })
    //all the spices that start with 'c' and end in 'e'. Do it in two different ways.
  println(spices.filter  {it.startsWith('c')}.filter{it.endsWith('e')})
        //  spices.filter { {it.startsWith('c') && it.endsWith('e') }


    //Take the first three elements of the list and return the ones that start with 'c'.
    println(spices.take(3).filter{it.startsWith('c')})


}

fun whatShouldIDoToday(mood: String,weather :String = "sunny",temperature:Int = 24  ):String {
   return when{
       whatMood(mood)&& whatWeather(weather) -> "Go for a walk"
       whatMood(mood) && whatWeather(weather) && whatTemperature(temperature) -> "stay in bed"
       whatTemperature(temperature) -> "go swimming"
       else -> "Stay Home"

    }


}




fun whatMood(mood :String) = mood.equals("happy")

fun whatWeather(weather: String) = weather.equals("sunny")

fun whatTemperature(temperature: Int) = temperature>17
fun dayOfWeek(){
    println("What day is it today?")
   println(when(Calendar.getInstance().get(Calendar.DAY_OF_WEEK)){
       1 -> "Sunday"
       2 -> "Monday"
       3 -> "Tuesday"
       4 -> "Wednesday"
       5 -> "Thursday"
       6 -> "Friday"
       7 -> "Saturday"
       else -> "Time has stopped"
   })

}

fun getFortuneCookie() :String{
val listOfFortun = listOf("You will have a great day!",
    "Things will go well for you today.",
    "Enjoy a wonderful day of success.",
    "Be humble and all will turn out well.",
    "Today is a good day for exercising restraint.",
    "Take it easy and enjoy life!",
    "Treasure your friends because they are your greatest fortune.")


    return listOfFortun[getBirthday()]

}

 fun getBirthday() : Int {
     print("Enter your B-Day  ")
     val bDay = readLine()?.toIntOrNull() ?:0

     return when (bDay){
         in 1..6 ->1
         in 1..12 -> 2
         in 13..16 ->3
         in 17..24 ->4
         in 25 ..29 ->5
         in 29..30->6
         else ->0
     }

}

fun canAddFish(tankSize:Double, currentFish : List<Int>, fishSize:Int = 2, hasDecorations:Boolean = true ) : Boolean{
    var length = tankSize
    if (hasDecorations) length = tankSize.times(0.8)
    for(e in currentFish){
        length -= e
    }
   // return (tankSize * if (hasDecorations) 0.8 else 1.0) >= (currentFish.sum() + fishSize)
return length>=fishSize

}

fun feedTheFish (){
    val day = rendomDay()
    val food = "pellets"
    println("Taday is $day and fish eats $food")
}
 fun rendomDay() :String{
     val days = listOf("Sunday",
      "Monday"
     ,"Tuesday"
     ,"Wednesday"
    ,"Thursday"
     ,"Friday"
     ,"Saturday")
     return days[Random().nextInt(7)

     ]
 }




 fun kitlin_basic() {


    var fish = 2.plus(31).plus(233).minus(13).div(30)
    var rainbowColor = "blue"
    rainbowColor = "green"
    var blackColor = null;
    var greenColor: Int? = null
    listOf(null, null)
    val list: List<Int?> = listOf(null, null)
    val list2: List<Int>? = null
    val nullTest: Int? = null
    //Use a null-check that increases the value by one if it's not null, otherwise returns 0, and prints the result.
    println(nullTest?.inc() ?: 0)

    val trout = "trout"
    val haddock: String = "haddock"
    val snapper = "snapper"
    // switch case
    when (trout.length) {
        0 -> println("error")
        in 3..12 -> println(trout.length)
        else -> println("ok $trout")
    }


    val numbers = arrayListOf<Int>(11, 12, 13, 14, 15)

    val stringList = mutableListOf<String>()
    for (i in numbers) {
        stringList.add(i.toString())
    }
//  the numbers between 1 and 100 that are divisible by 7?
    var list3: MutableList<Int> = mutableListOf()
    for (i in 0..100 step 7) list3.add(i)

}