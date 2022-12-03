// Goal: Learn how to use a lambda expression
// Creation Date: 12/02/2022
// Created by: Engineer Nolverto Urias Obeso

fun main(){
    // Using a function to add two integer numbers
    println("Using addFunction: ${addNumber(5,10)}")
    
    // Using a lambda expression to add two integer numbers
    val sum: (Int, Int) -> Int = {a: Int, b: Int -> a + b}
	println("Using lambda expression with return value: ${sum(4,10)}")
    
    // even shorter without a return value
    val sum2 = {a: Int, b: Int -> println(a+b)}
    sum2(3,10)
}


fun addNumber(a: Int, b: Int): Int{
    val add = a + b
    return add
}
