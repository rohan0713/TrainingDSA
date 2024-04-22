package training

import java.util.Arrays
import kotlin.collections.HashSet

/*
i)Write a program to remove duplicate values from an array and returns an array of unique values. int[] removeDuplicates(int[]values)
Ex:
values = [2, 4, 6, 2, 8, 10, 4, 12, 14, 6]
result = [2, 4, 6, 8, 10, 12, 14]

*/

fun main() {

    val array = intArrayOf(2, 4, 6, 2, 8, 10, 4, 12, 14, 6)

    val ans = removeDuplicates(array)
    for (k in ans) {
        print("$k " )
    }
}

fun removeDuplicates(array: IntArray): Array<Int> {
    val map : HashMap<Int, Boolean> = HashMap()
    val list = ArrayList<Int>()

    // time complexity O(n)
    for(i in array) {
        if (!map.containsKey(i)){
            map[i] = false
        }
    }

    for (j in array) {
        val visited = map.get(j)
        if(visited == false){
            list.add(j)
            map[j] = true
        }
    }

    val result : Array<Int> = list.toTypedArray()
    return result
}

