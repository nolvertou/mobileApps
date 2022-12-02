// Goal: Learn how to create an empty array list collection
// Creation Date: 12/01/2022
// Created by: Engineer Nolverto Urias Obeso

fun main(){
    // Create an empty ArrayList
	val ArrayList: ArrayList<String> = ArrayList<String>(5)
    var list: MutableList<String> = mutableListOf<String>()
    
    println(ArrayList)
    println(list)
    
    list.add("One")
    list.add("Two")
    
    ArrayList.addAll(list)
    ArrayList.addAll(list)
    ArrayList.addAll(list)
    println(ArrayList)
    println(list)
	
    println("...print ArrayList...")
}
