package oops.day5.task1

object MemberManagement {

    private val CHECKOUT = 5
    private val members : MutableList<Member> = mutableListOf()
    val issuedBooks : HashMap<String, Int> = HashMap()
    private val reservedBooks : HashMap<String, String> = HashMap()
    private val books : HashMap<String, MutableList<String>> = HashMap()

    private val memberInfo : HashMap<String, HashMap<String, MutableList<String>>> = HashMap()

    fun sendNotificationToMember(memberName: String, notification: Notification) {
        for (m in members) {
            if (m.name == memberName){
                m.notification?.add(notification)
            }
        }
    }

    fun getMemberNotifications(member: String) {
        for (m in members) {
            if (m.name == member) {
                for (i in 0..<m.notification?.size!!) {
                    println(m.notification[i].message)
                }
            }
        }
    }

    fun addMember(type : Admin, member : Member) {
        members.add(member)
        println("${member.name} : member subscription started")
    }

    fun getMembers(type: Admin): MutableList<Member> {
        return members
    }

    fun isMember(type : Admin, member: Member): Boolean {
        return members.contains(member)
    }

    fun checkoutBook(book : Book, member: Member) {
        if (issuedBooks.getOrDefault(member.name, 0) < CHECKOUT) {
            issuedBooks[member.name] = issuedBooks.getOrDefault(member.name, 0) + 1
            val map : HashMap<String, MutableList<String>> = HashMap()

            Librarian.issueBook(book.title, member.name)
        } else{
            println("book check out limit exceeded")
        }
    }

    fun removeMember(type: Admin, member: Member) {
        members.remove(member)
        println("${member.name} : member subscription ended")
    }


    fun reserveBook(book: Book, member: Member) {
        reservedBooks[member.name] = book.title
    }

    fun renewBook(book: Book, member: Member) {

    }

    fun returnedBook(book: Book, member: Member) {

    }

    fun countOfIssuedBooks(member: Member) : Int{
        return issuedBooks.getOrDefault(member.name, 0)
    }
}