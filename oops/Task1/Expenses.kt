package oops.Task1

class Expenses(
    private val person : String,
    private val expenses: Int) {

    fun exceedsSpendingLimit(): Boolean {

        if (person == "PM" && expenses > 10000000){
            return true
        }

        if (person == "Ministers" && expenses > 1000000){
            return true
        }

        if (person == "MP" && expenses > 100000){
            return true
        }

        return false
    }
}