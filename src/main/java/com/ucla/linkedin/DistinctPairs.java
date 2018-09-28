package com.ucla.linkedin;

import java.util.HashMap;

public class DistinctPairs {
    public int distinctPairs(int[] nums, int target){
        int count = 0;
        HashMap<Integer, Integer> freMap = new HashMap<>();
        if (nums.length == 0)return 0;
        for(int i = 0; i < nums.length; i++){
            if(freMap.containsKey(nums[i])){
                if(freMap.get(nums[i]) == 1){
                    count++;
                    freMap.put(target - nums[i], 0);
                    freMap.put(nums[i], 0);
                }

            }
            else {
                freMap.put(target - nums[i], 1);
            }
        }
        return count;
    }
}
