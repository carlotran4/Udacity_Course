fun main(){
    println(isMultipleOfThree(listOf(1,2,3,4,5,6,7,8,9,0)))
}

fun isMultipleOfThree(list:List<Int>):List<Int>{
    val templist = mutableListOf<Int>()
    for(i in list){
        if(i % 3==0 ){
            templist+=i
        }
    }
    return templist

}