package com.sahil.loops;

// Print digits of a given number
//ex :123-> 1,2,3

/**
 * @author - sahil.aieee@gmail.com
 */
public class Lab22 {

    public static void main(String[] args) {
        int n = 123;// this will work for negative numbers also but the digits are all -ve, so do mod for inut for -ve values
        while(n!=0){
            int rem = n%10;
            System.out.println(rem);
            n/=10;
        }

    }
}

//time complex = O(log n) since it executed 3 times and not 123 times
//space complexity=O(1)
