package OO.ch3;

public class TestAnimals {
    public static void main(String[] args) {

        Fish d= new Fish();
        Cat c=new Cat("Fluffy");
        Animal a= new Fish();
        Animal e = new Spider();
        Pet p = new Cat();
        d.eat();
        d.play();
        d.walk();
        c.eat();
        c.play();
        c.walk();
        System.out.println(c.getName());
        c.setName("Fluf");
        System.out.println(c.getName());
        a.eat();
        a.walk();
        e.eat();
        e.walk();
        p.play();
    }
}
