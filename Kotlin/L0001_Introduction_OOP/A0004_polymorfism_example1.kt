


// Open reserved word is used to enable inheritance
// Sealed is used disable the inheritance 
open class Car(val name: String, val brand: String){ // Parent class 
    // Properties
    open var range: Double = 0.0
    
    // Methods
    fun extendRange(amount: Double){
        if(amount > 0)
        	range += amount
    }
    
    open fun drive(distance: Double){
        println("My car of name $name and brand $brand drove for $distance KM")
    }
}


class ElectricCar(name: String, brand: String, batteryLife: Double)
	: Car(name, brand) { // Child class of Car
    
    var chargerType = "Type 1"
    override var range = batteryLife * 6
        
    override fun drive(distance: Double){
        println("Drove for $distance KM on electricity")
    }
    
    fun drive(){
        println("Drove for $range KM on electricity")
    }
    
}
   
    
fun main() {
   var audiA3 = Car("A3", "Audi")
   var teslaSM = ElectricCar("S-Model", "Tesla", 85.0)
   
   teslaSM.extendRange(200.0)
   
   // Polymorfism
   audiA3.drive(200.0)
   teslaSM.drive(300.0)
   
    
    teslaSM.drive()
   
}    
    
