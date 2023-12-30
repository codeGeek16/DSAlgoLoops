package com.sahil.loops;

// Check if number is prime or not
//prime number is number only divisble by 1 and itself
//optimised
/**
 * @author - sahil.aieee@gmail.com
 */
public class Lab16 {
    public static boolean isPrime(int n){
        for (int i = 2; i <= n/2; i++) { //as all multiples will be covered till this range
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int n = 100;
        System.out.println(isPrime(n));
    }
}

//worst case time complexity = O(n/2)
//best case time complexity =O(log n) since its in between constant and less than n/2
//space complexity=O(1)
