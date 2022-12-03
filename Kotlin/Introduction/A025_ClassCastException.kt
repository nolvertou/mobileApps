// Goal: 			Learn a case of ClassCastException
// Description:		Trying to cast an integer value of the Any type into a string 
// 					type leads to ClassCastException
// Creation Date: 	12/03/2022
// Created by: 		Engineer Nolverto Urias Obeso
// 


fun main(args: Array<String>){
   val obj: Any = 123
   val str: String = obj as String
    
   //Output
   //Exception in thread "main" java.lang.ClassCastException: 
   //class java.lang.Integer cannot be cast to class java.lang.String 
}





