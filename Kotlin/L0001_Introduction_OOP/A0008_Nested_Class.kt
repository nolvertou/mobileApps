// Goal: 			Learn how to use a nested class
// Description:		Nested class is by default static, so its data members and 
// 					member functions can be accessed without creating an object 
// 					of the class.
// 					Nested classes cannot access data members of outer classes.
// Creation Date: 	12/02/2022
// Created by: 		Engineer Nolverto Urias Obeso
// 


// Sytax
class OuterClass{
    // Outer class code
    private var name: String = "Mr X" 
    
    class NestedClass{
        // Nested class code
        var description: String = "Code inside nested class"
        private var id: Int  = 101
        
        fun foo(){
            // print("name is ${name}")
            println("Id is $id")
        }
    }
}


fun main(args: Array<String>){
    // nested class must be initialized
    println(OuterClass.NestedClass().description)	// Accessing property
    
    
    var obj = OuterClass.NestedClass()	// Object Creation
    obj.foo()
}





