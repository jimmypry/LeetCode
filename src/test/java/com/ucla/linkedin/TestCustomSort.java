package com.ucla.linkedin;

import com.ucla.linkedin.CustomSort;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class TestCustomSort {
    @Before
    public void before() throws Exception {
        System.out.println("before");
    }

    @After
    public void after() throws Exception {
        System.out.println("after");
    }

    @Test
    public void main() {
        int[] testCases = new int[]{3, 2, 1, 4, 23, 2, 23};
        CustomSort test = new CustomSort();
        test.customSort(testCases);
        assert true;
    }
}
