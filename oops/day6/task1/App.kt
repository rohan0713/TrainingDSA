package oops.day6.task1

fun main() {

    val messageManagement = MessageManagement()
    val userManagement = UserManagement()
    val contactManagement = ContactManagement
    val statusManagement = StatusManagement()

    val whatsApp = WhatsApp(messageManagement, userManagement, contactManagement, statusManagement)

    val manager = Manager()

    val user1 = User(0, "Harry")
    val user2 = User(1, "David")
    val user3 = User(2, "Jimmy")
    val user4 = User(3, "Sara")
    val user5 = User(4, "Tracy")

    whatsApp.userManagement.addUser(user1)
    whatsApp.userManagement.addUser(user2)
    whatsApp.userManagement.addUser(user3)
    whatsApp.userManagement.addUser(user4)
    whatsApp.userManagement.addUser(user5)

    whatsApp.userManagement.viewAllUsers(manager)


    val contact1 = Contact("Jack", "123456")
    val contact2 = Contact("Sam", "123456")
    val contact3 = Contact("Peter", "123456")

    whatsApp.contactManagement.addContacts(user2, contact1)
    whatsApp.contactManagement.addContacts(user1, contact2)
    whatsApp.contactManagement.addContacts(user1, contact3)

    val contacts = whatsApp.contactManagement.viewContacts(user1)
    println(contacts)

    val contacts2 = whatsApp.contactManagement.viewContacts(user2)
    println(contacts2)

    whatsApp.contactManagement.deleteContact(user1, contact1)

    whatsApp.messageManagement.sendMessage(user2, contact1, MessageType.TEXT, "hey Jack")
    whatsApp.messageManagement.sendMessage(user2, contact2, MessageType.AUDIO, "Good morning")
    whatsApp.messageManagement.sendMessage(user1, contact3, MessageType.VIDEO, "check mail")
    whatsApp.messageManagement.sendMessage(user1, contact1, MessageType.TEXT, "You there?")

//    println(contact1.getChats().size)

    whatsApp.messageManagement.getChats(user1.name)
    whatsApp.messageManagement.getChats(user2.name)

    val status1 = Status("day well spent", StatusType.TEXT)
    whatsApp.statusManagement.addStatus(contact1, status1)

    val status2 = Status("chill morning", StatusType.IMAGE)
    whatsApp.statusManagement.addStatus(contact2, status2)

    val status3 = Status("Woke up like this", StatusType.IMAGE)
    whatsApp.statusManagement.addStatus(contact1, status3)

    val status4 = Status("feeling hungry", StatusType.TEXT)
    whatsApp.statusManagement.addStatus(contact3, status4)

//    whatsApp.statusManagement.viewStatus(contact2)

    whatsApp.statusManagement.addStatus(contact1, Status("tired", StatusType.IMAGE))
    whatsApp.statusManagement.viewMyStatus(user1)
    whatsApp.statusManagement.viewAllStatuses()

}