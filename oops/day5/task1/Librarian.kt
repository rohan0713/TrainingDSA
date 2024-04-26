package oops.day5.task1

import java.time.LocalDate

object Librarian
 : LibrarianRole, Admin {

    fun issueBook(bookName : String, member : String) {
        val bookReceipt = BookReceipt(bookName, member, LocalDate.now().minusDays(10))
        BookManagement.addBookReceipt(bookReceipt)
    }

    fun collectBook(bookName: String, member: Member) {
        if(BookManagement.isDue(member)){
            println("fine will be collected")
        }else{
            MemberManagement.issuedBooks[member.name] = MemberManagement.issuedBooks.getOrDefault(member.name, 1) - 1
            println("book collected")
        }
    }
}