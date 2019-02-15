package com.stackroute.javapractice2;
import java.io.*;

public class Question9 {

    int checkWordFrequency(String inputPath){
        File file = new File(inputPath);
        int countWord=0;
        try{

            BufferedReader br = new BufferedReader(new FileReader(file));
            String st;
            while ((st = br.readLine()) != null){
                if(!(st.equals("")))
                {
                    // \\s+ is the space delimiter in java
                    String[] wordList = st.split("\\s+");
                    countWord += wordList.length;
                    // [!?.:]+ is the sentence delimiter in java

                }
            }

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return countWord;
    }
}
