package com.ucla.linkedin;

import com.ucla.linkedin.SimpleQueries;
import org.junit.Test;

public class TestSq {
    @Test
    public void main() {
        int[] x= new int[]{1,2,2,4,6};
        int[] y= new int[]{3,5,4};
        SimpleQueries test = new SimpleQueries();
        int[] result = test.simpleQueries(x, y);
        for (int r: result){
            System.out.print(r + ", ");
        }

//        String leo = "LEO";
//        String jimmy = "JIMMY";
//        System.out.print(leo.compareTo(jimmy));
    }
}
