package book

fun main(){
    var mybook = Book("carlo", "harry potter")
    for ( i in 1..10){
        Readpage(mybook)
    }
    println(mybook.currentpage)

    var myebook = Ebook("carlo", "harry potter")
    Readpage(myebook)

    println(myebook.author)
    println(myebook.currentpage)
}