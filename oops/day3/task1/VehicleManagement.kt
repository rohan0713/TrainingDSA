package oops.day3.task1

class VehicleManagement(

) : UseCaseParkingLot{

    private var capacity : Int = 3

    fun displayMessages(): Panels {
        return Panels("message")
    }

    override fun editParkingSpot() {
        super.editParkingSpot()
    }

    fun assignVehicle(): Boolean {
        if (checkCapacity()) {
            editParkingSpot()
            capacity--
            return true
        }
        return false
    }
//

    fun removeVehicle() {
        capacity++
    }

    private fun checkCapacity(): Boolean {
        if (capacity != 0) {
            return true
        }
        println("parking spots full")
        return false
    }
}