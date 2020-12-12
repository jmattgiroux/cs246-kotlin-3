import javax.print.attribute.IntegerSyntax

import java.lang.Math
import java.util.ArrayList

// programiz.com/kotlin-programming/constructors
class Die (sides : Int){

    //    https://www.programiz.com/kotlin-programming/class-objects
//    properties
    private var sides : Int = sides
    internal var result : Int = 1

//    member functions


    fun display(){
        println("d$sides -> $result")
    }

    //    https://stackoverflow.com/questions/45685026/how-can-i-get-a-random-number-in-kotlin
    fun roll(){
        result = (1..(sides)).random()
    }

}

class DiceBag (){
    private var diceBag = ArrayList<Die>(0)

    //    https://kotlinlang.org/docs/reference/control-flow.html
    fun rollAll(){
//        loop that calls roll() and display() for each element of diceBag
        for (item : Die in diceBag)
        {
            item.roll()
            item.display()
        }
    }

    fun sum() : Int {
        var sum = 0
        for (item : Die in diceBag)
            sum += item.result
        return sum
    }

    private fun add(die : Die){
        diceBag.add(die)
    }

    init {
        add(Die(2))
        add(Die(4))
        add(Die(6))
        add(Die(8))
        add(Die(10))
        add(Die(12))
    }
}
