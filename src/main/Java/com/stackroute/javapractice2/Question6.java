package com.stackroute.javapractice2;

public class Question6 {

    public int average(int arr[])
    {
        int avg;
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
           sum+=arr[i];
        }
        avg=sum/arr.length;
        return avg;
    }


    public int lowest(int arr1[])
    {
        int min=arr1[0];

        for(int i=1;i<arr1.length;i++)
        {

            if(arr1[i]<min)
            {
                min=arr1[i];

            }
        }
        return min;
    }



    public int highest(int arr2[])
    {


        int max=arr2[0];
        for(int i=0;i<arr2.length-1;i++)
        {
            if(arr2[i]>max)
            {
                max=arr2[i];
            }
        }
        return max;
    }
}
