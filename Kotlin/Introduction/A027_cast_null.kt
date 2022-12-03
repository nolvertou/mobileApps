// Goal: 			Learn about safe cast operator
// Description:		as? provides a safe cast operation to safely cast to a type
// 					It returns a null if casting is not possible rather than 
// 					throwing a ClassCastException exception.
// Creation Date: 	12/03/2022
// Created by: 		Engineer Nolverto Urias Obeso
// 


fun main(args: Array<String>){
	val location: Any = "Kotlin"
    val safeString: String? = location as? String
    val safeInt: Int? = location as? Int
    
    println(safeString)
    println(safeInt)
    
    // Output: Kotlin
    // 		   null
}





