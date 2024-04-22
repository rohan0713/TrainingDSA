package oops.task2

class SolarInverters(
    name : String,
    hasBattery : Boolean,
    private val gridOn : Boolean,
    val solarPanel: SolarPanel) : Inverters(name, hasBattery) {

    override fun display() {
        if (gridOn) {
            println("Solar Inverter with grid on")
        } else{
            println("Solar Inverter without grid on")
        }
    }

    override fun getPowerRating(): Int {
        return super.getPowerRating()
    }
}