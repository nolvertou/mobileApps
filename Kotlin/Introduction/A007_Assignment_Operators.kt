fun main(){
    // Assignment Operators ( =, +=, -=, *=, /=, %= )

    var myNum = 5
    var prevNum = myNum
    println("myNum = $myNum")
    
    myNum += 1
    println("Previous Value = $prevNum, current Value = $myNum")
    
    prevNum = myNum
    myNum -= 2
    println("Previous Value = $prevNum, current Value = $myNum")
    
    prevNum = myNum
    myNum *= 4
    println("Previous Value = $prevNum, current Value = $myNum")
    
    prevNum = myNum
    myNum /= 2
    println("Previous Value = $prevNum, current Value = $myNum")
    
}
