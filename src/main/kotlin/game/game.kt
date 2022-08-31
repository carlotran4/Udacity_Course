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

}
    val east = {game:Game -> game.path+=Directions.EAST}
    val west = {game:Game -> game.path+=Directions.WEST}
    val north = {game:Game -> game.path+=Directions.NORTH}
    val south = {game:Game -> game.path+=Directions.SOUTH}
    val end = {game:Game ->
               game.path+=Directions.END
                println("game over: Path = ${game.path}")
                game.path = mutableListOf()
                false
    }


fun main(){
   val mygame = Game()
    print(mygame.path)
    north(mygame)
    east(mygame)
    south(mygame)
    west(mygame)
    end(mygame)
    println(mygame.path)
}