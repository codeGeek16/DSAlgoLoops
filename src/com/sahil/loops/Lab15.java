package com.sahil.loops;

// Check if number is prime or not
//prime number is number only divisble by 1 and itself

/**
 * @author - sahil.aieee@gmail.com
 */
public class Lab15 {
    public static boolean isPrime(int n){
        int count =0;
        for (int i = 2; i <= n/2; i++) { //as all multiples will be covered till this range
            if (n % i == 0)
                count ++;
        }
        if(count==0){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {
        int n = 16;
        System.out.println(isPrime(n));
    }
}

//time complex = O(n/2)
//space complexity=O(1)
