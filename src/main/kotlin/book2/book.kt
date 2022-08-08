package book2

class Book( title:String,  author: String,  year: String) {
    val titleauthor = title to author
    val all = Triple(title, author, year)

    fun details():Pair<String,String>{
        return titleauthor
    }

    fun moredetails(): Triple<String,String,String>{
        return all
    }

}

fun main(){
    val mybook = Book("harry potter", "JK rownling", "2005")
    val (title, author, year) = mybook.moredetails()
    println("my book is named $title, is written by $author, and was wrote in $year")
}