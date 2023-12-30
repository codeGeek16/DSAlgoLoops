package com.sahil.loops;

// Sum of cubes of numbers from 1 to N

import java.math.BigInteger;

/**
 * @author - sahil.aieee@gmail.com
 */
public class Lab11 {

    public static void main(String[] args) {
        BigInteger n = new BigInteger("5");
        BigInteger sum = new BigInteger("0");
        for (BigInteger i = new BigInteger("1"); i.compareTo(n) < 0; i = i.add(BigInteger.ONE)) {
            sum = sum.add(i.multiply(i).multiply(i));
        }
        System.out.println(sum);
    }
}

//time complex = O(n)
//space complexity=O(1)
