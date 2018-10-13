// Compile-time Constants
const val creator = "CodeTober"


fun main(args: Array<String>) {

    // Assign the String value 'developer' to the role variable, then print
    var role: String = "developer"
    println(role)

    /*
     Uncomment the next line to see an inferred type exception
     because the Kotlin compiler is expecting an Int (whole number)
     and we gave it a String instead
    */
    // var age: Int = "26"

    // Read-Only variable
    val firstname: String = "User"
    println(firstname)

    // If you uncomment the next line, you will see 'cannot reassign' error
    // firstname = "someone else"

    // Explicit Types are not necessary
    val lastname = "Power"
    println(lastname)


    // Kotlin default types

    // String    "CodeTober"
    // Char      'C'
    // Boolean   true
    // Int       1
    // Double    1.0
    // List      Collection - "WI, MI, FL, WI"
    // Set       Unique collection - "1,2,3,4"
    // Map       Collection of Key-Value-Pairs - "name": "user, "role": "developer", "lastname": "power"


    val dataMap = mapOf("name" to "user", "role" to "developer", "lastname" to "power")
    val dataList = listOf("user", "developer", "power", "user")
    val dataSet = setOf("user", "developer", "power") // adding another "user" would create an error

    println("Map: $dataMap")
    println("List: " + dataList)
    println("Set: " + dataSet)
}