package oops.Task1

open class Ministry() {

    private var driverName : String = ""

    fun assignDriver(name : String) {
        this.driverName = name;
    }

    fun getDriver(): String {
        return this.driverName
    }
}