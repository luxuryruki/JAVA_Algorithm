package com.example.leetcode;

import java.util.PriorityQueue;

public class KthLargest {
    private int k;
    private PriorityQueue<Integer> maxHeap;

    public KthLargest(int k, int[] nums) {
        this.k = k;
        this.maxHeap = new PriorityQueue<>();

        for(int i : nums){
            maxHeap.offer(i);
            if(maxHeap.size() > k){
                maxHeap.poll();
            }
        }
    }

    public Integer add(int val) {
        maxHeap.offer(val);
        if(maxHeap.size() > k){
            maxHeap.poll();
        }
        return maxHeap.peek() != null? maxHeap.peek() : null;
    }
}
