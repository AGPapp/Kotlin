package Fin
fun main() {
    var park: ArrayList<Aircraft> = ArrayList()
    park.add(Boeing747("Boeing747", "BY1459", 10000, 9000, 747))
    park.add(airbus380("Airbus380", "AE1909", 7500, 3000, 380))
    park.add(airbus380("Airbus380", "AE1910", 9500, 5000, 380))
    park.add(An70("An70", "AN5709", 9500, 10000, 50, 5000))
    park.add(An2("An2", "AN4559", 1000, 400, 3800))



   fun modelAir(){
         println("Введите модель самолёта:")
                var mod = readLine().toString()
                for (air in park){
                    if (air.model().equals(mod)){
                        air.printInfo()
                        println("---------------\n")
                    }}
   }
    fun numberAir(){
        println("Введите номер самолёта:")
       var num = readLine().toString()
        for (air in park){
            if (air.number().equals(num)){
                air.printInfo()
                println("---------------\n")
            }
        }
    }
    fun printAll(){
        for (air in park){
            println("${air.model()} - ${air.number()}\n---------")
        }
        println("\n\n")
    }

    fun printAir(){
        println(
            "Поиск:\n"+
                    "1.  - По модели\n"+
                    "2.  - По номеру\n"
        )
        var find = readLine().toString()
        when (find){
            "1"-> modelAir()
            "2"-> numberAir()

        }
    }
    var x = true
    fun quit(){
        x = false
        println("Выход")
    }
    fun front(): String {
        println(
            "Что вы хотите?\n"+
                    "1.  - Список самолетов\n"+
                    "2.  - Получить информацию по самолету(ам)\n"+
                    "3.  - Выход\n"
        )
        return readLine().toString()
    }
    while (x){
        when (front()){
            "1"-> printAll()
            "2"-> printAir()
            "3"-> quit()
        }
    }

}








