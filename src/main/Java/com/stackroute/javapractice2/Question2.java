package com.stackroute.javapractice2;
import java.lang.Math;


public class Question2 {
    public  boolean isPower(int num)
    {
        int t=num*num*num*num;
        if(t==(Math.pow(num,4))) {

            return true;
        }
        else
        {
            return false;
        }
    }
}
