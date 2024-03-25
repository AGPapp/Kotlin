
fun main() {
    var air: Aircraft = Aircraft();
    air.tank = 2000
    println("Средний расход на 1 км - ${air.raskhod} литров.")
}

class Aircraft {
    var num: String = "Y1578";
    var maxLength: Int = 10000
    var tank: Int = 1000
    var raskhod:Any = 0.0
        get() {
            return maxLength / tank
        }


}