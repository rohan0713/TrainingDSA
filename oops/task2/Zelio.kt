package oops.task2

class Zelio : NonSolarInverter(true) {

    init {
        batteries.add(Battery(true))
    }

    override fun getBatteryCount(): Int {
        return batteries.size
    }

    fun addBattery() {
        batteries.add(Battery(true))
    }
}