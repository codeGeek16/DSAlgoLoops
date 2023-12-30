package com.sahil.loops;

// Perfect Number
//If the sums of divisibles of the numbe rexcluding the number is equal to the number

/**
 * @author - sahil.aieee@gmail.com
 */
public class Lab20 {

    public static boolean isPerfect(int n){
        int sum=0;
        for (int i = 1; i <= n / 2; i++) { //as all multiples will be covered till this range
            if (n % i == 0){
                sum += i;
                if(sum > n)
                    return false;
            }
        }
        if(sum==n)
            return true;
        else
            return false;

    }

    public static void main(String[] args) {
        int n = 3;
        System.out.println(String.format("%d is perfect number:%s" ,n,isPerfect(n))); // as number is divisible by itself also, and it won't cover in above loop
    }
}

//time complex = O(n/2)
//space complexity=O(1)
