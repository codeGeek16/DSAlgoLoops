package com.sahil.loops;

// Find the factorial of given number



/**
 * @author - sahil.aieee@gmail.com
 */
public class Lab29 {

    public static void main(String[] args) {
        int n = 20;
        long fact =1;
        for (int i=1;i<=n;i++) {
                fact *= i;
        }
        System.out.println(("factorial of " + n + "is :"+fact));

    }
}

//time complex = O(n)
//space complexity=O(1)Lab29
