package oops.day3.task1

class FloorManagement : AdminRole , UseCaseParkingLot{

    val board : Board = Board()

    private val floorList: HashMap<Int, Int> = HashMap()

    //    fun takeParkingFee(customer: Customer, type : String) {
//        if (type == "credit") {
////            ParkingLot.payUsingCreditCard()
//        }else{
////            ParkingLot.payThroughCash()
//        }
//        println("paid parking fee : ${customer.ticket.getEntryTicket()}")
//    }

    override fun addParkingFloor(type: Adm, num : Int , parkingSpots: List<ParkingSpot>) {
        super.addParkingFloor(type, num, parkingSpots)
        floorList.put(num, parkingSpots.size)
    }

    override fun removeParkingFloor(type: Adm, num: Int) {
        super.removeParkingFloor(type, num)
        floorList.remove(num)
    }

    override fun modifyParkingSpots(type: Adm, parkingSpots: List<ParkingSpot>, floor: Int) {
        super.modifyParkingSpots(type, parkingSpots, floor)
        for (i in floorList) {
            if (floorList.containsKey(floor)) {
                val count = floorList[floor]
                if (count != null) {
                    floorList.put(floor, count + parkingSpots.size)
                }
            }
        }
    }

    override fun addParkingSpot(type: Adm, floor: Int) {
        super.addParkingSpot(type, floor)
        if (floorList.containsKey(floor)) {
            var count = floorList.get(floor)!!
            floorList.put(floor, ++count)
        }
    }

    fun getFloorsCount(): Int {
        return floorList.size
    }

    fun removeParkingSpot(floor: Int, spot: ParkingSpot){
        if (floorList.containsKey(floor)) {
            var count = floorList.get(floor)!!
            floorList.put(floor, --count)
        }
    }

    override fun addOrModifyEntrancePanels(type: Adm) {
        super.addOrModifyEntrancePanels(type)
    }

    override fun addOrModifyExitPanels(type: Adm) {
        super.addOrModifyExitPanels(type)
    }

    override fun addOrRemoveAttendants(type: Adm) {
        super.addOrRemoveAttendants(type)
    }

    override fun addOrModifyParkingFloors(type: Adm) {
        super.addOrModifyParkingFloors(type)
    }
}

