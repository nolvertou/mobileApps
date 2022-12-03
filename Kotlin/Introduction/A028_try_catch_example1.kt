// Goal: 			Learn how to use try and catch without exception handling 
// Description:		This is an example without exception handling
// Creation Date: 	12/03/2022
// Created by: 		Engineer Nolverto Urias Obeso
// 


fun main(agrs: Array<String>){
    val str = getNumber("10") + 3	// The variable 'str' is getting the int value of 13
    println(str)
}

fun getNumber(str: String): Int{
    return try{
        Integer.parseInt(str)
    }catch(e: ArithmeticException){
        0
    }
}
