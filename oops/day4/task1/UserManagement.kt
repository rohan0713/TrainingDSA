package oops.day4.task1

class UserManagement(
) {

    val users : MutableList<User> = mutableListOf()
    private val max : Int = 5
    val data : HashMap<String, MutableList<Brick>> = HashMap()

    fun addUser(user: User){
        if (users.size < max) {
            users.add(user)
            println("new user added")
            data[user.name] = mutableListOf()
            println()
        }else{
            println("user limit exceeded")
        }
    }

    fun getUsersCount(): Int {
        return users.size
    }
}