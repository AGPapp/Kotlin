import java.time.Year
import kotlin.math.sqrt

fun main() {
   // z12()
   // z13()
    // z14()
   // z15()
   // z16(4.0)
}




    // Задание 12
    fun z12() {
        fun seeYear(year: Int): Boolean {
            var leap = (year % 400 == 0) || (year % 4 == 0) && (year % 100 != 0)
            if (leap) {
                println("$year год - високосный")
            } else {
                println("$year год - не високосный")
            }
            return leap

        }
        println("Укажите проверяемый год: ")
        var year = readLine().toString().toInt()
        seeYear(year)
    }
// Задание 13

fun z13(){
    fun work (vararg spisok: String): Int{
        println("Всего имен: ${spisok.size}")
        return spisok.size
    }
    work("Петр", "Виктор", "Александр")

    }

// Задание 14
fun z14(){
    fun print(fio:String,dolgnost:String)= println("ФИО - $fio,\nДолжность - $dolgnost")
    fun print(fio:String,vozrast:Int,dolgnost:String)= println("ФИО - $fio,\nВозраст - $vozrast,\nДолжность - $dolgnost")
    fun print(fio:String,fem:String,dolgnost:String)= println("ФИО - $fio,\nСемейное положение - $fem,\nДолжность - $dolgnost")
    fun print(fio:String,vozrast:Int,fem:String,dolgnost:String)= println("ФИО - $fio,\nВозраст - $vozrast,\n" +
            "Семейное положение - $fem,\n Должность - $dolgnost")

    println(print("Виктор", "Холост","Директор"))
}
//Задание 15
fun z15() {

    var mass: Array<String> = arrayOf("Ночь", "Улица", "Фонарь")
    var print = {message: Array<String> ->
        for (i in message)
            println(i)
    }
    print(mass)
}
//Задание 16
fun z16(d:Double) {
fun Double.sqrt(): Double {
    return sqrt(this)
}
    println(d.sqrt())
}
















