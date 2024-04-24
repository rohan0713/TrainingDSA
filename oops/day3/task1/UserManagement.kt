package oops.day3.task1

class UserManagement {

    private val admins : MutableList<Person> = mutableListOf()
    private val customers : MutableList<Person> = mutableListOf()

    fun createUser(user : Person) {
        admins.add(user)
    }

    fun createUser(ticket: Ticket , vehicle: Vehicle) {
        customers.add(Customer(ticket, vehicle))
    }

    fun removeUser(user: Customer) {
        println("customer want to exit")
        user.payParkingFee(PaymentType.CASH)
        customers.remove(user)
    }

    fun removeAdmin(user: Admin) {
        admins.remove(user)
    }

    fun getUsers() : Int{
        return customers.size
    }

    fun getAdmins(): Int {
        return admins.size
    }
}