package oops.day4.task2

class ATM(
    val notesManagement: NotesManagement
) {

    fun withdrawCash(type: User, amount: Int) {

        if (amount % 100 != 0){
            return
        }

        if (notesManagement.getTotalAmount() >= amount) {
            var temp = amount
            val list = notesManagement.getDenominationsPresent()
            var remainder: Int = 0
            var flag = false
            for (i in list.size - 1 downTo 0) {

                if (flag) {
                    break
                }
                remainder = temp.mod(list.get(i))
                var nw = notesManagement.notes.get(list.get(i))!!
                val quotient = temp.div(list.get(i))
                val count = Math.abs(quotient - nw)
                println(count)
                notesManagement.updateOnWithdrawal(list.get(i), count)
                if (remainder == 0) {
                    flag = true;
                    break
                }
                temp = remainder
            }
            println("Cash Withdraw - $amount ")
        } else {
            println("Insufficient balance")
        }
    }

    fun topUp(type: Admin, amount: Int) {
        var temp = amount
        val list = notesManagement.getDenominations()
        var remainder: Int = 0
        for (i in list.size - 1 downTo 0) {
            val quotient = temp.div(list.get(i).value)
            remainder = temp.mod(list.get(i).value)
            notesManagement.update(quotient, list.get(i))
            if (remainder == 0) {
                break
            }
            temp = remainder
        }
    }

}