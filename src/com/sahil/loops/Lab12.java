package com.sahil.loops;

// Print divisibles of 6 from 1 to n

/**
 * @author - sahil.aieee@gmail.com
 */
public class Lab12 {

    public static void main(String[] args) {
        int n = 25;
        for (int i =0; i <=n; i++) {
            if(i%6==0)
                System.out.println(i);
        }

    }
}

//time complex = O(n)
//space complexity=O(1)
