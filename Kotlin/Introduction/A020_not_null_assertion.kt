fun main() {
    var nullableName : String? = null
    //var nullableName : String? = "Maxwell"

    
    // Not Nut Assertion
    nullableName = nullableName ?: "Rogie"
    
    //var lenNull = nullableName?.length
    // The previous line is equivalent to next if else statement
    /*
    if(nullable != null){
        lenNull = nullableName.length
    }else{
        null
    }+
    */
    
    
    println("nullableName = $nullableName")
    
    // If we want to do something if the variable is not null we use ?.let{}
    nullableName?.let{println(it.length)} 		// Print the length of the string
    nullableName?.let{println(it.lowercase())}	// Chane the letters to lower case
    
}
