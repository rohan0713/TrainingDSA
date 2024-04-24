package oops.day4.task1

class CityManagement(
    private val max : Int
) {

    private val cities : MutableList<Wall> = mutableListOf()
    private val walls : MutableList<Wall> = mutableListOf()
    val cityMap : HashMap<Wall, Int> = HashMap()

    fun addWall(wall: Wall) {
        if (walls.size < max) {
            walls.add(wall)
        } else {
            println("can not add more bricks")
        }
    }

    fun getWallsCount(): Int {
        return walls.size
    }
}