fun main(){
    var numz = people(listOf("Shamim","Jess","Rome","intellij","Voltage","Arduino","uno","You","Celine","Turin"))
   // println(p)
    var ppl = size(listOf(1.5,3.4,1.7))
    println(ppl)
   var human= Person("John",22,55.4F)
    var human1= Person("Esther",32,24.5F)
    var human2 = Person("Brenda",29,34.3F)
    var watu= mutableListOf(human,human1,human2)
    var sorted = watu.sortedByDescending { x->x.age }
    println(sorted)
   var  human3=Person("Cudra",34,34.2F)
   var  human4=Person("Book",19,4.34F)
    var p = mutableListOf(human3,human4)
    println( watu.plus(p))
    var vehicle= Car("KCD234",23.34)
    var v1 = Car("DRE3456",23.45)
    var v2 = Car("DWR5766",21.34)
    var magari = listOf(vehicle,v1,v2)





    var r = mutableListOf<String>()

    //r.add(Person("Laptop",45,12F)



}
//Given a list of people's heights in metres,Write a function that returns the average height and total.
fun people(numz:List<String>):List<String> {
    var p=  mutableListOf<String>()
    numz.forEachIndexed { index, name ->
        if (index % 2 == 0) {
            p.add(name)
            println(p)
        }
    }
    return p


}




fun size(height:List<Double>):String{
    var adding = height.sum()
    var avg = height.average()
    var both = "$adding $avg"
    return both
}
//Given a list of Person object,each with the attributes,name,age and weight.Sort list in order of descending age.
data class Person( var name:String,var age:Int,var weight:Float)

    fun eat(r:List<Person>){

    }
data class Car (var registeration:String,var mileage:Double)

fun drive(magari:List<Car>){
    var sum =0.0
    magari.forEach{ voom ->
        sum+=voom.mileage

    }
    var avg = sum/magari.count()
    println(avg)


}


