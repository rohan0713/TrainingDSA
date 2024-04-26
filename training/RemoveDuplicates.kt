package training

import java.util.Arrays
import kotlin.collections.HashSet

/*
i)Write a program to remove duplicate values from an array and returns an array of unique values. int[] removeDuplicates(int[]values)
Ex:
values = [2, 4, 6, 2, 8, 10, 4, 12, 14, 6]
result = [2, 4, 6, 8, 10, 12, 14]

*/

// reduce complexity
// reduce space complexity

fun main() {

    val array = intArrayOf(2, 4, 6, 2, 8, 10, 4, 12, 14, 6)

    val ans = removeDuplicates3(array)
    for (element in ans) {
        print("$element ")
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

fun removeDuplicates2(array: IntArray) : Int {

    Arrays.sort(array)
    var i = 1;
    for (j in 1..<array.size) {
        if(array[j] != array[j-1]){
            array[i] = array[j];
            i++
        }
    }
    return i;
}

// Space complexity reduced
fun removeDuplicates3(array: IntArray) : IntArray{

    val set = HashSet<Int>()
    for (i in array.indices) {
        set.add(array[i])
    }

    val result = IntArray(set.size)
    var j = 0;
    for (element in set) {
        result[j] = element
        j++
    }
    return result
}

