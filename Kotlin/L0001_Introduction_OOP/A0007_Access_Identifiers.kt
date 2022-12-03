// Goal: Learn how to use the visible modifier
// Creation Date: 12/02/2022
// Created by: Engineer Nolverto Urias Obeso

// Open is used for the parent class that is going to be inherit its values
open class Base(){
    var a = 1;	// Public by default
    private var b = 2;	// Private to Base Class
    protected open val c = 3; 	// Visible to the Base and Derived class
    internal val d = 4; 	// Visible inside the same module
    open protected fun e(){println("Im printing from a protected function using public function from Base class")}		// Visible inside to the Base and Derived class
    public fun getFunction(){
       e() 
    }
    
    public fun getValue(){
        println(b)
    }
}

class Derived: Base(){
    // a, c, d and e() of the Base class are visible
    // b is not visible because is private
      
    override protected fun e(){
      println("Im printing from a protected function using public function from Derived class")		
    }
}


fun main(args: Array<String>){
    val base = Base()
    val derived = Derived()
    
    println("Printed from base object: " + base.a) 			//Its visible because is public
    println("Printed from derived object: " + derived.a) 	//Its visible because is public
    
    //println("Printed from base object: " + base.b) 		//Its NOT  visible because is public
    //println("Printed from derived object: " + derived.b) 	//Its NOT  visible because is public
    
    //println("Printed from base object: " + base.c) 		//Its NOT visible because is protected
    //println("Printed from derived object: " + derived.c) 	//Its NOT visible because is protected
    
    println("Printed from base object: " + base.d) 			//Its visible because is internal
    println("Printed from derived object: " + derived.d) 	//Its visible because is internal
    
    //println("Printed from base object: " + base.e) 			//Its NOT visible because is protected
    //println("Printed from derived object: " + derived.e) 	//Its NOT visible because is protected
    
    base.getFunction()
    derived.getFunction()
    
    base.getValue()
    derived.getValue()
}





