fun main() {
    
    //  Asertion Operator (!!)
    // consider the case in which you are 100% sure that the nullable variable does not contain the null.
	//So in that case to avoid the check you can use assertion operator. Which will suppress the check.
    
    
    
    var nullableName : String? = null
    
    
    // Not Nut Assertion
    nullableName = nullableName ?: "MAXWELL"
    
    
    println(nullableName !!.lowercase())
  
    
}
