
fun main() {
    var air: Air = Air("g4545", 5000, 2000);

    println("Средний расход на 1 км - ${air.raskhod} л.")
}

class Air(var num:String, var maxLength:Int,var tank:Int){
    var raskhod: Any = 0.0
        get() {
            return maxLength / tank
        }


}