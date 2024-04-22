package oops.task2

class Regalia(private val solarPanel: SolarPanel)
    : SolarInverters(false, solarPanel) {
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