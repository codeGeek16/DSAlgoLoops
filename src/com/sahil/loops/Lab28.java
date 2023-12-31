package com.sahil.loops;

// Print armstrong from 1 to N


/**
 * @author - sahil.aieee@gmail.com
 */
public class Lab28 {

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
        int n = 10000;

        for (int i=1;i<=n;i++) {
            if (isArmstrong(i))
                System.out.println(i);
        }

    }
}

//time complex = O(n log n)
//space complexity=O(1)
