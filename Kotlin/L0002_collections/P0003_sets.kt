// Goal: Learn how to use the sets
// Creation Date: 12/01/2022
// Created by: Engineer Nolverto Urias Obeso

fun main() {
    
    // The sets cannot have repeated values and they are unmutable
	val fruits = setOf("Orange", "Apple", "Mango", "Grape", "Apple", "Orange")
    //fruits[0] = "banana" // This displays an error because the sets are unmutable
    println(fruits)
    println(fruits.toSortedSet())
    for(element in fruits){
        print("${element} ")
    }
    println("")
    
    // Mutable Set can be modified and have multiple times the same element
    val newFruits = fruits.toMutableList() 
    newFruits.add("Water Mellon")
    newFruits.add("Pear")
    newFruits[0] = "banana"
    newFruits.add("Apple")
    newFruits.add("Apple")
    println(newFruits)
}
