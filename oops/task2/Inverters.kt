package oops.task2

open class Inverters(
    val type: String,
    val batteries: MutableList<Battery> = mutableListOf()
) {

    private val current = 13
    private val operating_voltage = 200

    open fun getPowerRating(): Int {
        return current * operating_voltage
    }

    open fun display() {
        println("$type inverter")
    }

    open fun getBatteryCount(): Int {
        return batteries.size
    }
}