fun main() {
//    println(createHumanlist())





}
//Given a list of 10 strings, write a function that returns a list of the strings
//at even indices i.e index 2,4,6 etc
fun ind(){
    val Names =  mutableListOf("Ann","Cate","Cindy","Awour","Naomi","Kelvin"," George","Wycliffe","Myles", "Mike")
    var evenNames = Names.filter {
        it %2==0
    }
  return(Names)

}



//Given a list of people’s heights in metres. Write a function that returns
//the average height and the total height.
fun calculateHeight(height: Double): Double {
    var height = mutableListOf(5.5, 6.8, 10.0, 6.0)
    println(height.average())
    println(height.sum())

}


//Given a list of Person objects, each with t attributes, name, age,
//height and weight. Sort the list in order of descending age
data class Human(var names: String, var age:Int, var height: Int, var weight: Double ){

    fun createHumanlist(){
        val human1 = Human("Yekebedi", 22, 3, 60.2)
        val human2 = Human("Otieno", 20, 5, 20.2)
        val human3 = Human("Yekebedi", 22, 3, 60.2)
        val human4 = Human("Ongoma", 26,8 , 70.1)

        val humanlist = listOf(human1,human2,human3,human4)
        var sort = humanlist.sortedBy { human -> human.age }
        println(sort)
    }


}

//Given a list similar to the one above, write a function in which you will
//create 2 more people objects and add them to the list at one go.
fun add( topple: List){
var num =
}


//Write a function that takes in a list of Car objects each with a
//registration and mileage attribute and returns the average mileage of
//all the vehicles in the list.

data class Car(var registration: String, var mileage: Int ){
    fun calculateMileage(){
        fun cars(Car:List<>){

        }



    }



}