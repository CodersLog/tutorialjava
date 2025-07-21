package Inheritance_and_Polymorphism;

import Access_modifiers.DogAccessModifiers;

public class Inheritance_and_Polymorphism {
    public static void main(String[] args) {

        Dog bengie = new Dog("bengie.png" , "bengie" , 5);
        Cat felix = new Cat("felix.png", "Felix" , 3);
        Animal betsie = new Cow("betsie.png" , "Betsie" , 6);

        System.out.println("Bengie age: " + bengie.getAge());
        System.out.println("Cats name is: " + felix.name);
        System.out.println(felix.name + "is " + felix.getAge() + " years old");
        System.out.println("Next year he will be: " + felix.birthdayAge + "Years old");

        System.out.println("Betsie's age is: " + betsie.getAge());
        System.out.println("Betsie makes the sound: ");
        betsie.makesSound();


    }
}
