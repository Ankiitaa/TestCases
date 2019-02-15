package com.stackroute.javapractice2;

public class Question3 {
   class  MemberVariable {


      public String[] isMember(String name, int age, double salary) {
          String ag=String.valueOf(age);
          String s=String.valueOf(salary);

          String[] str= new String[3];
          str[0]=name;
          str[1]=ag;
          str[2]=s;
          return str;
      }
  }
}
