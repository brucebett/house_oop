package OOP

class Car(owner:String, color:String, price:Int, type:String) {

    //initialize our cars
    init {
        println("owner of the car is $owner")
        println("the color of the car is $color")
        println("the price of the car is $price")
        println("the type of the car is $type")
    }
}

fun main(args: Array<String>) {

    var owner_one = Car("Bett","blackyellow",3500000,"subaru")
    println("---end of car 1---")
    var owner_two = Car("Tracy","white",1500000,"mazda")
    println("---end of car 2---")
    var owner_three = Car("Gideon","grey",3000000,"subaru")
    println("---end of car 3---")
    var owner_four = Car("Juddy","black",2100000,"Toyoyta")
    println("---end of car 4---")

}








