package IO.ch1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void findUser()
    {
        BufferedReader reader;
        boolean foundUsers = false;
        try{
            reader = new BufferedReader(new FileReader("C:\\Users\\alber\\IdeaProjects\\AtelierulDigitalGoogle-final\\src\\Io\\ch1\\phonebookinput.txt"));
            String line = reader.readLine();
            while(line!=null && foundUsers == false)
            {
                String[] tokens = line.split(" ");
                //System.out.println(tokens[0]);
                if(tokens[0].equals("Abbey"))
                    System.out.print(tokens[1] + ", ");
                if(tokens[0].equals("Abdul")) {
                    foundUsers = true;
                    System.out.print(tokens[1]);
                }
                line=reader.readLine();
            }
        }
        catch(IOException e){
            e.printStackTrace();
        }


    }

    public static void main(String[] args) {
        findUser();

    }
}