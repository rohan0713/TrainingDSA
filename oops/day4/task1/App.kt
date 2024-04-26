package oops.day4.task1

fun main() {

    println("Enter the number of cities")
    val n: Int? = readlnOrNull()?.toInt()

    val userManagement = UserManagement()
    val cityManagement = n?.let { CityManagement(it) }
    val brickManagement = BrickManagement()

    for (j in 1..6) {
        println("Enter a user name")
        val name = readlnOrNull()
        name?.let {
            val user = User(j , name)
            userManagement.addUser(user)
        }
    }

    n?.let {
        wallInitialization(it, userManagement, cityManagement, brickManagement)
    }

    println("Total number of walls : ${cityManagement?.getWallsCount()}")
    println(brickManagement.findHottest())
    brickManagement.findLowestDedications(userManagement.users)
}

fun wallInitialization(
    n: Int,
    userManagement: UserManagement,
    cityManagement: CityManagement?,
    brickManagement: BrickManagement
) {

    for (i in 1..n) {

        var brick: Brick? = null
        println("How many wall you want in a city $i?")
        val num: Int? = readlnOrNull()?.toInt()
        for (j in 1..num!!) {

            val wall = Wall()
            while (true) {

                println("You can add brick up to 90 in the wall $j")
                println("Add a brick (0/1)")
                if (readlnOrNull()?.toInt() == 0) {
                    break
                }
                println("Which user will own the brick?")
                val name = readlnOrNull()
                if (userManagement.data.containsKey(name)) {
                    println("give caption for brick")
                    val caption = readlnOrNull()!!
                    println("write a message")
                    val message = readlnOrNull()!!
                    val list :MutableList<String> = mutableListOf()
                    println("dedicate this message to someone?")
                    var dedicateTo = readlnOrNull()!!
                    if (userManagement.data.containsKey(dedicateTo)) {
                        list.add(dedicateTo)
                    }else{
                        println("this user not present in db")
                    }
                    while (true){
                        println("want to dedicate this message to someone else? (0/1)")
                        val input = readlnOrNull()!!.toInt()
                        if (input == 0) {
                            break
                        }
                        println("dedicate this message to someone")
                        dedicateTo = readlnOrNull()!!
                        if (userManagement.data.containsKey(dedicateTo)) {
                            list.add(dedicateTo)
                        }else{
                            println("this user not present in db")
                        }
                    }

                    brick = Brick(
                        name!!,
                        caption,
                        message,
                        list,
                        false
                    )
                } else {
                    println("No User Found")
                }
                if (brick != null) {
                    if (wall.canAddBricks()) {
                        wall.addBricks(brick)
                        brickManagement.addBrickDetails(brick.owner)
                        brickManagement.addDedications(brick.dedicateTo)
                        println(brick.dedicateTo)
                        println("brick dedicated to : ${brick.dedicateTo.size}")
                    } else {
                        println("bricks limit exceeded")
                        break
                    }
                }
            }
            cityManagement?.addWall(wall)
            println(cityManagement?.getWallsCount())
        }
    }
}