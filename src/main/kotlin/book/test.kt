package book


fun main() {
    //var mybook = Book("carlo", "harry potter")
    //for ( i in 1..10){
    //    Readpage(mybook)
    //}
    //println(mybook.currentpage)
//
    //var myebook = Ebook("carlo", "harry potter")
    //Readpage(myebook)
//
    //println(myebook.author)
    //println(myebook.currentpage)

    fun Book.weight(): Double {
        return 1.5 * pages
    }

    fun Book.tornPages(n: Int = 0) {
        println("$n pages were torn ")
        pages -= n
    }

    class Puppy {
        fun playWithBook(b: Book) {
            b.tornPages((0..b.pages).random())
        }
    }

    val mypuppy = Puppy()
    val mybook = Book(pages=20)
    while (mybook.pages>0){
        mypuppy.playWithBook(mybook)
    }
}