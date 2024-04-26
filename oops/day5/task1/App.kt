package oops.day5.task1

import java.time.LocalDate

fun main() {

    val memberManagement = MemberManagement
    val bookManagement = BookManagement
    val libraryManagement = LibraryManagement

    val library = Library(memberManagement, libraryManagement, bookManagement)

    val person = Librarian

    val member1 = Member("harry", LocalDate.now())
    val member2 = Member("sam", LocalDate.now())
    val member3 = Member("sara", LocalDate.now())
    val member4 = Member("kim", LocalDate.now())

    library.memberManagement.addMember(person, member1)
    library.memberManagement.addMember(person, member2)
    library.memberManagement.addMember(person, member3)

    val book1 = Book(
        1,
        "atomic habits",
        "author",
        "drama",
        101
    )

    val book2 = Book(
        2,
        "good guy bad guy",
        "author",
        "drama",
        102
    )


    println()
    library.libraryManagement.addBookIntoDb(person, book1)
    library.libraryManagement.addBookIntoDb(person, book2)
    println()

//    library.memberManagement.removeMember(person, member2)

    val members = library.memberManagement.getMembers(person)
    for (m in members) {
        println(m.name)
    }

    library.libraryManagement.showAllBooksAvailable(person)
    println()

    println("Welcome to the library!!")

    library.libraryManagement.searchBookByTitle("good guy bad guy")
    library.libraryManagement.searchBookByAuthor("authors")
    library.libraryManagement.searchBookByCategory("dram")

    if (library.memberManagement.isMember(person, member4)) {
        library.memberManagement.checkoutBook(book1, member4)
    } else{
        println("Can't checkout, You are not member of library.")
    }

    if (library.memberManagement.isMember(person, member1)) {
        library.memberManagement.checkoutBook(book1, member1)
    } else{
        println("Can't checkout, You are not member of library.")
    }

    if (library.memberManagement.isMember(person, member1)) {
        library.memberManagement.checkoutBook(book2, member1)
    } else{
        println("Can't checkout, You are not member of library.")
    }


    if (library.memberManagement.isMember(person, member2)) {
        library.memberManagement.checkoutBook(book2, member2)
    } else{
        println("Can't checkout, You are not member of library.")
    }

    println(library.bookManagement.getTotalBooksReceipt())
    library.bookManagement.showBookReceipts(person)

    println(library.libraryManagement)

    library.bookManagement.isDue()
    library.memberManagement.getMemberNotifications(member2.name)
}