package concurrency.ch3.player;


public class Player extends Thread{
    String nume;
    String choice;
    int nr;
    public int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }
    public Player(String nume) {
        this.nume=nume;
    }
    @Override
    public void run()
    {
        nr= getRandomNumber(1,3);
        if(nr==1)
        {
            this.choice="piatra";
        }
        if(nr==2)
        {
            this.choice="hartie";
        }
        if(nr==3)
        {
            this.choice="foarfeca";
        }
    }
    String getChoice()
    {
        return choice;
    }
    String getNume()
    {
        return nume;
    }
    @Override
    public String toString()
    {
        return "Player " + this.getNume() + " Wins";

    }

}
