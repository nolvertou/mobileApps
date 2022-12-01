// An abstract class cannot be instantiated 
// (you cannot crate objects of an abstract class)
// However, you can inherit subclasses from an abstract class
// The members(properties and methods) of an abstract are non-abstract 
// unless you explicitly use the abstract keyword to make them abstract.


abstract class Mammal(private val name: String, private val origin: String,
                     private val weight:Double){ // Concrete (non abstract) properties
    
    // Abstract property(must be overriden by subclasses)
    abstract var maxSpeed: Double
    
    // Abstract methods(must be implemented by Subclasses)
    abstract fun run()
    abstract fun breath()
    
    // Concrete (Non Abstract) method
    fun displayDetails(){
        println("Name: $name, Origin: $origin, Weight: $weight, "+ "Max Speed: $maxSpeed")
    }
}

class Human(name: String, origin: String, weight: Double, override var maxSpeed: Double): 
	Mammal(name, origin, weight){
            
	override fun run(){
        // Code to run
        println("Runs on two legs")
    }  
    
    override fun breath(){
        // Code to breath
        println("Breath through mouth or nose ")
    }
}
        
        
class Elephant(name: String, origin: String, weight: Double, override var maxSpeed: Double):
	Mammal(name, origin, weight){
        
	override fun run(){
        // Code to run
        println("Runs on four legs")
    }        
    
    override fun breath(){
        // Code to breath
        println("Breath through the trunk");
        
    }
}

fun main() {
   val human = Human("Denis", "Russia", 70.0, 28.0)
   val elephant = Elephant("Rosy", "India", 54000.0, 25.0)
   
   // YOU CANNOT  CREATE AN INSTANCE OF AN ABSTRACT CLASS
   // val mammal = Mammal("Denis", "Russia", 70.0, 28.0)
   
   human.run()
   elephant.run()
   
   human.breath()
   elephant.breath()
}

// Differences between an abstract class and an interface
// Interfac cannot hold state and we can implement multiple interfaces, but only one class
// and we can only inherit from one class 
// The interfac  has not a constructor 
// An interface cannot hold fields 
// 
// An abstract class has constructor 
// An abstract class can have everything of an interface plus fields and constructors 
// // We can hold state in an abstract class 
