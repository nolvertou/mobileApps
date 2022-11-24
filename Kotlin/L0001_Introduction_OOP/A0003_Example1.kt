fun main(){
    val iphone = MobilePhone("iOS", "Apple", "iPhone 12")
    val galaxyS20 = MobilePhone("Android", "Samsung", "Galaxy S20")
    
    val mateXS = MobilePhone("Android", "Huawei", "Mate X S")
    
    iphone.chargeBattery(30)
     iphone.chargeBattery(33)
    iphone.displayBattery()
}


class MobilePhone(osName: String, brand: String, model: String){
    private var battery = 30
    private lateinit var model: String;
    
    init{
        println("The phone $model from $brand uses $osName as its Operating System") 
        this.model = model
    }
    
    fun chargeBattery(chargedBy: Int){
        println("Battery was at $battery and is at ${battery+chargedBy} now")
        
        battery += chargedBy
    }
    
    fun displayBattery(){
        println("The current battery of my phone $model is $battery")
    }
    
}
