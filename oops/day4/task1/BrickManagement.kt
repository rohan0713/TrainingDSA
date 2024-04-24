package oops.day4.task1

class BrickManagement(

) {
    private val map : HashMap<String, Int> = HashMap()
    private val dedications : HashMap<String, Int> = HashMap()

    fun addBrickDetails(name : String) {
        map.put(name, map.getOrDefault(name, 0) + 1);
    }

    fun findHottest(): String {
        var max = 0
        var hottest = ""
        for (user in map.keys) {
            if (map[user]!! > max) {
                max = map[user]!!
                hottest = user
            }
        }
        return hottest
    }

    fun addDedications(list : MutableList<String>) {
        for (i in 0..<list.size) {
            dedications.put(list.get(i), map.getOrDefault(list.get(i), 0) + 1)
        }
    }

    fun findLowestDedications(users : MutableList<User>) {
        var flag = false
        for (i in 0..<users.size) {
            if (!dedications.containsKey(users.get(i).name)){
                flag = true
                println("No dedications found : ${users.get(i).name}")
            }
        }
        if (!flag) {
            println("All users got dedications")
        }
    }
}