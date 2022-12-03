// Goal: Learn how to use the array list collection and get method
// Creation Date: 12/01/2022
// Created by: Engineer Nolverto Urias Obeso

fun main(args: Array<String>){
    val arrayList: ArrayList<String> = ArrayList<String>()
    arrayList.add("One")
    arrayList.add("Two")
    
    // Printing array list elements using for loop
    for(i in arrayList){
        println(i)
    }
    
    // Printing array list elements using get method
    println("...arrayList.get(1)...")
    println(arrayList.get(1))
}
