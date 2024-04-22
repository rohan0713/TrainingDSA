package training

/*

iv) Write a program to print all the possible combinations according to the input values.
Example :
Given Values
'1' : ['Z', 'Y', 'A'],
'2' : ['B', 'O'],
'12' : ['L']
'3' : ['U', 'P']
Input: 123
Output : [ZBU, ZBP, ZOU, ZOP, YBU, YBP, YOU, YOP, ABU, ABP, AOU, AOP, LU, LP]
 */

fun main() {

    val map : HashMap<String, CharArray> = HashMap()
    map["1"] = charArrayOf('Z', 'Y', 'A')
    map["2"] = charArrayOf('B', 'O')
    map["12"] = charArrayOf('L')
    map["3"] = charArrayOf('U', 'P')

    val target = "121"

    val result : MutableList<String> = mutableListOf()
    printCombinations(map, target, result, StringBuilder(), 0)
    println(result)

}

fun printCombinations(
    map: HashMap<String, CharArray>,
    target: String,
    result: MutableList<String>,
    stringBuilder: StringBuilder,
    index: Int
) {

    if(index == target.length){
        result.add(stringBuilder.toString())
        return;
    }

    val num = target.toCharArray()[index]
    if(map.containsKey(num.toString())){
        val characters = map.get(num.toString())
        characters?.let {
            for (c in characters){
                stringBuilder.append(c)
                printCombinations(map, target, result, stringBuilder, index+1)
                stringBuilder.deleteCharAt(stringBuilder.length - 1)
            }
        }
    }
}
