package oops.day3.task1

class TicketManagement {

    fun payUsingCreditCard(amount: Any) {
        println("credit card accepted : $amount")
    }

    fun payThroughCash(amount: Any) {
        println("cash accepted : $amount")
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