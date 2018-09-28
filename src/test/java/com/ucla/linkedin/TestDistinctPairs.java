package com.ucla.linkedin;

import com.ucla.linkedin.DistinctPairs;
import org.junit.Test;

public class TestDistinctPairs {
    @Test
    public void main() {
        int[] testCases = new int[]{1,2,3,6,7,8,9,1};
        DistinctPairs test = new DistinctPairs();
        int count = test.distinctPairs(testCases, 10);
        System.out.print(count);
        assert true;
    }
}
