package oops.Task1

fun main() {

    val person1 = Person("PM", "Center")
    val person2 = Person("Ministers", "State")
    val person3 = Person("MP", "West Delhi")

    person1.assignDriver("harry")
    println(person1.getDriver())
    println(person1.constitute.getConstituency())

    val expense = ExpenseLimit()
    expense.makeExpenses(person1.name, 10000000)

    val limit = Expenses(person1.name, expense.getExpenses(person1.name))
    println(limit.exceedsSpendingLimit())

    val commissioner = Commissioner()
    val permission = Permission("PM")
    permission.givePermission()
    val access = permission.hasPermission()
    println(access)

    println(commissioner.canArrest(person1.name, expense.getExpenses(person1.name), access))
    println(commissioner.canArrest(person2.name, expense.getExpenses(person2.name), access))
    println(commissioner.canArrest(person3.name, expense.getExpenses(person3.name), access))

}