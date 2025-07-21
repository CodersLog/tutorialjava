package Object_oriented_programming;

public class DogExampleObjectOrientedProgramming { // CLASS... BLUEPRINT WITH SET OF INSTRUCTIONS

    public String picture;
    public String name;
    public int age;

    //DEFAULT CONSTRUCTOR.. ALWAYS ACCESSIBLE WHEN CREATING A NEW CLASS
    //public Dog(){

    //}

    //FOR OUR EXAMPLE WE WILL NEED TO MAKE A CUSTOM CONSTRUCTOR
    public DogExampleObjectOrientedProgramming(String picture, String name, int age) {

        this.picture = picture;
        this.name = name;           //THIS SPECIFIES TO GET THE VARIABLE OF (WHAT COMES AFTER THIS. TO THE VARIABLE DEFINED IN THIS CLASS)
        this.age = age;

    }

    public void birthday() {
        age++;
    }
}
