fun main() {
    val allbooks = listOf("hamlet", "romeo and juliet", "much ado about nothing")
    val library = mapOf<String, String>( "hamlet" to "shakespeare", "romeo and juliet" to "shakespeare")
    val containshamlet = library.toList()
    println(library.toList())
    println(containshamlet)

    val moreBooks = mutableMapOf<String,String>("hamlet" to "shakespeare", "romeo and juliet" to "shakespeare", "harry potter" to "jk rowling")

    moreBooks.getOrPut("lolita") {"weird guy"}
    println(moreBooks)
}
