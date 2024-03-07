fun main(args: Array<String>) {
    println("Hello World!")

    // Задание 1
   var any:Any? = null
    var many = (any?:1) as Int

    var x  = many / 2.5; // Переменная будет Double

    // Задание 2

    var hel = "hello"
    var apl = "aplana"
    println("$hel $apl")

    // Задание 3
    var five:Char ='5'
    var fiveSt:String = five.toString()
    var fiveBt:Byte = five.code.toByte()
    var fiveSh:Short = five.code.toShort()
    var fiveInt:Int = five.code
    var fiveDo:Double = five.code.toDouble()
    var fiveFl:Float = five.code.toFloat()
    var fiveLo:Long = five.code.toLong()


        // Задание 4

    println("Как Вас зовут?")
    var userN: String? = readLine()
    var userName:String = userN.toString()
    println("Приветствую Вас, $userName!")

    // Задание 5

    var za = 'z'.downTo('a')
        //for (i in za) print(i)


    //Задание 6
    println("Введите число \"a\"")
    var aText: String = readLine().toString()
    var a:Double = aText.toDouble()
    println("Введите число \"b\"")
    var bText: String = readLine().toString()
    var b:Double = bText.toDouble()
    var c:Boolean = a>b
    println(c)

    }



