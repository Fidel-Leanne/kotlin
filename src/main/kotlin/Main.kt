

fun getGreeting()="hello kotlin"


fun sayHello(itemToGreet: String, vararg itemToGreets: String) {
    itemToGreets.forEach { i ->
        println("$itemToGreet, $i")
    }
}


fun main() {
    val person= person()
    //person.nickName="fifi"
   person.printInfo()
}
