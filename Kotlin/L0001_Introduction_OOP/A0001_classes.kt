fun main() {
    // Creating instances of classes 
    var john = Person()
    var Max = Person("Maxwell", "Urias")
    
}


class Person(firstName : String = "John", lastName : String = "Doe"){
    // Initializer Block
    init{
        println("Initialized a new Person object with " + 
                 "firstname = $firstName and lastname = $lastName" )
    }
}
