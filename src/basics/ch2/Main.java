package basics.ch2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        int num;
        Scanner s=new Scanner(System.in);
        num=s.nextInt();

            System.out.println(compute2(num));
        //System.out.println(reverse(num));
    }

     static String compute(int n) {
         int n2 = reverse(n);
         String word = "";
         if (n % 3 == 0)
             word = word + "Foo";
         if (n % 5 == 0)
             word = word + "Bar";
         if (n % 7 == 0)
             word = word + "Qix";
         while (n2 != 0) {
             if (n2 % 10 == 3)
                 word = word + "Foo";
             else if (n2 % 10 == 5)
                 word = word + "Bar";
             else if (n2 % 10 == 7)
                 word = word + "Qix";
             n2 /= 10;
         }

         if (word == "")
             return String.valueOf(n);
         else
             return word;
     }
    static int reverse(int n)
    {
        int reversed_n=0;
        while(n!=0)
        {
            reversed_n=reversed_n*10+n%10;
            n/=10;
        }
        return reversed_n;
    }

    static String compute2(int n)
    {
        int n1=n;
        int n2 = reverse(n);
        int n3=reverse(n);
        String word = "";
        if (n % 3 == 0)
            word = word + "Foo";
        if (n % 5 == 0)
            word = word + "Bar";
        if (n % 7 == 0)
            word = word + "Qix";
        while (n2 != 0) {
            if (n2 % 10 == 3)
                word = word + "Foo";
            else if (n2 % 10 == 5)
                word = word + "Bar";
            else if (n2 % 10 == 7)
                word = word + "Qix";
            else if(n2%10==0)
                word=word+"*";
            n2 /= 10;
        }
        if(!word.matches(".*[a-zA-Z]+.*"))
        {
            word="";
            while(n3!=0)
            {
                if(n3%10!=0)
                {
                    word=word+String.valueOf(n3%10);
                }
                else word=word+"*";
                n3/=10;
            }
        }
        while(n1%10==0)
        {
            word=word+"*";
            n1=n1/10;
        }

        if (word == "")
            return String.valueOf(n);
        else
            return word;

    }
}
