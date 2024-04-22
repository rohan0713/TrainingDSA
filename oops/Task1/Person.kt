package oops.Task1

class Person(val name : String,
             constituency: String) {

    val constitute = Constituency(constituency)

    private var driver : Driver? = null

    fun assignDriver(driver: Driver) {
        this.driver = driver
    }

    fun getDriver(): String {
        return this.driver?.name!!
    }
}