package oops.day6.task1

class Contact (
    val name : String,
    val number : String,
){

    private val data : MutableList<Message> = mutableListOf()

    fun receive(message: Message){
        data.add(message)
    }

    fun getChats(): MutableList<Message> {
        return data
    }
}