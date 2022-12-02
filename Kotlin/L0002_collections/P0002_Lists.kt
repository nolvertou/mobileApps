// Lists
// 12/01/2022
// Engineer Nolverto Urias Obeso


fun main(){
    // Mutable lists cannot be modified
    val months = listOf("January", "February", "March")
    val anyTypes = listOf(1,2,3,true,false, "String")
    
    println(months)
    println(anyTypes)
    
    //months[0] = "JANUARY" // This is going to display an error
    
    // Convert the unMutuableList to MutableList
    val additionalMonths = months.toMutableList()
    val newMonths = arrayOf("April", "May", "June")
    additionalMonths[0] = "JANUARY"
    additionalMonths.addAll(newMonths)
    additionalMonths.add("July")
    println(additionalMonths)
    
    
    val days = mutableListOf<String>("Mon", "Tue", "Wed")
    days.add("Thu")
    println(days)
    days[2] = "Sunday"
    days.removeAt(1)
    println(days)
    
    val removeList = mutableListOf<String>("Mon", "Wed")
    println("removeList: ${removeList}")
    days.removeAll(removeList)
    print(days)
    
    
    
}
