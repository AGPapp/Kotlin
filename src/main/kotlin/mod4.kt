
fun main() {
    var bo=Boeing747("ds34563",10000,25000,500)
    println(bo.printInfo())
}

abstract class Aircraft(protected var num:String, protected var maxLength:Int, protected var tank:Int){
    private var x = maxLength.toDouble()
    private var y = tank.toDouble()
    var raskhod = 0.0
        get() {
            return (x / y)*100
           }
    open fun printInfo(){
     println("Номер судна: $num; \nДальность полета: $maxLength; \nВместимость баков: $tank; \nРасход л/100 км: $raskhod;")
          }
}


interface Passenger {
    var capacity: Int
}


class Boeing747(num: String, maxLength:Int, tank:Int, override var capacity:Int):Aircraft(num, maxLength, tank),Passenger{
    override fun printInfo() {
        super.printInfo()
        println("Вместимость пассажиров: $capacity;")
    }
}