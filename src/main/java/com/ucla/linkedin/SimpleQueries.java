package com.ucla.linkedin;

import java.util.Arrays;

public class SimpleQueries {

    public int[] simpleQueries(int[] nums1, int[] nums2){
        int[] nums = new int[nums2.length];
        Arrays.sort(nums1);
        for (int i = 0; i < nums2.length; i++){
            int count = bs(nums2[i], nums1);
            nums[i] = count;
        }
        return nums;
    }

    private static int bs(int target, int[] nums){
        int left = 0, right = nums.length - 1;
        while(left < right){
            int middle = left + (right - left) / 2;
            if(target < nums[middle])right = middle;
            else if (target >= nums[middle]) left = middle + 1;
        }
        return left;
    }
}
