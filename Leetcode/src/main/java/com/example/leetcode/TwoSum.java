package com.example.leetcode;

import java.util.HashMap;
/* 알고리즘 접근법
  1. 문제를 명확히 이해한다.
  2. 테스트 케이스를 검토하고 출력 결과를 분석한다.
  3. 제약조건을 확인한다.
  4. 가장 직관적인 첫 번째 접근법을 떠올린다.
  5. 알고리즘 단계를 정리한다.
  6. 알고리즘을 코드로 구현한다.
  7. 중복되는 코드나 비효율적인 부분을 줄이고, 더 효율적인 방법이 있는지 검토한다.
 * */

/* 문제 정의
 Given an array of integers nums and an integer target, -> 정수로 된 배열과 정수 타겟이 주어진다.
 return indices of the two numbers such that they add up to target. -> 두 숫자의 합이 타겟이 되도록하는 두 숫자의 인덱스를 구하라
 You may assume that each input would have exactly one solution, -> 각 input에는 하나의 정답만 존재한다고 가정할 수 있다.
 and you may not use the same element twice. -> 같은 요소를 두번 사용할 수 없다.
 You can return the answer in any order. -> 정답의 순서는 상관 없다.
* */

/* 테스트 케이스를 검토하고 출력 결과를 분석한다.
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

Input: nums = [3,2,4], target = 6
Output: [1,2]
Explanation : Because nums[1] + nums[2] == 6, we return [1, 2].


Input: nums = [3,3], target = 6
Output: [0,1]
Explanation : Because nums[0] + nums[1] == 6, we return [0, 1].
* */

/* 제약조건
 * 2 <= nums.length <= 10^4 -> 배열의 크기는 2 이상 10^4 이하
 * -10^9 <= nums[i] <= 10^9 -> 배열의 각 요소의 크기는 -10^9 이상 10^9이하
 * -10^9 <= target <= 10^9 -> 타겟의 크기는 -10^9 이상 10^9이하
 * Only one valid answer exists. -> 하나의 정답만 존재.
* */
public class TwoSum {
    /* 가장 직관적인 첫 번째 접근법을 떠올린다. 그리고 알고리즘 정리
     Brute-force(완전 탐색)
     1. 이중 for문(Nested for loop)사용
     2. 모든 요소를 하나씩 비교하면서 찾기.
    * */

    // 코드구현
    public int[] twoSum(int[] nums, int target) {

        int size = nums.length;
        for(int i = 0 ; i < size-1 ; i++){ // 이중 for문으로 시간복잡도는 O(N²) 이다.
            int first = nums[i];
            for(int j = i + 1 ; j < size; j++){
                int second = nums[j];
                int total = first + second;
                if(total == target) {
                    return new int[]{i,j}; // 입력 배열 int[] nums는 추가적인 공간을 사용하지 않고, int[] result만 추가되었다. 그리고 이 크기는 상수값이다. 공간 복잡도는 O(1)
                }
            }
        }
        return null;
    }

    // 중복되는 코드나 비효율적인 부분을 줄이고, 더 효율적인 방법이 있는지 검토한다.
    //HashMap
    public int[] twoSum2(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0 ; i < nums.length ; i++){ // 맵을 이용해 for문을 한번만 돌면 되기때문에 시간복잡도는 O(N)이다.
            if(map.containsKey(target - nums[i])){ // HashMap의 조회 연산은 평균적으로 O(1)
                return new int[]{i,map.get(target - nums[i])};
            }
            map.put(nums[i], i); // 최악의 경우 모든 요소가 HashMap에 저장될 수 있으므로 공간 복잡도는 O(N)
        }
        return null;
    }

    public static void main(String[] args) {
        TwoSum twoSum = new TwoSum();
        int[] result = twoSum.twoSum(new int[]{2, 7, 11, 15}, 9);
        System.out.println(result[0] + ", " +result[1]);

        TwoSum twoSum2 = new TwoSum();
        int[] result2 = twoSum2.twoSum2(new int[]{2, 7, 11, 15}, 9);
        System.out.println(result2[0] + ", " +result2[1]);




    }
}


