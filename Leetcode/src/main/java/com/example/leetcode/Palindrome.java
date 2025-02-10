package com.example.leetcode;

public class Palindrome {
    public boolean isPalindrome(int x) {
        String str = Integer.toString(x);
        int[] array = new int[str.length()];

        int i = 0;
         for(char c : str.toCharArray()){
             array[i] = c;
             i++;
         }

        for(int b = array.length-1, j = 0 ; j < array.length ; b--, j++){
            if(array[b] != array[j]){
                return false;
            }
        }

        return true;
    }
    public boolean isPalindrome2(int x) {

        int tempNum = x;
        int reverse = 0;
        while(tempNum != 0){
            int digit = tempNum % 10;
            reverse = reverse * 10 + digit;
            tempNum /= 10;
        }

        return (reverse == x);
    }

    public static void main(String[] args) {

    }
}
