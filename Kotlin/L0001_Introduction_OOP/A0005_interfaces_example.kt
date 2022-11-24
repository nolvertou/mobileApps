

interface Drivable{
    val maxSpeed: Double
    fun drive(): String
    fun brake(){
        println("The drivable is braking")
    }
}



// Open reserved word is used to enable inheritance
// Sealed is used disable the inheritance 
open class Car(override val maxSpeed: Double ,val name: String, 
               val brand: String): Drivable{ // Parent class 
    // Properties
    open var range: Double = 0.0
    
    // Methods
    fun extendRange(amount: Double){
        if(amount > 0)
        	range += amount
    }
    
    // override fun drive(): String = "Driving the interface drive"
    override fun drive(): String{
        return "Driving the interface drive"
    }
    
    open fun drive(distance: Double){
        println("My car of name $name and brand $brand drove for $distance KM")
    }
}


class ElectricCar(maxSpeed: Double, name: String, brand: String, batteryLife: Double)
	: Car(maxSpeed, name, brand) { // Child class of Car
    
    var chargerType = "Type 1"
    override var range = batteryLife * 6
        
    override fun drive(distance: Double){
        println("Drove for $distance KM on electricity")
    }
    
    override fun drive(): String {
        return "Drove for $range KM on electricity"
    }
    
    override fun brake(){
        super.brake()
        println("Brake inside of electric car")
    }
    
}
   
    
fun main() {
   var audiA3 = Car(1.0,"A3", "Audi")
   var teslaSM = ElectricCar(2.0,"S-Model", "Tesla", 85.0)
   
   teslaSM.extendRange(200.0)
   
   // Polymorfism
   audiA3.drive(200.0)
   teslaSM.drive(300.0)
   
    
   teslaSM.drive()
   
   audiA3.brake()
   teslaSM.brake()
}    
    
