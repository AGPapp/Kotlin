import com.sun.xml.internal.fastinfoset.util.StringArray
import kotlin.system.exitProcess

fun main() {

    //Задание 7
//    var otvet:Int = 0
//
//    println("Тест на все")
//    println("Необходимо указывать номер варианта ответа")
//    println("-- Какой цвет на флагах государств обозначает смелость и мужество?")
//    println("1 - Коричневый \n2 - Красный \n3 - Зеленый\n4 - Синий"  )
//    var aText: String = readLine().toString()
//    var a:Int = aText.toInt()
//    if (a == 2) otvet += 1
//
//    println("-- Какая из перечисленных рек — самая длинная?")
//    println("1 - Нева \n2 - Миссисипи \n3 - Волга \n4 - Нил"  )
//    var aText2 = readLine().toString()
//    var b:Int = aText2.toInt()
//    if (b == 4) otvet += 1
//
//    println("-- Какой по счету от Солнца является Земля?")
//    println("1 - Третья \n2 - Пятая \n3 - Вторая \n4 - Первая"  )
//    var aText3 = readLine().toString()
//    var с:Int = aText3.toInt()
//    if (с == 1) otvet += 1
//
//    println("-- Чему равно отношение пути к времени?")
//    println("1 - Скорости \n2 - Расстоянию \n3 - Производительности \n4 - Силе"  )
//    var aText4 = readLine().toString()
//    var d:Int = aText4.toInt()
//    if (d == 1) otvet += 1
//
//    println("-- Как называется прямая, ограниченная точками?")
//    println("1 - Луч \n2 - Отрезок \n3 - Биссектриса \n4 - Плоскость")
//    var aText5 = readLine().toString()
//    var e = aText5.toInt()
//    if (e == 1) otvet += 1
//    println("-- Сколько звуков в слове «конь»?")
//    println("1 - Четыре \n2 - Три \n3 - Пять ")
//    var aText6 = readLine().toString()
//    var f = aText6.toInt()
//    if (f == 1) otvet += 1
//
//    when (otvet){
//        in 1..3 -> println("Не стоило прогуливать школу.")
//        4,5 -> println("Определенно, что-то знаешь, но можно лучше.")
//        6 -> println("Превосходно!!! Осталось понять, зачем все это помнить?")
//        else -> println("Даже наугад, получилось бы лучше!!!")

    // Задание 8

//    println("-- Укажите суммы вклада:")
//    var sumS = readLine().toString()
//    var sum = sumS.toDouble()
//    println("-- Укажите срок вклада:")
//    var dlS = readLine().toString()
//    var dl = dlS.toInt()
//    println("-- Укажите ежемесячный процент:")
//    var procS = readLine().toString()
//    var proc = procS.toDouble()
//    var a=1
//    var b:Double =0.0
//    while (a <= dl){
//        b = sum * proc/100
//        sum = sum+b
//        println("Процентов в $a месяце: ${"%.2f".format(b)} \n Итоговая сумма на $a месяц: $${"%.2f".format(sum)}")
//        a++
//    }
     // Задание 9

//    val info = Array(3,{Array(3,{"0"})})
//    info[0] = arrayOf("Боливия","Португалия","Ангола")
//    info[1] = arrayOf("Ла-Пас","Лиссабон","Луанда")
//    info[2] = arrayOf("Боливиано","Евро","Кванза")
//    for (i in 0 until info[0].size ){
//        for (x in 0 until info.size){
//            print("${info[x][i]}\t")
//        }
//        println()
//    }



    //Задание 10

//    var citi: MutableList<String> = mutableListOf()
//    fun sel(): String {
//        println(
//            "Что вы хотите?\n"+
//            "1.  - Добавить город\n"+
//            "2.  - Список всех добавленных городов\n"+
//            "3.  - Список городов без повторений\n"+
//            "4.  - Выход\n"
//        )
//        return readLine().toString()
//    }
//    fun add (){
//        println("Введите название города:")
//        var i = readLine().toString()
//        citi.add(i)
//    }
//
//    fun printAll(){
//        for (c in citi){
//            println(c)
//        }
//    }
//
//    fun printDist(){
//        for(d in citi.distinct()){
//            println(d)
//        }
//    }
//    var x = true
//    fun quit(){
//        x = false
//        println("Выход")
//    }
//    while (x){
//        when (sel()){
//            "1"-> add()
//            "2"-> printAll()
//            "3"-> printDist()
//            "4"-> quit()
//            }
//        }
//

    //Задание 11

        var mesta: HashMap<Int, String> = HashMap()
        mesta.put(1, "Иванов Иван Иванович")
        mesta.put(2, "Васильев Василий Васильевич")
        mesta.put(3, "Олегов Олег Олегович")
        mesta.put(15, "Николаев Николай Николаевич")


    fun add() {
        println("Укажите место:")
        var m = readLine().toString().toInt()
        if (mesta.containsKey(m)) {
            println("Место занято.\n Перезанять - 1,\n Выбрать другое - 2")
            var n = readLine().toString().toInt()
            when (n) {
                1 -> {println("Укажите ФИО: ")
                    var fio = readLine().toString()
                    mesta.put(m, fio)
                    println("Место $m занял $fio\n\n")
                }
                2->add()
            }
        }
        else{
            println("Укажите ФИО:")
            var fio = readLine().toString()
            mesta.put(m, fio)
            println("Место $m занял $fio\n\n")}
    }
    fun find(){
        println("Введите номер интересующего Вас места:")
        var x = readLine().toString().toInt()
        println("\nМесто $x занимает:  \"${mesta.get(x)}\"\n\n")
    }

        while (true) {
            println("Что вы хотите:\n 1 - Занять какое-то место. \n 2 - Посмотреть кто занял место. \n 3 - Уйти.")
            var input = readLine().toString().toInt()
            when (input) {
                1 -> add()
                2 -> find()
                3 -> break
                else -> {
                    println("Вероятно, что-то нажали, попробуйте еще раз.\n\n\n"
                    )
                }
            }
        }
    }











