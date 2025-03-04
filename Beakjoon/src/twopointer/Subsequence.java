package twopointer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


// 1806 부분합
public class Subsequence {

    //

    public int subsequence(int n, int s, int[] arr){
        if(n <= 1) return 0;

        int left = 0;
        int right = 0;
        int sum = 0;
        int minLength = Integer.MAX_VALUE;
        while(right <= n){ // right <= n 일때 while을 끝내버리면 right가 n-1일때 여전히 sum 이 s 일 경우 대응이 안된다.
            if(sum >= s){
                if(minLength > right-left){
                    minLength = right-left;
                }
                sum -= arr[left];
                left++;
            }else{
                //
                if(n > right){
                    sum += arr[right];
                }

                right++;
            }
        }
        return (minLength) == Integer.MAX_VALUE ? 0 : minLength;
    }
    public static void main(String[] args) throws IOException {
        Subsequence subsequence = new Subsequence();
        int result = subsequence.subsequence(10,15,new int[]{5,1,3,5,10,7,4,9,2,8});
        System.out.println(result);

    }
}
