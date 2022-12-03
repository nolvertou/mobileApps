// Goal: Write a program that adds five Numbers (Double) to an arrayList 
// 			and then calculates the average of those numbers.
// Creation Date: 12/02/2022
// Created by: Engineer Nolverto Urias Obeso


fun main(){
    var arrayList: ArrayList<Double> = ArrayList<Double>()
    var average: Double;
    var sum: Double = 0.0
    
    arrayList.add(1.0)
    arrayList.add(2.0)
    arrayList.add(3.0)
    arrayList.add(4.0)
    arrayList.add(5.0)
    
    for(element in arrayList){
       sum += element
    }
    average = sum / arrayList.size
    println("ArrayList elements: ${arrayList}")
    println("Average: $average")
}
