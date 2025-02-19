package com.example.leetcode;

public class MoveZeroes {
    //two pointers
    public int[] moveZeroes(int[] nums) {
        //
        int size = nums.length;
        if (size <= 1) return nums;
        int left = 0;

        for(int r = 0 ; r < size ; r++){
            if(nums[r] == 0) {
                continue;
            }else{
                int temp = nums[r];
                nums[r] = 0;
                nums[left] = temp;
                left++;
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        MoveZeroes moveZeroes = new MoveZeroes();
        int[] nums = new int[]{1,2,3,0,0,0,23,0,1};
        int[] result = moveZeroes.moveZeroes(nums);
    }
}
