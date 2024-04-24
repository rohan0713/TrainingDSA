package oops.day3.task1

class Exit {

    private val ticketManagement = TicketManagement()

    fun payParkingFee(ticket: Ticket, type: PaymentType) {
        scanTicket(ticket, type)
    }

    private fun scanTicket(ticket: Ticket, type: PaymentType) {
        println("Payment Processed")
        val time = ticket.exit - ticket.entry
        val amount = ticketManagement.calculateFee(time)
        if (type == PaymentType.CASH) {
            ticketManagement.payThroughCash(amount)
        } else{
            ticketManagement.payUsingCreditCard(amount)
        }
    }
}