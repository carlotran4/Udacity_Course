package buildings

open class BaseBuildingMaterial (){
    open val numberNeeded = 1
    open val name = "base material"
}

class Wood(): BaseBuildingMaterial(){
    override val numberNeeded = 4
    override val name = "wood"
}

class Brick(): BaseBuildingMaterial(){
    override val numberNeeded = 8
    override val name = "Brick"
}

class Building <T: BaseBuildingMaterial>(val material: BaseBuildingMaterial){
    val baseMaterialsNeeded = 100
    val actualMaterialsNeeded = material.numberNeeded*baseMaterialsNeeded
    fun build(){
        println("$actualMaterialsNeeded ${material.name} required")
    }
}

fun main(){
    val whitehouse:Building<BaseBuildingMaterial> = Building(BaseBuildingMaterial())
    whitehouse.build()
}