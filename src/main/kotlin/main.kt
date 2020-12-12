package pack

import DiceBag



fun play(){

    val bag1 = DiceBag()
    val bag2 = DiceBag()


    println("Your dice")
    bag1.rollAll()

    println("Computer's dice")
    bag2.rollAll()


    var sum1 = bag1.sum()


    var sum2 = bag2.sum()

    println("Your total: $sum1")
    println("Computer's total: $sum2")

    if (sum1 > sum2)
        println("You won!")
    else if (sum2 > sum1)
    {
        println("You lost!")
        play()
    }
    else
        println("Tie!")



}


fun main() {

    for (item in 1..10)
    {
        println("\n")
        play()
        println("$item of 10 total wins!\n")
    }

    println("You've won 10 times! When you don't win, try try again!")


}

