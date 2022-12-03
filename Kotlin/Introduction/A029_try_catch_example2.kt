// Goal: 			Learn how to use try and catch with exception handling 
// Description:		This is an example with exception handling
// Creation Date: 	12/03/2022
// Created by: 		Engineer Nolverto Urias Obeso
// 


fun main(agrs: Array<String>){
    val str = getNumber("10.5")	// The variable 'str' is getting the value of 10.5
    println(str)
}

fun getNumber(str: String): Int{
    return try{
        Integer.parseInt(str)
        
    }catch(e: ArithmeticException){
        0
    }
}
