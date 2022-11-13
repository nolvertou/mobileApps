
fun main() {
    // Definition of a Byte Value					// 8 bits						  
    val max_value_byte : Byte = 127					// Max: ((2^8)/2) - 1  
    val min_value_byte : Byte = -128				// Min: -1 * ((2^8)/2)
    
    // Print the results
    println("\nMax Value of a Byte Type is = $max_value_byte")	
    println("Min Value of a Byte Type is = $min_value_byte")	
	
    ////////////////////////////////////////////////////////////////////////
     
    // Definition of a Short Value					// 16 bits 					 
    val max_value_Short : Short = 32_767			// Max: ((2^16)/2) - 1  
    val min_value_Short : Short = -32_768			// Min: -1 * ((2^16)/2)
    
    // Print the results
    println("\nMax Value of a Short Type is = $max_value_Short")	
    println("Min Value of a Short Type is = $min_value_Short")
    
    ////////////////////////////////////////////////////////////////////////
     
    // Definition of an Int Value					// 32 bits 							 
    val max_value_Int : Int = 2_147_483_647			// Max: ((2^16)/2) - 1  
    val min_value_Int : Int = -2_147_483_648		// Min: -1 * ((2^16)/2)
    
    // Print the results
    println("\nMax Value of an Int Type is = $max_value_Int")	
    println("Min Value of an Int Type is = $min_value_Int")
    
    
    ////////////////////////////////////////////////////////////////////////
     
    // Definition of a Long Value								// 64 bits						  
    val max_value_Long : Long = 9_223_372_036_854_775_807		// Max: ((2^64)/2) - 1  
    val min_value_Long : Long = -9_223_372_036_854_775_807		// Min: -1 * ((2^16)/2) - 1
    
    // Print the results
    println("\nMax Value of a Long Type is = $max_value_Long")	
    println("Min Value of a Long Type is = $min_value_Long")
    
    
    ////////////////////////////////////////////////////////////////////////
     
    // Definition of a Float Value						// 32 bits  
    val max_value_Float : Float = Float.MAX_VALUE		// Max Value = 3.4028235 x 10^38
    val min_value_Float : Float = Float.MIN_VALUE		// Min Value = 1.4 x (10^(-45))
    
    // Print the results
    println("\nMax Value of a Float Type is = $max_value_Float")	
    println("Min Value of a Float Type is = $min_value_Float")
    
    ////////////////////////////////////////////////////////////////////////
     
    // Definition of a Double Value							// 64 bits  
    val max_value_Double : Double = Double.MAX_VALUE		// Max Value = 1.7976931348623157 x 10^308
    val min_value_Double : Double = Double.MIN_VALUE		// Min Value = 4.9 x (10^(-324))
    
    // Print the results
    println("\nMax Value of a Double Type is = $max_value_Double")	
    println("Min Value of a Double Type is = $min_value_Double")
}
