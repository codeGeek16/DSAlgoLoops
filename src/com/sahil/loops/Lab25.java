package com.sahil.loops;

// Sum of squares digits of a given number
//ex :123-> 1,2,3

/**
 * @author - sahil.aieee@gmail.com
 */
public class Lab25 {

    public static void main(String[] args) {
        int n = 123;// this will work for negative numbers also but the digits are all -ve, so do mod for inut for -ve values
        int sum =0;
        while(n!=0){
            int rem = n%10;
            sum += rem * rem;
            n/=10;
        }

        System.out.println("Sum of squares of digits:" + sum);

    }
}

//time complex = O(log n)
//space complexity=O(1)
