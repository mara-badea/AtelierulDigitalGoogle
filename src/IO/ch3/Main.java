package IO.ch3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.*;

public class Main {
    public static void findAnagram()
    {
        BufferedReader reader;
        char[] cuv;
        Character char1='l';
        Character char2='i';
        Character char3='s';
        Character char4='t';
        Character char5='e';
        Character char6='n';
        int l=0,k=0,s=0,t=0,e=0,n=0;

        try
        {
            reader = new BufferedReader(new FileReader("C:\\Users\\badea\\IdeaProjects\\AtelierulDigitalGoogle\\src\\IO\\ch3\\smallList.txt"));
            String line = reader.readLine();
            while(line != null)
            {
                String[] tokens = line.split(" ");
                for(int i = 0; i < tokens.length; i++)
                {
                    cuv = tokens[i].toCharArray();
                    for( int j = 0; j< tokens[i].length();j++)
                    {
                        if(char1.equals(cuv[j]))
                        {
                            l++;
                        }
                        if(char2.equals(cuv[j]))
                        {
                            k++;
                        }
                        if(char3.equals(cuv[j]))
                        {
                            s++;
                        }
                        if(char4.equals(cuv[j]))
                        {
                            t++;
                        }
                        if(char5.equals(cuv[j]))
                        {
                            e++;
                        }
                        if(char6.equals(cuv[j]))
                        {
                            n++;
                        }
                    }
                    if(l==1&&k==1&&s==1&&t==1&&e==1&&n==1&&cuv.length==6)
                    {
                        System.out.println(tokens[i]);
                    }
                    l=0;
                    k=0;
                    s=0;
                    t=0;
                    e=0;
                    n=0;
                }
             line = reader.readLine();
            }
        }
        catch (IOException pl)
        {

        }
    }

    public static void main(String[] args) {
        findAnagram();
    }

}
