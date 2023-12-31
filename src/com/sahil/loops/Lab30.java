package com.sahil.loops;

// Check whether given number is Strong number
// STrong Number=> sum of factorials of digits is equal to number
//123-> 1!+ 2! +3!=> 1+ 2+6>9
//145-> 1 + 24 +120 ->145

/**
 * @author - sahil.aieee@gmail.com
 */
public class Lab30 {

    public static long factorial(int n){
        long fact =1;
        if(n==0 || n==1)
            return 1;
        for (int i=1;i<=n;i++) {
            fact *= i;
        }
        return fact;
    }

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

    public static void main(String[] args) {
        int n = 145;
        System.out.println(isStrong(n));

    }
}

//time complex = O(n) as is strong is very small compared to log n so its execution can be considered almost constant O(digits) and factorial calls n times so iin total is O(n)
//space complexity=O(1)
