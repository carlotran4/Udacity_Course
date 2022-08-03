fun main(args:Array<String>){
    when(args[0].toInt()){
       in 0..12 -> println("good morning kotlin")
        in 12..24 -> println("good night kotlin")
    }

    //one line solution
    println(if(args[0].toInt() < 12) "good morning kotlin" else "good night kotlin")
}