package oops.day3.task1

class Customer(
    val ticket : Ticket,
    val vehicle: Vehicle
) : Person() {

    fun payParkingFee(type : PaymentType) {
        val exit = Exit()
        exit.payParkingFee(ticket, type)
    }
}