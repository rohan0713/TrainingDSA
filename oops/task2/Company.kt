package oops.task2

fun main() {

    val zelio = Inverters("ZELIO", true)
    val icruze = Inverters("iCruze", true)
    zelio.display()
    println(icruze.getPowerRating())

    val solarPanel = SolarPanel(100)
    val solarPanel2 = SolarPanel(200)

    val si = SolarInverters("PCU", true, false, solarPanel)
    val si2 = SolarInverters("GTI", false, true, solarPanel2)
    val si3 = SolarInverters("REGALIA", false, true, solarPanel2)

    si.display()
    si2.display()
    println(si.solarPanel.capacity)
    println(si.getPowerRating())
}