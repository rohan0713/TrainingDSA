package oops.day6.task1

class MessageManagement {

    private val chats: MutableList<Message> = mutableListOf()

    fun sendMessage(sender: User, contact: Contact, type: MessageType, input: String) {

        if (ContactManagement.isMyContact(sender, contact)) {
            val message = Message(sender, input, contact.name, type)
//            val messageList = chats.getOrDefault(contact.name, mutableListOf())
            chats.add(message)
//            chats.put(contact.name, messageList)
            contact.receive(message)
            println("Message sent")
        } else {
            println("Can not send message to this person. Not in your contacts")
        }
    }

    fun getChats(name: String) {
//        val messages = chats.getOrDefault(name, mutableListOf())
        if (chats.size != 0) {
            for (i in 0..<chats.size) {
                val message = chats[i]
                if (message.sender.name == name) {
                    println("Message Type : ${message.type}")
                    println(message.input)
                }
                println()
            }
        }
    }
}