package training

import java.util.Arrays

fun main() {

    val array : Array<Int> = arrayOf(7, 2, 8, 1)
    val result = findTriplets(array, 10)
    for (arr in result){
        for (value in arr){
            print("$value ")
        }
        println()
    }
}

fun findTriplets(array: Array<Int>, target: Int) : Array<IntArray> {

    Arrays.sort(array)
    val result : Array<IntArray>
    val list : MutableList<IntArray> = mutableListOf()

    for (i in 0..<array.size - 2) {

        var left = i + 1
        var right = array.size - 1

        while (left < right) {
            val sum = array[i] + array[left] + array[right];
            if(sum == target) {
                list.add(intArrayOf(array[i], array[left], array[right]))
                left++;
                right--;
            } else if (sum < target) {
                left++;
            } else{
                right--;
            }
        }
    }

    if(list.size == 0) {
        return emptyArray()
    }

    result = list.toTypedArray()
    return result
}
