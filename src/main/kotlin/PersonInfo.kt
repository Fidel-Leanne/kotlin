interface PersonInfo {
    val provideInfo: String
    fun printInfo(person: Person)
}

interface SessionProvider {
    fun printNewLine() {
        println("I am here")
    }
}

open class BasicInfo(override val provideInfo: String) : PersonInfo, SessionProvider {
    override fun printInfo(person: Person) {
        println(provideInfo)
        person.printInfo()
    }
}

fun main() {
    val provider = object : PersonInfo {
        override val provideInfo: String
            get() = "Sample info"

        override fun printInfo(person: Person) {
            println("Printing person info")
        }


    }

    provider.printInfo(Person())

}
