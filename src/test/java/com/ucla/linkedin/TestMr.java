package com.ucla.linkedin;

import com.ucla.linkedin.MovieRating;
import org.junit.Test;

public class TestMr {
    @Test
    public void main() {
        int[] x= new int[]{9, -1, -3, 5, 6};
        MovieRating test = new MovieRating();
        int result = test.movieRating(x);
        System.out.print(result);


    }
}
