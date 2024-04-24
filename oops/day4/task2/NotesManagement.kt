package oops.day4.task2

class NotesManagement : Observer {

    val notes: HashMap<Int, Int> = HashMap()
    private val list: MutableList<NotesType> = mutableListOf()

    init {
        list.add(NotesType.HUNDRED)
        list.add(NotesType.TWO)
        list.add(NotesType.FIVE)
        list.add(NotesType.THOUSAND)
    }

    fun update(data: HashMap<Int, Int>) {
        for (note in data.keys) {
            val count = data.get(note);
            notes[note] = notes.getOrDefault(note, 0) - count!!
        }
    }

    fun getTotalAmount(): Int {
        var amount = 0;
        for (note in notes.keys) {
            amount += notes[note]?.times(note)!!
        }
        return amount
    }

    override fun update() {

    }

    fun getDenominationsPresent(): List<Int> {
        val list : MutableList<Int> = mutableListOf()
        for (note in notes.keys) {
            if (notes.getOrDefault(note, 0) > 0) {
                list.add(note)
            }
        }
        return list.sorted()
    }

    fun update(count: Int, type: NotesType) {
        notes[type.value] = notes.getOrDefault(type.value, 0) + count
    }

    fun updateOnWithdrawal(type: Int, count : Int) {
        notes[type] = count
    }

    fun getDenominations(): MutableList<NotesType> {
        return list
    }

}