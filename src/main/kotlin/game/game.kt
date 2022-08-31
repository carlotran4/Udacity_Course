package game

enum class Directions {
    NORTH,
    SOUTH,
    EAST,
    WEST,
    START,
    END,
}

class Game {
    var path = mutableListOf<Directions>(Directions.START)
    fun move(where: (Game) -> Unit){
        where
    }
    fun makemove(string: String?){
        when(string){
            "east" -> move(east)
            "west" -> move(west)
            "north" -> move(north)
            "south" -> move(south)
            else -> move(end)
        }
    }
}
    val east = {game:Game -> game.path+=Directions.EAST}
    val west = {game:Game -> game.path+=Directions.WEST}
    val north = {game:Game -> game.path+=Directions.NORTH}
    val south = {game:Game -> game.path+=Directions.SOUTH}
    val end = {game:Game ->
               game.path+=Directions.END
                println("game over: Path = ${game.path}")
                game.path = mutableListOf()

    }


fun main(){
   val mygame = Game()
    println("Enter a direction: north,south,east,west")
    while(true) {
        val str = readLine()
        mygame.makemove(str)
        println(mygame.path)
    }

}