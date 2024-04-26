package oops.day5.task1

import java.time.LocalDate

object BookManagement {

    val maxDaysLimit = 5;

    private val books : MutableList<BookReceipt> = mutableListOf()

    fun addBookReceipt(book: BookReceipt) {
        println("Book receipt : [ ${book.bookName} , ${book.memberName} , ${book.dueDate} ]")
        books.add(book)
    }

    fun getTotalBooksReceipt(): Int {
        return books.size
    }

    fun removeBookFromDb(type: Admin, book: BookReceipt) {
        println("Book Removed")
    }

    fun showBookReceipts(type: Admin) {
        for (book in books) {
            println("${book.bookName} ${book.memberName}")
        }
    }

    fun isDue() {
        for (data in books) {
            if (data.dueDate <= LocalDate.now()){
                println(data.memberName)
                val notification = Notification("${data.bookName} due")
                MemberManagement.sendNotificationToMember(data.memberName, notification)
            }
        }
    }

    fun isDue(member: Member): Boolean {
        for (data in books) {
            if (data.memberName == member.name && data.dueDate <= LocalDate.now()){
                return true
            }
        }
        return false
    }
}