
    fun main(){


        println("Enter start number")
        val startNo= readln()?.toIntOrNull()

        println("Enter start number")
        val endNo= readln()?.toIntOrNull()

        if(startNo!=null && endNo!=null){
            if (startNo<=endNo){
                for (i in startNo..endNo){
                    println(i)

                }

            }else{
                println("Start no should be less or equal to end no")
            }


        }else{
            println("start no or end no shouldnt be null")
        }

    }


