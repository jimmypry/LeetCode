package com.ucla.linkedin;

import com.ucla.linkedin.AlternatingParityPermutations;
import org.junit.Test;

import java.util.ArrayList;


public class TestApp {
    @Test
    public void main() {
        int n = 4;
        AlternatingParityPermutations test = new AlternatingParityPermutations();
        ArrayList<ArrayList<Integer>> result = test.alternatingParityPermutations(n);
        System.out.println(result.size());
        for (ArrayList<Integer> res: result){
            for (int i = 0; i < res.size(); i++){
                System.out.print(res.get(i) + ", ");
            }
            System.out.println("");
        }
        String s = "112";
        int a = Integer.valueOf(s);
        System.out.print(a);
        assert true;
    }
}

