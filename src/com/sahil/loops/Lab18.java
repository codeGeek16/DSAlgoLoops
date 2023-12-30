package com.sahil.loops;

// Prime Numbers from 1 to N

/**
 * @author - sahil.aieee@gmail.com
 */
public class Lab18 {
    public static boolean isPrime(int n){
        for (int i = 2; i <= n/2; i++) { //as all multiples will be covered till this range
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int n = 50;
        for(int i=1;i<n;i++){
            if(isPrime(i))
            System.out.println(i);
        }

    }
}

//worst case time complexity = O(n^2)
//best case time complexity =O(n log n) since its in between n times constant and less than n/2 -< Theta of n log n
//space complexity=O(n)
