package com.sahil.loops;

// FInd the sum of divisibles of given number exclude n

/**
 * @author - sahil.aieee@gmail.com
 */
public class Lab19 {

    public static void main(String[] args) {
        int n = 25;
        int sum = 0;
        for (int i = 1; i <= n / 2; i++) { //as all multiples will be covered till this range
            if (n % i == 0)
                sum += i;
        }
        System.out.println("Sum:" + sum); // as number is divisible by itself also, and it won't cover in above loop
    }
}

//time complex = O(n/2)
//space complexity=O(1)
