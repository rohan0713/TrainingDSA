package oops.task2

class GTI(val solarPanel: SolarPanel) : SolarInverters(
    true,
    SolarPanel(100)
) {
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