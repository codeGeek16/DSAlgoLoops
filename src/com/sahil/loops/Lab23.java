package com.sahil.loops;

// Count digits of a given number
//ex :123-> 1,2,3

/**
 * @author - sahil.aieee@gmail.com
 */
public class Lab23 {

    public static void main(String[] args) {
        int n = 123;// this will work for negative numbers also but the digits are all -ve, so do mod for inut for -ve values
        int count =0;
        while(n!=0){
            n/=10;
            count ++;
        }

        System.out.println("number of digits:" + count);

    }
}

//time complex = O(log n)
//space complexity=O(1)
