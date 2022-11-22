package OO.ch1;

import OO.ch1.BoxingMatch;
import OO.ch1.Fighter;

public class Main {
    public static void main(String[] args)
    {
        Fighter opponent1= new Fighter("Fighter1", 100 , 20);
        Fighter opponent2= new Fighter("Fighter2", 100 , 25);
        BoxingMatch box= new BoxingMatch(opponent1, opponent2);
        System.out.println(box.fight());
    }
}