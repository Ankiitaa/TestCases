package com.stackroute.javapractice2;

public class Factorial {
    public static long longFactorial(long n)
    {
        long fact=1;
        if(n<0)
        {
            return 0;
        }
        else
        {
            for(int i=1;i<=n;i++)
            {
                fact*=i;
            }
            return fact;
        }


    }
}
