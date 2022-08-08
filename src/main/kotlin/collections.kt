fun main() {
    val allbooks = listOf("hamlet", "romeo and juliet", "much ado about nothing")
    val library = mapOf<String, String>( "hamlet" to "shakespeare", "romeo and juliet" to "shakespeare")
    val containshamlet = library.toList().any {it.equals("(hamlet, shakespeare)")}
    println(library.toList())
    println(containshamlet)
    //todo complete this problem
}