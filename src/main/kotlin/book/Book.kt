package book

const val maxbooks = 3


open class Book(open val author:String = " ", open val title: String= " ", open var pages:Int = 0) {
    open var currentpage: Int = 0
    open val multiplier: Int = 1
    fun canBorrow(numofbooks:Int=0): Boolean{
        return when{
            numofbooks>=maxbooks -> false
            else -> true
        }
    }
    companion object Constants{
        const val BASE_URL = "https://library/"
    }

    fun printUrl(){
        println("$BASE_URL$title.html")
    }
}

fun Readpage(bookvar:Book){
    bookvar.currentpage = bookvar.currentpage + (1*bookvar.multiplier)
}


class Ebook(override val author: String, override val title: String): Book() {
    override val multiplier: Int = 250
}