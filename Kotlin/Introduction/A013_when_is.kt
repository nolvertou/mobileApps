fun main(){
    
    var x: Any = "13.37"
    
    when(x){
        is Int -> println("$x is Integer")
        is Double -> println("$x is Double")
        is String -> println("$x is String")
        else -> println("$x is none of the above")
    }
}
