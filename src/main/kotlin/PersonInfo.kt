interface PersonInfo {
    val provideInfo:String
    fun printInfo(person: person)
}

interface SessionProvider{

    fun printNewLine(){

        println("i am here")
    }
}
open class BasicInfo(override val provideInfo: String) : PersonInfo , SessionProvider{
    override fun printInfo(person: person) {
        println(provideInfo)

        person.printInfo()
    }


}

fun main(){
    val provider=BasicInfo("fidel")

    provider.printInfo(person())
    provider.printNewLine()
}

