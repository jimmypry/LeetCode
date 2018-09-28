package com.ucla.linkedin;

import java.util.HashMap;

class Solution {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        if(nums.length == 0)return 0;
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        freqMap.put(0, 1);
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
            if (freqMap.containsKey(sum - k))count += freqMap.get(sum - k);
            freqMap.put(sum, freqMap.getOrDefault(sum, 0) + 1);
        }
        return count;
    }

}