package com.ucla.linkedin;

import com.ucla.linkedin.ShiftString;
import org.junit.Test;


public class TestShiftString {
    @Test
    public void main(){
        String str = "abcdefghi";
        ShiftString test = new ShiftString();
        String output = test.shiftString(6, 5, str);
        System.out.print(output);
        assert true;
    }
}
