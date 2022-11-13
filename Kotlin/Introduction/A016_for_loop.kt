fun main() {
   
    for (num in 1 .. 10){
        println("num = $num")
    }
    
    println("-------------")
    for (num in 30 until 40){
        println("num = $num")
    }
    
    println("-------------")
    for (num in 30 downTo 1 step 2){
        println("num = $num")
    }
    
   
}
