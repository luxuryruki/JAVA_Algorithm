package com.example.leetcode;

import java.util.*;

public class TopKFrequentElements {
    public int[] topKFrequent(int[] nums, int k) {
        int[] result = new int[k];
        Map<Integer,Integer> elementCounts = new HashMap<>();
        for(int num : nums){
            if(elementCounts.get(num) == null){
                elementCounts.put(num,1);
            }else {
                elementCounts.put(num,elementCounts.get(num) + 1);
            }
        }

        LinkedHashMap<Integer,Integer> sortedMap = new LinkedHashMap<>();

        elementCounts.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .forEachOrdered(entry -> sortedMap.put(entry.getKey(), entry.getValue()));

        int count = 0;
        for(Map.Entry<Integer,Integer> entry: sortedMap.entrySet()){
            if(count >= k){
                break;
            }
            result[count] = entry.getKey();
            count++;
        }
        return result;

    }

    public int[] topKFrequent2(int[] nums, int k) {
        int[] result = new int[k];
        Map<Integer,Integer> elementCounts = new HashMap<>();
        for(int num : nums){
            elementCounts.put(num,elementCounts.getOrDefault(num,0) + 1);
        }

        PriorityQueue<Map.Entry<Integer,Integer>> maxHeap = new PriorityQueue<>((a,b) -> b.getValue() - a.getValue());

        maxHeap.addAll(elementCounts.entrySet());

        for(int i = 0;i<k;i++){
            result[i] = maxHeap.poll().getKey();
        }

        return result;

    }


    public int[] topKFrequent3(int[] nums, int k) {

        Map<Integer,Integer> map = new HashMap<>();

        for(int num : nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }

        PriorityQueue<Map.Entry<Integer,Integer>> minHeap = new PriorityQueue<>(Map.Entry.comparingByValue());

        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            minHeap.offer(entry);
            if(minHeap.size() > k){
                minHeap.poll();
            }
        }

        return minHeap.stream().sorted((a,b) ->b.getValue() - a.getValue()).mapToInt(Map.Entry::getKey).toArray();

    }

    public static void main(String[] args) {
        TopKFrequentElements f = new TopKFrequentElements();
        int[] nums = {1,1,1,2,2,5,5,5,5};
        int[] result = f.topKFrequent3(nums, 2);
        for(int i:result){
            System.out.println(i);
        }
    }
}
