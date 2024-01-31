fun getGreeting()="hello kotlin"


fun sayHello(itemToGreet:String)= println("hello $itemToGreet")

fun main(){
 val interestingThings= arrayOf("Kotlin", 9, "comicBooks")
    for (i in interestingThings){
        println(i)
    }

    interestingThings.forEach { it
    println(it)
    }

}