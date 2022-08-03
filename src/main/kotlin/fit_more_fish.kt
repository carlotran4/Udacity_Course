fun main(){
    fitMoreFish(10.0,listOf(), 7,true)
}

fun fitMoreFish(tankSize: Double,
                currentFish: List<Int>,
                fishSize: Int = 2,
                hasDecorations: Boolean = true)
{
    if (hasDecorations == true){
        if((tankSize*0.8)/(currentFish.sum()+fishSize)>=1){
            println("True")
        }
        else{
            println("False")
        }

    }
    else {
        if(tankSize/(currentFish.sum()+fishSize)>=1){
            println("True")
        }
        else{
            println("False")
        }
    }
}