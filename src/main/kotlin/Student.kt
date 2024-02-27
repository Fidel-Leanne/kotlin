data class Student(val name: String, val age:Int , val grade:Char)

fun  main(){

    val student= Student("Fidel",43, 'a')

    println("Student Name: ${student.name}")
    println("Student age: ${student.age}")
    println("Student grade: ${student.grade}")

}