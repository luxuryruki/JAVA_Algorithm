package com.example.leetcode;

public class StringToIntegerAtoi {
    public int myAtoi(String s) {
        long result = 0;
        boolean negative = false;

        int index = 0;
        for(char c : s.toCharArray()){
            if( Character.isWhitespace(c)){
                index++;
                continue;
            }else{
                if(c == '-'){
                    negative = true;
                    s = s.substring(index+1);
                }else if(c == '+'){
                    s = s.substring(index +1);
                }else{
                    s = s.substring(index);
                }
                break;
            }

        }
        for(char c : s.toCharArray()){
            if(Character.isDigit(c)){
                int digit = Character.getNumericValue(c);
                result = result * 10 + digit;

                if (!negative && result > Integer.MAX_VALUE) return Integer.MAX_VALUE;
                if (negative && -result < Integer.MIN_VALUE) return Integer.MIN_VALUE;
            }else{
                break;
            }
        }

        if(negative){
            result *= -1;
        }

        return (int) Math.max(Integer.MIN_VALUE, Math.min(Integer.MAX_VALUE, result));
    }

    public static void main(String[] args) {
        StringToIntegerAtoi stringToIntegerAtoi = new StringToIntegerAtoi();
        System.out.println(stringToIntegerAtoi.myAtoi("9223372036854775808"));
    }
}
