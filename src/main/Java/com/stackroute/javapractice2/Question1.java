package com.stackroute.javapractice2;

public class Question1 {
    public boolean checkPalindrome(String s)
    {
        String temp="";
        for(int i=0;i<s.length();i++)
        {
            temp+=s.charAt(s.length()-i-1);
        }

        if(temp.equalsIgnoreCase(s)) {
            return true;
        }
        else
        {
            return false;
        }
    }
}
