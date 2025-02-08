package com.example.leetcode;

import java.util.HashSet;
import java.util.Set;

//217. contains-duplicate
public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {

        // List<Integer> checkDuplication = new ArrayList<>(); // 리스트는 내부적으로 배열(Array)을 사용하기 때문에 특정 원소가 있는지 확인하기 위해선 원소를 순차적으로 탐색해야한다. // O(n)
        Set<Integer> numberSet = new HashSet<>(); // 해시셋은 내부적으로 해시테이블(Hash Table)을 사용하기 때문에 시간 복잡도는 O(1)이다.
        for(int num : nums){
            if(numberSet.contains(num) ){
                return true;
            }else{
                numberSet.add(num);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ContainsDuplicate containsDuplicate = new ContainsDuplicate();
        System.out.println(containsDuplicate.containsDuplicate(new int[]{1,2,3,4,5,6,7,8,9}));;
        System.out.println(containsDuplicate.containsDuplicate(new int[]{1,2,3,4,5,6,7,8,9}));;
        System.out.println(containsDuplicate.containsDuplicate(new int[]{1,2,3,1}));
        System.out.println(containsDuplicate.containsDuplicate(new int[]{1,1,1,3,3,4,3,2,4,2}));

    }
}


