
fun main(){


val car = Car("Москвич", "Розовый", "о001но777")
println(car.toString())
}
data class Car(val brand:String, val color:String, val number:String) {
}