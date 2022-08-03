fun main(){
    println("enter your mood")
    val foo: String = readLine()!!
    println(whatShouldIDoToday(mood = foo))
}

fun whatShouldIDoToday(mood : String, weather: String = "sunny", temperature: Int = 24) : String{


    return when {
        mood == "happy" && weather == "sunny" -> "go for a walk"
        temperature <= 0 -> "make hot chocolate"
        mood == "sad" -> "curl into fetal position"
        else -> "you are numb nuts"
    }



}