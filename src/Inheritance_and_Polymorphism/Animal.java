package Inheritance_and_Polymorphism;

public class Animal {

    public String picture;
    public String name;
    private int age;
    public int birthdayAge = age++;

    public Animal(String picture,String name,int age) {

        this.picture = picture;
        this.name = name;
        this.age = age;

    }

    public void birthday(){
        age++;
    }



    public void makesSound() {
        System.out.println("MAKES THIS SOUND: ");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
