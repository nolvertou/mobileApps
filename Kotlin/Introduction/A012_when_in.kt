fun main(){
    val month = 4
   
    when(month){
        in 3..5 -> println("Spring")
        in 6..8 -> println("Summer")
        in 9..11-> println("Fall")
        12, 1, 2-> println("Winter")
    	else -> println("Invalid Season")
    }
    
    
}
