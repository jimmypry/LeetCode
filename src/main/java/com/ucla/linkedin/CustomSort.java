package com.ucla.linkedin;

import java.util.*;

public class CustomSort{
    public void customSort(int[] nums){
        HashMap<Integer, Integer> numFreqMap = new HashMap<Integer, Integer>();
        HashMap<Integer, ArrayList<Integer>> freqNumMap = new HashMap<Integer, ArrayList<Integer>>();
        for (int num: nums){
            numFreqMap.put(num, numFreqMap.getOrDefault(num, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry: numFreqMap.entrySet()){
            if (!freqNumMap.containsKey(entry.getValue())){
                freqNumMap.put(entry.getValue(), new ArrayList<>());

            }
            freqNumMap.get(entry.getValue()).add(entry.getKey());
        }
        List<Integer> sortedKeys=new ArrayList<Integer>(freqNumMap.keySet());
        Collections.sort(sortedKeys);

        for (int i  = 0; i < sortedKeys.size(); i++){
            int key = sortedKeys.get(i);
            ArrayList<Integer> values = freqNumMap.get(key);
            Collections.sort(values);
            for (int j = 0; j < values.size(); j++){
                int temp = key;
                while (temp > 0){
                    System.out.println(values.get(j));
                    temp--;
                }
            }
        }
    }
}