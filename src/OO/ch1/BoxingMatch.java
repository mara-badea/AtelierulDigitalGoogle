package OO.ch1;

import OO.ch1.Fighter;

public class BoxingMatch {
    private Fighter opponent1;
    private Fighter opponent2;

    public BoxingMatch(Fighter opponent1, Fighter opponent2) {
        this.opponent1 = opponent1;
        this.opponent2 = opponent2;
    }

    public String fight() {
        while (opponent1.getHealth() > 0 && opponent2.getHealth() > 0) {
            opponent1.attack(opponent2);
            if (opponent1.getHealth() <= 0 && opponent2.getHealth() > 0) {
                return opponent2.toString();
            }
            if (opponent2.getHealth() <= 0 && opponent1.getHealth() > 0) {
                return opponent1.toString();
            }
            opponent2.attack(opponent1);
        }
        if(opponent1.getHealth()==0)
        {
            return opponent2.toString();
        }
        else return opponent1.toString();
    }

}
