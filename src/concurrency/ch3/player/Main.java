package concurrency.ch3.player;

public class Main {
    public static void winner(Player jucator1, Player jucator2)
    {
        if(jucator1.getChoice()=="piatra")
        {
            if(jucator2.getChoice()=="hartie")
            {
                System.out.println(jucator2.toString());

            }
            else if(jucator2.getChoice()=="piatra")
            {
                System.out.println("Draw");

            }
            else if(jucator2.getChoice()=="foarfeca")
            {
                System.out.println(jucator1.toString());
            }

        }
       else if(jucator1.getChoice()=="hartie")
        {
            if(jucator2.getChoice()=="foarfeca")
            {
                System.out.println(jucator2.toString());

            }
           else if(jucator2.getChoice()=="hartie")
            {
                System.out.println("Draw");

            }
           else if(jucator2.getChoice()=="piatra")
            {
                System.out.println(jucator1.toString());
            }
        }
       else if(jucator1.getChoice()=="foarfeca")
        {
            if(jucator2.getChoice()=="hartie")
            {
                System.out.println(jucator1.toString());

            }
           else if(jucator2.getChoice()=="foarfeca") {
                System.out.println("Draw");

            }
            else if(jucator2.getChoice()=="piatra")
            {
                System.out.println(jucator2.toString());
            }

        }
    }

    public static void main(String[] args) throws InterruptedException {
        Player jucator = new Player("Andrei");
        Player jucator2 = new Player("Alex");
        jucator2.run();
        jucator.run();
        winner(jucator, jucator2);



    }
}
