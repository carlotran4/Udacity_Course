fun main(){
    var i: Int = 1
    loop@ while(i<=10) {
        val fortune = getFortuneCookie()
        println("your fortune is $fortune")
        if (fortune == "take it easy- enjoy life"){
            break@loop
        }
        i++
    }
}

fun getFortuneCookie() : String{
    val fortunes = listOf("you will have a great day", "Things go well for u today",
    "enjoy a wonderful day of success", "be humble- all will turn out well",
    "Exercise restraint today","take it easy- enjoy life","treasure ur friends")

    val birthday = getBirthday()

    return when(birthday){
        in 1..2 -> fortunes[0]
        in 27..31 -> fortunes[3]
        else -> "you are not worthy of a fortune"
    }
}

fun getBirthday(): Int{
    println("Enter the day of your birthday")
    var birthday : Int? = readLine()?.toIntOrNull()
    birthday = birthday?: 1
    return birthday
}