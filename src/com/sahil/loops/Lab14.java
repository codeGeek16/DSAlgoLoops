package com.sahil.loops;

// Count divisibles of given number

/**
 * @author - sahil.aieee@gmail.com
 */
public class Lab14 {

    public static void main(String[] args) {
        int n = 16;
        int count =0;
        for (int i = 1; i <= n/2; i++) { //as all multiples will be covered till this range
            if (n % i == 0)
                count ++;
        }
        count ++;
        System.out.println(count); // as number is divisible by itself also, and it won't cover in above loop
    }
}

//time complex = O(n/2)
//space complexity=O(1)
