package oops.day4.task2


fun main() {

    val num = NotesType.TWO
    println(num.value)

    val notesManagement = NotesManagement()
    val atm = ATM(notesManagement)

    val admin = AdminRole()
    val user = User()

    atm.topUp(admin, 1200)
    println(atm.notesManagement.notes)
    println(atm.notesManagement.getTotalAmount())

    atm.withdrawCash(user, 7681)
    println(atm.notesManagement.notes)


}