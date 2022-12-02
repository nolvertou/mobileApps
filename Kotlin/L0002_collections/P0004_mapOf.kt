// Goal: Learn how to use the map collection
// Creation Date: 12/01/2022
// Created by: Engineer Nolverto Urias Obeso

fun main(){
    
    // Map Collection is UnMutable
    val daysOfTheWeek = mapOf(1 to "Monday", 2 to "Tuesday", 3 to "Wednesday")
    
    for(key in daysOfTheWeek.keys){
        println("$key is to ${daysOfTheWeek[key]}")
    }
    
    
    val newDaysOfWeek = daysOfTheWeek.toMutableMap()
    newDaysOfWeek[4] = "Thursday"
    newDaysOfWeek[5] = "Friday"
    println(newDaysOfWeek)
    println(newDaysOfWeek.toSortedMap()) 
    
    
    
    
    
    val fruitsMap = mapOf("Favorite" to Fruit("Apple", 2.5), "OK" to Fruit("Banana", 3.0))
    println(fruitsMap)
}

data class Fruit(val name: String, val price: Double)
