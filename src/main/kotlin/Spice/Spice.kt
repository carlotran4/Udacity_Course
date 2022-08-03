package Spice

class Spice (var name: String, var spiciness: String = "mild") {
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




}

fun makesalt() {
    val salt = Spice("salt", "mild")
}