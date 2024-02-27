class Person (val firstName:String= "peter" ,val lastName:String="Parker"){

    var nickName:String?= null
        set(value){

            field=value
            println("the new nick Name is our $value")
        }
        get() {

           println("the returned value is $field")
            return field
        }

    fun printInfo(){

        val nickNameToPrint= nickName ?:"no nickName"
        println("$firstName ($nickNameToPrint) $lastName")
    }

    }




