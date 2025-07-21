package Inheritance_and_Polymorphism;

public class Cow extends Animal{
    public Cow(String picture, String name, int age) {
        super(picture, name, age);
    }

    @Override
    public void makesSound() {
        System.out.println("MOO!");
    }
}
