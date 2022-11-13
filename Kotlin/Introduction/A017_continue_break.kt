fun main() {
   
    for(i in 1 until 7){
        if(i == 5){
            break
        }
        println("i = $i")
    }
    println("The for loop is done")
    
    println("----------------")
    for(i in 1 until 7){
        
        if(i == 5){
            continue 
        }
        println("i = $i")
    }
    println("The for loop is done")
   
}
