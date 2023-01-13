package IO.ch2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.String;

public class Main {
    public static void findMessage()
    {
        BufferedReader reader;
        char[] prop;
        try {
            reader = new BufferedReader(new FileReader("C:\\Users\\badea\\IdeaProjects\\AtelierulDigitalGoogle\\src\\IO\\ch2\\secretMessage.txt"));

            String line = reader.readLine();

            while (line != null) {
                prop=line.toCharArray();
                for (int i = 0; i < line.length(); i++)
                {
                    if (Character.isUpperCase(prop[i])) {
                        if (prop[i] != 'X') {
                            System.out.print(prop[i]);
                        } else {
                            System.out.print(" ");
                        }
                    }
                }
                line = reader.readLine();
            }
        }
        catch(IOException e)
        {

        }

    }
    public static void main(String[] args)
    {
        findMessage();
    }
}
