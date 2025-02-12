package com.example.leetcode.utiltest;

import java.util.*;
import java.util.stream.Collectors;

public class ArrayAndCollectionTest {
    public static void main(String[] args) {
        // 1️⃣ int 배열 (임의의 숫자)
        int[] intArray = {42, 17, 89, 3, 56, 73, 28, 91, 64, 50};

        // 2️⃣ Integer 배열 (임의의 숫자)
        Integer[] integerArray = {-23, 45, 12, -8, 67, -34, 90, -56, 33, 71};

        // 3️⃣ char 배열 (임의의 알파벳 문자)
        char[] charArray = {'A', 'X', 'M', 'J', 'E', 'C', 'Z', 'B', 'H', 'L'};

        // 4️⃣ String 배열 (임의의 단어)
        String[] strArray = {"banana",  "fig", "grape", "cherry", "date","apple","mango", "orange", "kiwi", "lemon"};
        List<Integer> intToIntegerList = Arrays.stream(intArray).boxed().toList();
        List<Integer> intToIntegerList2 = Arrays.stream(intArray).boxed().collect(Collectors.toList());
//        List<Character> charToStringList = Arrays.stream(charArray).boxed().collect(Collectors.toList());
        List<Integer> integerList = new ArrayList<>(Arrays.asList(integerArray));
        List<String> stringList = new ArrayList<>(Arrays.asList(strArray));
        System.out.println(intToIntegerList.getClass()+ " : " + intToIntegerList);
        System.out.println(intToIntegerList2.getClass()+ " : " + intToIntegerList2);
        System.out.println("===== 기존 데이터 =======");
        System.out.println("intArray: " + Arrays.toString(intArray));
        System.out.println("integerArray: " + Arrays.toString(integerArray));
        System.out.println("charArray: " + Arrays.toString(charArray));
        System.out.println("strArray: " + Arrays.toString(strArray));

        Arrays.sort(intArray);
        Arrays.sort(integerArray);
        Arrays.sort(charArray);
        Arrays.sort(strArray);

        System.out.println("===== 오름차순 정렬 =======");
        System.out.println("intArray: " + Arrays.toString(intArray));
        System.out.println("integerArray: " + Arrays.toString(integerArray));
        System.out.println("charArray: " + Arrays.toString(charArray));
        System.out.println("strArray: " + Arrays.toString(strArray));


        for(int i = 0 ; i < intArray.length/2 ; i++){
            int temp = intArray[i];
            intArray[i] = intArray[(intArray.length -1)-i];
            intArray[(intArray.length -1)-i] = temp;
        }
        Arrays.sort(integerArray, Comparator.reverseOrder());
        for(int i = 0 ; i < charArray.length/2 ; i++){
            char temp = charArray[i];
            charArray[i] = charArray[(charArray.length -1)-i];
            charArray[(charArray.length -1)-i] = temp;
        }
        Arrays.sort(strArray, Collections.reverseOrder());

        System.out.println("===== 오름차순 정렬 =======");
        System.out.println("intArray: " + Arrays.toString(intArray));
        System.out.println("integerArray: " + Arrays.toString(integerArray));
        System.out.println("charArray: " + Arrays.toString(charArray));
        System.out.println("strArray: " + Arrays.toString(strArray));


    }
}
