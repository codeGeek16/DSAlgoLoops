package com.sahil.loops;

// Print Strong numbers from 1 to N

/**
 * @author - sahil.aieee@gmail.com
 */
public class Lab31 {

    public static boolean isStrong(int n){
        int ncCopy= n;

        long sum =0;
        while(n!=0){
            int digit = n%10;
            long fact = factorial(digit);
            sum += fact;
            n/=10;
        }
        return (sum == ncCopy);
    }

    public static long factorial(int n){
        long fact =1;
        if(n==0 || n==1)
            return 1;
        for (int i=1;i<=n;i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        int n = 100000;

        for(int i=1;i<n;i++){
            if(isStrong(i))
                System.out.println(i);
        }




    }
}

//time complex = O(n^2)
//space complexity=O(1)
