package OO.LCD;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void lcd(int w, int h)
    {
        BufferedReader reader;
        try
        {
            reader= new BufferedReader(new FileReader("C:\\Users\\badea\\IdeaProjects\\AtelierulDigitalGoogle\\src\\OO\\LCD\\numbers.txt"));
            String line = reader.readLine();
            while(line != null)
            {
                String[] tokens = line.split(" ");
                for(int i =0; i< tokens.length ; i++)
                {
                    int nr = Integer.parseInt(tokens[i]);
                    if(nr == 0)
                    {
                        for(int k = 0; k<w; k++)
                        {
                            System.out.print("_");
                        }
                        System.out.println();
                        for(int j=0; j< h; j++)
                        {
                            System.out.print("|");
                            for(int k=0; k<w-1;k++)
                            {
                                System.out.print(" ");
                            }
                            System.out.print("|");
                            System.out.println();
                        }
                    }
                }
            }
        }
        catch(IOException e)
        {

        }
    }

    public static void main(String[] args) {
        lcd(3,5);
    }
}
