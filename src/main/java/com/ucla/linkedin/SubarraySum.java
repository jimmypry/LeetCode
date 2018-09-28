package com.ucla.linkedin;

public class SubarraySum {
    public int subarraySum(int[] nums){
        int result = 0;
        if (nums.length == 0)return result;
        if(nums.length == 1)return nums[0];
        int[] count = new int[nums.length];
        count[0] = nums.length;
        count[nums.length - 1] = nums.length;
        int left = 1, right = nums.length - 2;
        while (left <= right){
            int tmp = right - left + 1;
            count[left] = tmp + count[left - 1];
            count[right] = tmp + count[right + 1];
            left++;
            right--;

        }
        for(int i = 0; i < nums.length; i++){
            System.out.println(count[i]);
        }
        for(int i = 0; i < nums.length; i++){
            result += count[i] * nums[i];
        }
        return result;
    }


    public static int subarraySum2(int[] i1) {
        int left = 0, right = 0, temp = i1[left], sum = 0, len = i1.length;
        while(left < len) {
            sum += temp;
            if(right < len-1) {
                right++;
                temp += i1[right];
            } else {
                left++;
                right = left;
                if(left < len) temp = i1[left];
            }
        }
        return sum;
    }


}
