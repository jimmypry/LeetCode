package com.ucla.linkedin;

public class ShiftString {
    public String shiftString(int left, int right, String str){
        if (left == right)return str;
        else if(left > right){
            int shiftLeft = (left - right) % str.length();
            return str.substring(shiftLeft) + str.substring(0, shiftLeft);
        }
        else {
            int shiftRight = (right - left) % str.length();
            return str.substring(str.length() - shiftRight) + str.substring(0, str.length() - shiftRight);
        }
    }
}
