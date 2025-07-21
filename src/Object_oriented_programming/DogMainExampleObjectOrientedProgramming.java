package Object_oriented_programming;

public class DogMainExampleObjectOrientedProgramming {
    public static void main(String[] args) {

        // THIS IS HOW WE MAKE A DOG USING THE DEFAULT CONSTRUCTOR
        // Dog dog = new Dog();

        // FOR OUR CUSTOM CONSTRUCTOR WE WILL NEED TO DO THIS
        DogExampleObjectOrientedProgramming bengie = new DogExampleObjectOrientedProgramming("bengie.png" , "bengie" , 5);
        DogExampleObjectOrientedProgramming felix = new DogExampleObjectOrientedProgramming("felix.png" , "felix" , 7);
        DogExampleObjectOrientedProgramming diva = new DogExampleObjectOrientedProgramming("diva.png" , "diva" , 12);
        DogExampleObjectOrientedProgramming tyson = new DogExampleObjectOrientedProgramming("tyson.png" , "tyson" , 1);

        //SO NOW THAT WE HAVE CREATED THE NEW VARIABLES OF OUR DOGS WE CAN SEE INFORMATION ABOUT THEM BY GETTING THEIR PROPERTYS

        System.out.println("Bengie age: " + bengie.age);
        System.out.println("Felix age: " + felix.age);
        System.out.println("Diva age: " + diva.age);
        System.out.println("Tyson age: " + tyson.age);

        // WE CAN ALSO USE THE BIRTHDAY METHOD IN THE DOG CLASS TO SEE WHAT THEY WILL TURN IN A YEAR

        System.out.println("Next year they will be:");

        bengie.birthday();
        felix.birthday();
        diva.birthday();
        tyson.birthday();

        System.out.println("Bengie age: " + bengie.age);
        System.out.println("Felix age: " + felix.age);
        System.out.println("Diva age: " + diva.age);
        System.out.println("Tyson age: " + tyson.age);





    }




}
