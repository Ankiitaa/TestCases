package com.stackroute.javapractice2;

import java.io.*;
import java.io.FileInputStream;


public class Question4 {

     String getUpperCase(String inputFilepath) throws Exception{

         File file = new File(inputFilepath);
         if(inputFilepath.equals(""))
         {
             return null;
         }

         BufferedReader br = new BufferedReader(new FileReader(file));

         String s="";
         String st;
         while ((st = br.readLine()) != null){
             s+=st;
         }
         s=s.toLowerCase();

         return s;

    }
}
