package OOP

class House(owner:String, location:String, price:Int, doors:Int) {

    //initialize our class
    init {
        println("owner of the house os $owner")
        println("house is located in $location")
        println("price is $price")
        println("it has $doors")

    }

}

fun main(args: Array<String>) {
    var owner_one = House("mike","ngara",25000,2)
    println("---end of house 1---")
    var owner_two = House("bett","south b",57734,4)
    println("---end of house 2---")
    var owner_three = House("tracy","lavington",2096468,8)
    println("---end of house 3---")
    var owner_four = House("gideon","carren",2196468,7)
    println("---end of house 4---")

}