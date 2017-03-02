
import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.databind.SerializationFeature

class User(val firstName: String, val lastName: String, var age: Int)

fun main(args: Array<String>): Unit {
    val user = User("Pakawadee", "Lakshmiwong", 23)
    val arrayInt = arrayListOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    var mapper = ObjectMapper()

    mapper.enable(SerializationFeature.INDENT_OUTPUT)
    val jsonString = mapper.writeValueAsString(user)
    val arrayJson = mapper.writeValueAsString(arrayInt)
    println(jsonString)
    println(arrayJson)
    println(user.firstName + " " + user.lastName + " has an age of " + user.age + " years old.")
}
