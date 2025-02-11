package com.example.leetcode;

import java.util.*;

public class GroupAnagrams {
    // input - one String array

    // goal -  grouping same arnagrams
    public List<List<String>> groupAnagrams(String[] strs) {
        // 1 . using map
        // 2 . put array of ASCII code  in the map as a key.
        // 3 . if there is same key in the map, I will put the values in a list.

        Map<String,List<String>> map = new HashMap<>();
        for(String str : strs){
            int[] keyArray = new int[26];
            for(char c : str.toCharArray()){
                int index = c - 97;
                keyArray[index]++;
            }
            StringBuilder sb = new StringBuilder();
            for(int i : keyArray){
                if(i >= 10){
                    sb.append(Integer.toHexString(i));
                }else {
                    sb.append(i);
                }

            }
            String key = sb.toString();

            List<String> list = null;
            if(map.containsKey(key)){
                list = map.get(key);
                list.add(str);
            }else{
                list = new ArrayList<>();
                list.add(str);
            }
            map.put(key,list);
        }

        List<List<String>> result = new ArrayList<>();
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            result.add(entry.getValue()); // value를 가져와 추가
        }
        return result;
    }


    public List<List<String>> groupAnagrams2(String[] strs) {

        Map<String,List<String>> map = new HashMap<>();

        for(String str : strs){
            char[] c = str.toCharArray();
            Arrays.sort(c);
            String sortedStr = new String(c);

            if(!map.containsKey(sortedStr)){
                map.put(sortedStr,new ArrayList<>());
            }
            map.get(sortedStr).add(str);
        }

        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        String[] strs = new String[]{"bddddddddddddddddd","bbbbbbbbbbc"};
        GroupAnagrams groupAnagrams = new GroupAnagrams();
        System.out.println(groupAnagrams.groupAnagrams(strs).toString());;
    }
}
