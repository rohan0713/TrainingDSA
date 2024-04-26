package oops.day6.task1

class UserManagement {

    private val users : MutableList<String> = mutableListOf()

    fun addUser(user: User) {
        users.add(user.name)
        println("New User added")
    }

    fun removeUser(admin: Admin, user: User) {
        users.remove(user.name)
        println("User removed")
    }

    fun viewAllUsers(admin: Admin) {
        println(users)
    }
}