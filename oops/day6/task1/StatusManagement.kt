package oops.day6.task1

class StatusManagement {

    private val statuses : HashMap<String, MutableList<Status>> = HashMap()
    private val myStatuses : HashMap<String, MutableList<Status>> = HashMap()
//    private val myStatus : MutableList<Status> = mutableListOf()

    fun addStatus(contact: Contact, status: Status) {
        val statusList = statuses.getOrDefault(contact.name, mutableListOf())
        statusList.add(status)
        statuses.put(contact.name, statusList)
    }

    fun addStatus(user: User, status: Status){
//        myStatus.add(status)
        val statusList = myStatuses.getOrDefault(user.name, mutableListOf())
        statusList.add(status)
        myStatuses.put(user.name, statusList)
    }

    fun viewMyStatus(user: User) {
        println("My Statuses")
        val statusList = myStatuses.getOrDefault(user.name, mutableListOf())
        for (status in statusList) {
            println("Status type : ${status.type}")
            println("Status : ${status.content}")
        }
    }

    fun viewAllStatuses() {
        for (status in statuses.keys) {
            println(status)
            val list = statuses.getOrDefault(status, mutableListOf())
            for (st in list) {
                println("${st. type} : ${st.content}")
            }
            println()
        }
    }

    fun viewStatus(contact: Contact) {
        println("${contact.name} Status list")
        val statusList = statuses.getOrDefault(contact.name, mutableListOf())
        for (status in statusList) {
            println("Status type : ${status.type}")
            println("Status : ${status.content}")
        }
    }
}