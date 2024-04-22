package test;

import java.util.HashMap;

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

public class combination {

    public static void main(String[] args) {

        HashMap<Integer, char[]> map = new HashMap<>();
        map.put(1, new char[]{'Z', 'Y', 'A'});
        map.put(2, new char[]{'B', 'O'});
        map.put(12, new char[]{'L'});
        map.put(3, new char[]{'U', 'P'});

        findCombination(map);
    }

    private static void findCombination(HashMap<Integer,char[]> map) {


    }
}
