package com.example.leetcode.ransomNote;

import java.util.HashMap;
import java.util.Map;

//383. Ransom Note
public class RansomNote {


    //Approach 1
    public boolean canConstruct1(String ransomNote, String magazine) {

        for(int i = 0 ; i < ransomNote.length() ; i++){
            char c = ransomNote.charAt(i);

            int index = magazine.indexOf(c);

//            same method with int index = magazine.indexOf(c);
//            int index = -1;
//            for(int j = 0 ; j < magazine.length() ; j++){
//                char m = magazine.charAt(j);
//                if(m == c){
//                    index = j;
//                }
//            }
            if(index > 0){
                return false;
            }
            magazine = magazine.substring(0,index) + magazine.substring(index+1);
        }
        return true;
    }
    // Time Complexity O(cm)
    // Space Complexity O(m)

    //Approach 2
    public boolean canConstruct2(String ransomNote, String magazine) {
        Map<Character,Integer> magazineMap = new HashMap<>();
        for(int i = 0 ; i < magazine.length() ; i++){
            char c = magazine.charAt(i);
            int count = magazineMap.getOrDefault(c,0);
            magazineMap.put(c, count + 1);
        }

        //bounded by magazine
        for(int i = 0 ; i < ransomNote.length() ; i++){
            char c = ransomNote.charAt(i);
            int count = magazineMap.getOrDefault(c,0);
            magazineMap.put(c, count - 1);
            if(magazineMap.get(c) < 0){
                return false;
            }
        }

        return true;
    }
    // Time Complexity O(c)
    // Space Complexity O(1)
}
