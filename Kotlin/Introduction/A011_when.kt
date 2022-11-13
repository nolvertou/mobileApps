fun main(){
    val season = 2
    
    when(season){
        1 -> println("Spring")
        2 -> println("Summer")
        3 -> {
             println("Fall")
			 println("Autumn")
        }
        4 -> println("Winter")
        else -> println("Invalid Season")
    }
    
    
}
