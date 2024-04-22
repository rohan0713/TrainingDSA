package oops.task2

open class Inverters(private val name : String, private val hasBattery : Boolean) {

    private val current = 13
    private val operating_voltage = 200

    open fun getPowerRating(): Int {
        return current * operating_voltage
    }

    open fun display() {
        if (hasBattery) {
            println("non solar inverter with battery : ${this.name}")
        } else{
            println("no solar inverter without battery : ${this.name}")
        }
    }
}