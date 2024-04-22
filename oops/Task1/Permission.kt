package oops.Task1

class Permission(private val name : String) {

    private var flag = false

    fun givePermission() {
        if(name == "PM") {
            this.flag = true
        }
    }

    fun hasPermission(): Boolean {
        return flag
    }
}