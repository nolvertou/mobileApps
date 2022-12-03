// Goal: Learn how to use the array list collection
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
    list.add("Three")
    ArrayList.addAll(list)
    
    println(ArrayList)
    println(list)
	
    println("...print ArrayList...")
    
    val itr = ArrayList.iterator()
    
    println("Using ArrayList.iterator()")
    while(itr.hasNext()){
        println(itr.next())
        
    }
    
    println("size of arrayList = " + ArrayList.size)




}
