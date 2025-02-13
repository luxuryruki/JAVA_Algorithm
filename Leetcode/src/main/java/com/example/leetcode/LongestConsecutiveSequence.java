package com.example.leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {
    public int longestConsecutive(int[] nums) {
        // sort the array
        // for roof
        // check differces between each element.
        // if the differences is 1 -> it will count.
        Set<Integer> set = new HashSet<>();
        for(int i : nums){
            set.add(i);
        }
        int[] array = set.stream().mapToInt(Integer::intValue).toArray();
        if(array.length == 1){ return 1;}
        Arrays.sort(array); // O(n log n)
        int max = 0;
        int count = 1;
        for(int i = 0; i < array.length-1 ; i++){
            int dif = array[i+1] - array[i];
            if(dif == 1){
                count += 1;
            }else{
                count = 1;
            }
            max = Math.max(max, count);
        }
        return max;
    }
}
