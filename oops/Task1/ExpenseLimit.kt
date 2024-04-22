package oops.Task1

class ExpenseLimit {

    private val map : HashMap<String, Int> = HashMap()

    fun makeExpenses(person: String,
                            amount : Int) {

        val previous = map.getOrDefault(person, 0)
        map[person] = previous + amount
    }

    fun getExpenses(person: String) : Int {
       return map.getOrDefault(person, 0)
    }
}