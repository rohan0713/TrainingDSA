package oops.day3.task1

fun main() {

    val parkingSpots = mutableListOf(
        ParkingSpot(ParkingSpotType.COMPACT),
        ParkingSpot(ParkingSpotType.LARGE),
        ParkingSpot(ParkingSpotType.ELECTRIC)
    )

    val uMgmt = UserManagement()
    val vehicle = VehicleManagement()
    val floor = FloorManagement()

    val parkingLot = ParkingLot(
        uMgmt,
        floor,
        vehicle
    )

    val person1 = Admin()
    parkingLot.userManagement.createUser(person1)
    parkingLot.floor.addParkingFloor(person1, 1, parkingSpots)

    println(parkingLot.floor.getFloorsCount())

    if(parkingLot.vehicleManagement.assignVehicle()){
        val entry : Int = 10
        val exit : Int = 12
        parkingLot.userManagement.createUser(Ticket(4, entry, exit), Vehicle.VAN)
    }

    if(parkingLot.vehicleManagement.assignVehicle()){
        val entry : Int = 10
        val exit : Int = 12
        parkingLot.userManagement.createUser(Ticket(4, entry, exit), Vehicle.CAR)
    }

    if(parkingLot.vehicleManagement.assignVehicle()){
        val entry : Int = 10
        val exit : Int = 12
        parkingLot.userManagement.createUser(Ticket(4, entry, exit), Vehicle.TRUCK)
    }

    if(parkingLot.vehicleManagement.assignVehicle()){
        val entry : Int = 10
        val exit : Int = 12
        parkingLot.userManagement.createUser(Ticket(4, entry, exit), Vehicle.MOTORCYCLE)
    }


    val person3 = Attendant()
    parkingLot.userManagement.createUser(person3)

    println(parkingLot.userManagement.getUsers())
    println(parkingLot.userManagement.getAdmins())

    parkingLot.floor.modifyParkingSpots(person1, parkingSpots, 1)

    val entry : Int = 10
    val exit : Int = 12
    val person2 = Customer(Ticket(4, entry, exit), Vehicle.VAN)

    val attendant = Attendant()

    person2.payParkingFee(PaymentType.CREDIT)
    attendant.takeCashFromCustomer(person2.ticket) // Option 1
    parkingLot.floor.board.showFreeParkingSpots()

    parkingLot.userManagement.removeUser(person2)
    parkingLot.floor.board.showFreeParkingSpots()

//    person1.addOrModifyParkingSpotsPanels(person1.type)
//    person2.addOrModifyParkingSpotsPanels(person2.type)
//    person3.addOrModifyParkingSpotsPanels(person3.type)
//    person4.addOrModifyParkingSpotsPanels(person4.type)

//    val customer = Customer(Entry(), Vehicle.VAN)
//    System.assignVehicle()
//    println(customer.ticket.getEntryTicket())
//
//    val customer2 = Customer(Entry(), Vehicle.CAR)
//    System.assignVehicle()
//
//    val customer3 = Customer(Entry(), Vehicle.TRUCK)
//    System.assignVehicle()
//
//    val customer4 = Customer(Entry(), Vehicle.MOTORCYCLE)
//    System.assignVehicle()

    /*
    val customer2 = Customer(Entry())
    println(customer2.ticket.getEntryTicket())
    customer.payParkingFee("cash")
    customer2.payParkingFee("credit")
    */


}