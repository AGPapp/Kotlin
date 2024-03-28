package Fin

class An70(name:String,num: String, maxLength:Int, tank:Int, override var capacity:Int,override var lift: Int):Aircraft(name,num, maxLength, tank),Passenger,Lift{
    override fun printInfo() {
        super.printInfo()
        println("Вместимость пассажиров: $capacity;\nГрузоподъемность: $lift;")
    }}

class Boeing747(name:String, num: String, maxLength:Int, tank:Int, override var capacity:Int):Aircraft(name,num, maxLength, tank),Passenger{
    override fun printInfo() {
        super.printInfo()
        println("Вместимость пассажиров: $capacity;")
    }}

class An2(name:String,num: String, maxLength:Int, tank:Int, override var lift:Int):Aircraft(name,num, maxLength, tank),Lift{
    override fun printInfo() {
        super.printInfo()
        println("Грузоподъемность: $lift;")
    }}

class airbus380(name:String,num: String, maxLength:Int, tank:Int, override var capacity:Int):Aircraft(name,num, maxLength, tank),Passenger{
    override fun printInfo() {
        super.printInfo()
        println("Вместимость пассажиров: $capacity;")
    }}