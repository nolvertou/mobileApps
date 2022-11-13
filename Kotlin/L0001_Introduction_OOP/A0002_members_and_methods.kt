fun main() {
    // Creating instances of classes 
    var john = Person()
    john.age = 17
    john.hobby = "Watch Netflix"
    john.stateHobby()
    
    var George = Person("George", "Urias", 26)
    George
    
}


class Person(firstName : String = "John", lastName : String = "Doe"){
    // Member Variables - Properties
    var age : Int ?= null
    var hobby : String ?= null
    var firstName : String ?= null
    
    
    // Initializer Block
    init{
        this.firstName = firstName
        println("Initialized a new Person object with " + 
                 "firstname = $firstName and lastname = $lastName" )
    }
    
    // Member Secondary Constructor
    constructor(firstName : String, lastName : String, age : Int)
    		: this(firstName, lastName){
                this.age = age
        
    }
    
    // Member functions - Methods
    fun stateHobby(){
        println("I am $age years old and my hobby is $hobby")
    }
}
