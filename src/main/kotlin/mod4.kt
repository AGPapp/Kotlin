
fun main() {
    var bo=Boeing747("dsfg",123,232,500)
    println(bo.capacity)
}

abstract class Aircraft(var num:String, var maxLength:Int,var tank:Int){
    var raskhod: Any = 0.0
        get() {
            return maxLength / tank
        }


}
interface Passenger {
    var capacity: Int
}

class Boeing747(num: String, maxLength: Int, tank: Int, override var capacity:Int):Aircraft(num, maxLength, tank),Passenger{
}