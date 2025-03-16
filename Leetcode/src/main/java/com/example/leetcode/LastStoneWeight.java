package com.example.leetcode;

import java.util.Comparator;
import java.util.PriorityQueue;

public class LastStoneWeight {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> maxQueue = new PriorityQueue<>(Comparator.reverseOrder());

        for(int n : stones){
            maxQueue.offer(n);
        }
        while(!maxQueue.isEmpty()){
            int x = maxQueue.poll();
            if(maxQueue.isEmpty()) return x;
            int y = maxQueue.poll();
            int diff = x -y;
            if(diff != 0){
                maxQueue.offer(diff);
            }
        }
        return 0;

    }
}
