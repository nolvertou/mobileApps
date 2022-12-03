// Goal: 			Learn how to use multiple catch block
// Creation Date: 	12/03/2022
// Created by: 		Engineer Nolverto Urias Obeso
// 


fun main(agrs: Array<String>){
	try{
        val a = IntArray(5)
        a[5] = 10 / 0
    }catch(e: ArithmeticException){
        println("arithmetic exception catch")
    }catch(e: ArrayIndexOutOfBoundsException){
        println("Array Index Out Of Bounds Exception")
    }catch(e: Exception){
        println("Parent exception class")
    }
    
    println("code after try catch...")
    
}
