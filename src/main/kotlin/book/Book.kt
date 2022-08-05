package book

open class Book(open val author:String = " ", open val title: String= " ") {
    open var currentpage: Int = 0
    open val multiplier: Int = 1


}

fun Readpage(bookvar:Book){
    bookvar.currentpage = bookvar.currentpage + (1*bookvar.multiplier)
}


class Ebook(override val author: String, override val title: String): Book() {
    override val multiplier: Int = 250
}