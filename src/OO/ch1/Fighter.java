package OO.ch1;

public class Fighter {
    private String name;
    private float health;
    private float damagePerAttack;
    public Fighter(String name, float health, float damagePerAttack)
    {
        this.name=name;
        this.health=health;
        this.damagePerAttack=damagePerAttack;
    }
    public void attack(Fighter opponent)
    {
        opponent.health=opponent.health-this.damagePerAttack;
    }
    public float getHealth()
    {
        return health;
    }
    public String toString()
    {
        return name;
    }
}
