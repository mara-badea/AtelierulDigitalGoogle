package OO.ch2;

abstract class Animal
{
    protected int legs;

    public Animal(int legs)
    {
        this.legs=legs;
    }
    protected Animal()
    {

    }
    abstract void eat();
     public String walk()
     {
         return "The animal has"+legs+" legs and walks with 2 legs at once.";
     }
}

