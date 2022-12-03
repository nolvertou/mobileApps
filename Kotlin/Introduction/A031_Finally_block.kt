// Goal: 			Learn how to use finally block
// Creation Date: 	12/03/2022
// Created by: 		Engineer Nolverto Urias Obeso
// 


fun main(agrs: Array<String>){
	try{
        val data = 10/5
        println(data)
    }catch(e: NullPointerException){
        println(e)
    }finally{
        println("finally block always executes")
    }
    
    println("bellow code...")
}
