fun  printFilteredStrings(list:List<String>, predicate: (String)->Boolean){
        list.forEach {
            if (predicate(it)){
                println(it)
            }
        }
    }

fun main(){
        val list = listOf("kotlin", "java", "javasript", "pyttohon")

    list.filterNotNull()
        .associate { it to it.length
        }
        

        printFilteredStrings(list, {it.startsWith("j")})
    }
