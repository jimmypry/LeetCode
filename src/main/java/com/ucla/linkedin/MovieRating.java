package com.ucla.linkedin;

public class MovieRating {
    public int movieRating(int[] movies){
        int take = movies[0];
        int notTake = 0;
        for(int i = 1; i < movies.length; i++){
            int tmp = notTake;
            notTake = take;
            take = Math.max(tmp, take) + movies[i];
        }
        return Math.max(take, notTake);
    }
}




//int[] nums

//        给你一个string，求字典序最大的substring
