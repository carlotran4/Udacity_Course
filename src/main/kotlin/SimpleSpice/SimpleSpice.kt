package SimpleSpice

class SimpleSpice {
    var name:String = "curry"
    var spiciness:String = "mild"
    val heat:Int?
        get() =
            when(spiciness){
                "mild" -> 5
                "spicy" -> 10
                "really spicy" -> 15
                else -> null
            }

}

