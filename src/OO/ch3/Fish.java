package OO.ch2;

public class Fish extends Animal implements Pet
{
    protected String name;
    public Fish() {
        super(0);
    }
    public void eat()
    {
        System.out.println("The fish eats");
    }
    public String walk()
    {
        return "A fish doesn't have legs and can't walk";
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public String getName()
    {
        return this.name;
    }
    public void play()
    {
        System.out.println("A fish plays");
    }

}
