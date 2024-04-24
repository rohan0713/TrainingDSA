package oops.day3.task1

object System {

    private var capacity : Int = 3

    fun displayMessages(): Panels {
        return Panels("message")
    }

//    fun assignVehicle() {
//        if (checkCapacity()) {
//            ParkingLot.editParkingSpot()
//            capacity--
//        }
//    }
//
//    fun removeVehicle() {
//        ParkingLot.addParkingSpot()
//        capacity++
//    }

    private fun checkCapacity(): Boolean {
        if (capacity != 0) {
            return true
        }
        println("parking spots full")
        return false
    }

    fun calculateFee(timeSpent : Int): Any {
        if (timeSpent in 61..179) {
            return 3.5
        } else if ( timeSpent <= 60){
            return 4
        }
        return 2.5
    }

}