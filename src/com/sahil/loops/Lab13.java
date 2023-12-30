package com.sahil.loops;

// Print divisibles of given number

/**
 * @author - sahil.aieee@gmail.com
 */
public class Lab13 {

    public static void main(String[] args) {
        int n = 16;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
                System.out.println(i);
        }

    }
}

//time complex = O(n)
//space complexity=O(1)
