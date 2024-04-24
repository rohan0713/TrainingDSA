package oops.day3.task1

interface UseCaseParkingLot {

    fun addParkingFloor(type : Adm, num : Int , parkingSpots: List<ParkingSpot>) {
        println("parking floor added")
    }

    fun removeParkingFloor(type: Adm, num: Int) {
        print("parking floor not available from now")
    }

    fun modifyParkingFloor() {
        println("parking floor under construction")
    }

    fun addParkingSpot(type: Adm, num: Int){
        println("parking spot vacant now")
    }

    fun removeParkingSpot() {
        println("can not park in this spot now")
    }

    fun editParkingSpot() {
        println("parking spot taken now")
    }

    fun addParkingAttendant() {
        println("new parking attendant assigned")
    }

    fun removeParkingAttendant(){
        println("parking attendant removed")
    }

    fun provideTicket(): Int {
        return 4
    }

    fun scanTicket() {
        println("ticket scanned")
    }
}