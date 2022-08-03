fun main() {
    val rolldice = { sidesused: Int ->
        when (sidesused) {
            0 -> 0
            else -> (1..sidesused).random()
        }
    }
    println(rolldice(12))

    val rolldice2: (Int) -> Int = {sidesused ->
        when (sidesused) {
            0 -> 0
            else -> (1..sidesused).random()
        }
    }

    fun gameplay(){
        rolldice2(14)
        println(rolldice2)
    }
    gameplay()
}