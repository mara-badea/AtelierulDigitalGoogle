package OO.ch3;

public class Cat extends Animal implements Pet
{
    protected String name;

    public Cat(String name)
    {
        super(4);
        this.name = name;
    }
    public Cat()
    {
        this("");
    }
    public String getName()
    {
        return this.name;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public void play()
    {
        System.out.println("The cat plays");
    }
    void eat()
    {
        System.out.println("The cat eats fish");
    }
}
