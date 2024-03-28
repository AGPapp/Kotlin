package Fin

abstract class Aircraft(protected var name:String,protected var num:String, protected var maxLength:Int, protected var tank:Int){
    var raskhod = 0.0
        get() {
            return (maxLength.toDouble()/ tank.toDouble())*100
        }
    open fun printInfo(){
        println("Модель самолета: $name;\nНомер: $num; \nДальность полета: $maxLength; \nВместимость баков: $tank; \nРасход л/100 км: $raskhod;")
    }

    open fun model():String{
        return name
    }
    open fun number():String{
        return num
    }
}
interface Passenger {
    var capacity: Int
}
interface  Lift {
    var lift: Int
}
