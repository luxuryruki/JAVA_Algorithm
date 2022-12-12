package Sorting;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class hIndex {
    public static void main(String[] args) {
        int[] citations = new int[]{10,10,16,11,15};
        int answer = 0;

        Integer[] arr = Arrays.stream(citations).boxed().toArray(Integer[]::new);
        Arrays.sort(arr, Collections.reverseOrder());

        int idx = 1;

        while(arr[idx-1] >= idx ){
            answer = idx;
            idx++;
        }



        System.out.println(answer);
    }
}
