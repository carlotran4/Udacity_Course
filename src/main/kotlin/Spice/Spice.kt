package Spice

abstract class Spice (open var name: String, open var spiciness: String = "mild"): SpiceColor {
    val heat:Int?
        get() =
            when(spiciness){
                "mild" -> 5
                "spicy" -> 10
                "really spicy" -> 15
                else -> null
            }
   init {
       println(name)
       println(spiciness)
   }
    abstract fun preparespice()
}

class Curry(spicelevel:String ):Spice("curry", spicelevel),Grinder{
    override fun grind() {
        println("grinding the curry")
    }
    override fun preparespice() {
        println("preparing the curry")
    }
    override val color = " yellow"



}

interface Grinder{
    fun grind()
}

interface SpiceColor {
    val color :String
}

object YellowSpiceColor: SpiceColor{
    override val color = "yellow"
}




//fun makesalt() {
//    val salt = Spice("salt", "mild")
//}


