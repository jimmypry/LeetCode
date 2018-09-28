package com.ucla.linkedin;

import com.sun.org.apache.xpath.internal.operations.Bool;
import org.omg.PortableInterceptor.INACTIVE;

import java.util.ArrayList;

public class AlternatingParityPermutations {
    private int n;
    ArrayList<ArrayList<Integer>> alternatingParityPermutations(int n){
        this.n = n;
        ArrayList<ArrayList<Integer>> ret = new ArrayList<>();
        ArrayList<Integer> tmp = new ArrayList<>();
        int[] nums = new int[n + 1];
        int[] visited = new int[n + 1];
        for(int i = 1; i <= n; i++)nums[i] = i;
        helper(ret, tmp, 0, visited, nums, true, true);
        return ret;
    }
    void helper(ArrayList<ArrayList<Integer>> ret, ArrayList<Integer> tmp, int depth, int[] visited, int[] nums, Boolean isOdd, Boolean isStart){
        if (depth == n){
            ret.add(new ArrayList<>(tmp));
            return;
        }
        for (int i = 1; i < nums.length; i++){
            if (visited[i] == 1)continue;
            if(!isStart && isOdd && nums[i] % 2 == 0)continue;
            if(!isStart && !isOdd && nums[i] % 2 != 0)continue;
            tmp.add(nums[i]);
            visited[i] = 1;
            helper(ret, tmp, depth + 1, visited, nums, (i % 2 == 0),false);
            visited[i] = 0;
            tmp.remove(tmp.size() - 1);
        }

    }
}
