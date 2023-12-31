package com.sahil.loops;

// Check if number is armstrong or not
// Armstrong NUmber: Sum of cubes = number
//ex : 153 => 1+125+27 => 153

/**
 * @author - sahil.aieee@gmail.com
 */
public class Lab27 {

    public static boolean isArmstrong(int n){
        int sum =0;
        int temp = n;
        while(temp!=0){
            int rem = temp%10;
            sum += rem * rem * rem;
            temp/=10;
        }
        if(n== sum)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        int n = 153;// this will work for negative numbers also but the digits are all -ve, so do mod for inut for -ve values


        System.out.println("Number " +n +" is Armstrong:" + isArmstrong(n));

    }
}

//time complex = O(log n)
//space complexity=O(1)
