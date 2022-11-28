package OO.ch1;

public class Main {
    public static void main(String[] args)
    {
        Fighter opponent1= new Fighter("Fighter1", 100 , 20);
        Fighter opponent2= new Fighter("Fighter2", 100 , 25);
        BoxingMatch box= new BoxingMatch(opponent1, opponent2);
        System.out.println(box.fight());
    }
}