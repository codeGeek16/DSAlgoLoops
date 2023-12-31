package com.sahil.loops;

// Print Perfect Number from 1 to N
//If the sums of divisibles of the numbe rexcluding the number is equal to the number
//eg 6,28,496,8128

/**
 * @author - sahil.aieee@gmail.com
 */
public class Lab21 {

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
        int n = 100;
        for(int i=1;i<n;i++){
            if(isPerfect(i))
                System.out.println(i);
        }
    }
}

//time complex = O(n^2)
//space complexity=O(1)
