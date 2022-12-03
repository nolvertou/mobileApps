// Goal: 			Learn about unsafe cast
// Description:		Nullable for casting to work,
// 					Source and target variable needs to be a nullable for casting to work.
// Creation Date: 	12/03/2022
// Created by: 		Engineer Nolverto Urias Obeso
// 


fun main(args: Array<String>){
	val obj: Any? = "String unsafe cast"
    val str: String? = obj as String? // Works
    println(str)	// Output: String unsafe cast
}





