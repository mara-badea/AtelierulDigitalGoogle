package IO.ch5;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import java.util.*;

public class Main {

    public static void occurence()
    {
        BufferedReader reader;
        HashMap<String, Integer> occurences = new HashMap<String, Integer>();
        Vector <Integer> values = new Vector<>();
        int k=0;
        try
        {
            reader = new BufferedReader(new FileReader("C:\\Users\\badea\\IdeaProjects\\AtelierulDigitalGoogle\\src\\IO\\ch5\\occurence.txt"));
            String line = reader.readLine();
            String allLines = "";
            while(line !=null)
            {
                String[] tokens = line.split(" ");
                for(int i=0; i< tokens.length;i++)
                {

                    for(int j=0 ; j< tokens.length; j++)
                    {
                        if(tokens[i].equals(tokens[j]))
                        {
                            k++;
                        }
                    }
                    if(!tokens[i].equals("?")&&!tokens[i].equals("!")&&!tokens[i].equals(".")&&!tokens[i].equals("")&&!tokens[i].equals(" ")&&!tokens[i].equals(","))
                        occurences.put(tokens[i],k);
                    k=0;
                }
                line = reader.readLine();
            }
            for(Integer val : occurences.values())
            {
                values.add(val);
            }
            k=0;
            Collections.sort(values);
            Collections.reverse(values);
            for(int i = 0; i< values.size(); i++)
            {
                for(Map.Entry<String, Integer> val : occurences.entrySet())
                {
                    if(values.get(i) ==val.getValue())
                    {
                        System.out.println(val);
                        k++;
                    }
                    if(k==10)
                        break;
                }
                if(k==10)
                    break;
            }
        }
        catch(IOException e)
        {

        }
    }

    public static void main(String[] args) {
        occurence();
    }
}
