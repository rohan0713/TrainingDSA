package oops.task2

fun main() {


    val solarPanel = SolarPanel(100)
    val pcu = PCU(solarPanel)
    println(pcu.type)
    println(pcu.getBatteryCount())
    println(pcu.gridOn)
    pcu.addBattery()
    println(pcu.getBatteryCount())
    pcu.addBattery()
    println(pcu.getBatteryCount())

    val solarPanel2 = SolarPanel(50)
    val gti = GTI(solarPanel2)
    println(gti.type)
    println(gti.getBatteryCount())
    println(gti.gridOn)
    gti.addBattery()
    println(gti.getBatteryCount())

    val zelio = Zelio()
    println(zelio.type)
    println(zelio.hasBattery)

}