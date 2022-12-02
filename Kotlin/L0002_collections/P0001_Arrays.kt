// Goal: Learn how to use arrays
// 12/01/2022
// Engineer Nolverto Urias Obeso
// 
data class Fruit(val name: String, val price: Double)

fun main() {
   val numbers = arrayOf(1,2,3,4,5,6)
   val numbersD: DoubleArray = doubleArrayOf(1.0,2.0,3.0,4.0,5.0,6.0)
   val days = arrayOf("Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday")
   val fruits = arrayOf(Fruit("apple", 2.5), Fruit("Banana", 3.0), Fruit("Avocado", 30.2))
   
   
   for(element in numbers){
       print(element)
   }
   println("\n")
   for(element in numbers){
       print("${element + 2}")
   }
   println("\n")
   
   println("Initial Values ${numbers.contentToString()}")
   
   // Modifying values of the array 
   numbers[0] = 6
   numbers[1] = 5
   numbers[4] = 2
   numbers[5] = 1
   
   println("\nFinal values: ${numbers.contentToString()}")
   
   
   println("\nDouble Array List: ${numbersD.contentToString()}")
   
   println("\nString Array List: ${days.contentToString()}")
   
   println("\nFruit Object Array List: ${fruits.contentToString()}")
   
   for(index in fruits.indices){
       println("${fruits[index].name} is in index $index")
   }
  
}


