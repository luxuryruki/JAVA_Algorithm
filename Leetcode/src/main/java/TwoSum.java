import java.util.HashMap;

public class TwoSum {
    //Brute-force(완전 탐색)
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

    //HashMap
    public int[] twoSum2(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0 ; i < nums.length ; i++){
            if(map.containsKey(target - nums[i])){
                return new int[]{i,map.get(target - nums[i])};
            }
            map.put(nums[i], i);
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
