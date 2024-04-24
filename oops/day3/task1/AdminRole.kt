package oops.day3.task1

interface AdminRole {

    fun modifyParkingSpots(type: Adm, parkingSpots: List<ParkingSpot>, floor: Int) {

    }

    fun addParkingSpots(type: Adm, parkingSpots: List<ParkingSpot>, floor: Int) {

    }

    fun addOrModifyEntrancePanels(type: Adm) {

    }

    fun addOrModifyExitPanels(type: Adm) {

    }

    fun addOrRemoveAttendants(type: Adm) {

    }

    fun addOrModifyParkingFloors(type: Adm) {

    }

}