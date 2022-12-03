// Goal: 			Learn how to use throw block
// Creation Date: 	12/03/2022
// Created by: 		Engineer Nolverto Urias Obeso
// 


fun main(agrs: Array<String>){
	validate(15)	// Another function
    println("Code after validation check...")
}

fun validate(age: Int){
    if(age < 18){
        throw ArithmeticException("Under Age")
    }else{
        println("Eligible for drive")
    }
}
