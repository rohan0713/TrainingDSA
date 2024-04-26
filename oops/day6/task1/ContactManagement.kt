package oops.day6.task1

object ContactManagement {

    private val contacts : HashMap<String, MutableList<String>> = HashMap()

    fun addContacts(user: User, contact: Contact) {
        val listOfContacts = contacts.getOrDefault(user.name, mutableListOf())
        listOfContacts.add(contact.name)
        contacts.put(user.name, listOfContacts)
    }

    fun deleteContact(user: User, contact: Contact) {
        val cl = contacts[user.name]

        val present = cl?.remove(contact.name)
        if (present == true) {
            println("contact : ${contact.name} removed")
            contacts[user.name] = cl
        } else{
            println("Contact not found")
        }
    }

    fun viewContacts(user: User): List<String> {
        return contacts.getOrDefault(user.name, emptyList())
    }

    fun isMyContact(user: User, contact: Contact): Boolean {
        val list = contacts.getOrDefault(user.name, mutableListOf())
        for (c in list) {
            if (c == contact.name) {
                return true
            }
        }
        return false
    }
}