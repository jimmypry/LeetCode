package com.ucla.linkedin;

import com.ucla.linkedin.SubarraySum;
import org.junit.Test;
public class TestSubarraySum {

    @Test
    public void main() {
        int[] testNums = new int[]{1, 2, 3, 4, 5};
        SubarraySum test = new SubarraySum();
        int result = test.subarraySum(testNums);
        System.out.println(result);

        int result2 = SubarraySum.subarraySum2(testNums);
        System.out.println(result2);


    }
}

