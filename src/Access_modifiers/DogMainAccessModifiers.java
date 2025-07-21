package Access_modifiers;

public class DogMainAccessModifiers {
    public static void main(String[] args) {

        // THIS IS HOW WE MAKE A DOG USING THE DEFAULT CONSTRUCTOR
        // Dog dog = new Dog();

        // FOR OUR CUSTOM CONSTRUCTOR WE WILL NEED TO DO THIS
        DogAccessModifiers bengie = new DogAccessModifiers("bengie.png" , "bengie" , 5);
        DogAccessModifiers felix = new DogAccessModifiers("felix.png" , "felix" , 7);
        DogAccessModifiers diva = new DogAccessModifiers("diva.png" , "diva" , 12);
        DogAccessModifiers tyson = new DogAccessModifiers("tyson.png" , "tyson" , 1);

        //SO NOW THAT WE HAVE CREATED THE NEW VARIABLES OF OUR DOGS WE CAN SEE INFORMATION ABOUT THEM BY GETTING THEIR PROPERTYS

        System.out.println("Bengie age: " + bengie.getAge());
        System.out.println("Felix age: " + felix.getAge());
        System.out.println("Diva age: " + diva.getAge());
        System.out.println("Tyson age: " + tyson.getAge());

        // WE CAN ALSO USE THE BIRTHDAY METHOD IN THE DOG CLASS TO SEE WHAT THEY WILL TURN IN A YEAR

        System.out.println("Next year they will be:");

        bengie.birthday();
        felix.birthday();
        diva.birthday();
        tyson.birthday();

        System.out.println("Bengie age: " + bengie.getAge());
        System.out.println("Felix age: " + felix.getAge());
        System.out.println("Diva age: " + diva.getAge());
        System.out.println("Tyson age: " + tyson.getAge());





    }




}
