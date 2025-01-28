package com.example.datastrructure.hashtable;

public class AlgorithmService {

    // 1. 중복이 없는가?
    // Check list
    // - ASCII 코드인가? 128 자 처리
    // - 확장형 ASCII 코드인가? 256 자 처리
    public boolean isDuplicated(String input) {
        boolean[] isDuplicated = new boolean[128]; // ASCII 코드는 256자
        for(char c : input.toCharArray()) {
            if(isDuplicated[c]){
                return true;
            }else {
                isDuplicated[c] = true;
            }
        }
        return false;
    }

     /* 2. 순열확인 1
     *      - 짧은 input 확인
     *
     * */
    public boolean isPermutation(String a, String b) {
        if(a.length() != b.length()) return false;
        int[] count = new int[128];
        for(char c : a.toCharArray()) {
            count[c]++;
        }
        for(char c : b.toCharArray()) {
            count[c]--;
            if(count[c] < 0) return false;
        }
        return true;
    }

    public String replaceSpaces1(String input) {
        String[] words = input.split(" ");
        StringBuilder sb = new StringBuilder();

        int length = words.length;
        for(int i = 0; i < length; i++) {
            if(i==length-1){
                sb.append(words[i]);
            } else {
                sb.append(words[i]).append("%20");
            }
        }
        return sb.toString();
    }

    public void replaceSpaces2(char[] str, int trueLength) {
        int spaceCounter = 0, index, i = 0;
        for(i = 0; i< trueLength; i++) {
           if(str[i] == ' '){
                spaceCounter++;
           }
        }
        index = trueLength - spaceCounter *2;
        if(trueLength < str.length) str[trueLength] = '\0';
        for(i = trueLength - 1; i >= 0; i--) {
            if(str[i] == ' '){
                str[index] = '0';
                str[index - 1] = '2';
                str[index - 2] = '%';
            } else {
                str[index - 1] = str[i];
                index--;
            }
        }
    }
}