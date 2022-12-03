// Goal: 			Learn how to use a inner nested class
// Description:		An inner class which is created inside another class with the keyword inner.
// 					In other words, we can say that a nested class which is marked as "inner" 
// 					is called inner class.
// 					Inner class cannot be declared inside interfaces or non-inner nested classes.
// 					The adventage of inner class over nested class is that, it is able to access
// 					members of its outer class even it is private.
// 					The inner class keeps a reference to an object of its outer class. 
// Creation Date: 	12/03/2022
// Created by: 		Engineer Nolverto Urias Obeso
// 


class OuterClass{
    private var name: String = "Mr X"
    
    inner class InnerClass{
        var description: String = "Code inside inner class"
        private var id: Int = 101
        fun foo(){
            println("Name is ${name}")	// Access the private outer class member
            println("Id is $id")
        }
    }
}

fun main(args: Array<String>){
    println(OuterClass().InnerClass().description)	// Accessing property
    
    var obj = OuterClass().InnerClass() // Object Creation
    
    obj.foo()  // Access member function
}



