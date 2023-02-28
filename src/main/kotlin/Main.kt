fun main(args: Array<String>) {
//    println("Hello World!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    //println("Program arguments: ${args.joinToString()}")

//    Human().hello()

    val h=Human();
    h.hello()

    var age= 39
    var weight:Float =66f
    var name:String = "Jeff"




}

class Human{
    fun hello(){
        println("Hello Kotlin!!")
    }
}
