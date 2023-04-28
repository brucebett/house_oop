package OOP

open class Animal(color:String,legs:Int,breed:String,production:Int) {

  //initialize our Animals

    init {

        println("color of the animal is $color")
        println("legs of the animal is $legs")
        println("breed of the animal is $breed")
        println("production of the animal is $production")
    }

}

class Cow() : Animal {

    fun milk() {
        println("the cow produce milk")
    }

 class sheep() : Animal {

     fun whool() {
         println("the sheep produces whool")
     }
 }
}