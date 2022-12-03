// Goal: 			Learn a case of NullPointerException
// Description:		A nullable string (String?) cannot be cast to non nullable string (String)
// 					This throws an exception.
// Creation Date: 	12/03/2022
// Created by: 		Engineer Nolverto Urias Obeso
// 


fun main(args: Array<String>){
    val obj: Any? = null
    val str: String  = obj as String
    println(str)	
    
    // Output 
    // Exception in thread "main" java.lang.NullPointerException: 
    // null cannot be cast to non-null type kotlin.String
}





