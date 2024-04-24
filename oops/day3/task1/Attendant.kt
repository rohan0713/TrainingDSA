package oops.day3.task1

class Attendant() : Person() {

    private val ticketManagement = TicketManagement()

    fun takeCashFromCustomer(ticket: Ticket) {
        println("payment processing")
        val time = ticket.exit - ticket.entry
        val amount = ticketManagement.calculateFee(time)
        ticketManagement.payThroughCash(amount)
    }
}