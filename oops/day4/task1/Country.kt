package oops.day4.task1

class Country(
) {
    private val cities : MutableList<CityManagement> = mutableListOf()

    fun addCity(city: CityManagement) {
        cities.add(city)
    }

    fun getCity(): Int {
        return cities.size
    }
}