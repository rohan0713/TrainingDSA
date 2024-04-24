package oops.day4.task1

class Wall {
    private val bricks : MutableList<Brick> = mutableListOf()
    private val max = 90

    fun addBricks(brick: Brick) {
        if (bricks.size < max) {
            bricks.add(brick)
            println("brick added")
        } else {
            println("can not add more bricks")
        }
    }

    fun bricksCount(): Int {
        return bricks.size
    }

    fun canAddBricks(): Boolean {
        return bricks.size < max
    }
}