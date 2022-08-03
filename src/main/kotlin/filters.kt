fun main(){
    val spices = listOf("pepper","curry", "cayenne", "ginger", "red curry", "green curry", "red pepper" )
    val ordered = spices.sortedBy {it.length }
    println(ordered)

    //var filtered = spices.filter { it[0] == 'c' }
    //filtered = filtered.filter {it[it.length-1] == 'e'}
    //println(filtered)

    val filtered = spices.filter { it[0] == 'c' && it[it.length-1] == 'e'}
    println(filtered)
}