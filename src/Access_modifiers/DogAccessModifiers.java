package Access_modifiers;

public class DogAccessModifiers { // CLASS... BLUEPRINT WITH SET OF INSTRUCTIONS

    public String picture; // (public, accessible from anywhere and modifiable)
    protected String name; // (protected, accessible inside same package and sub-classes)
    private int age; // (private, ONLY accessible inside class itself/except from getters and setters)

    //DEFAULT CONSTRUCTOR.. ALWAYS ACCESSIBLE WHEN CREATING A NEW CLASS
    //public Dog(){

    //}

    //FOR OUR EXAMPLE WE WILL NEED TO MAKE A CUSTOM CONSTRUCTOR
    public DogAccessModifiers(String picture, String name, int age) {

        this.picture = picture;
        this.name = name;           //THIS SPECIFIES TO GET THE VARIABLE OF (WHAT COMES AFTER THIS. TO THE VARIABLE DEFINED IN THIS CLASS)
        this.age = age;

    }

    public void birthday() {
        age++;
    }

    public int getAge() { // THIS IS A GETTER... IT GETS THE VALUE OF A VARIABLE SO THAT THE
                        // VARIABLE ITSELF WON'T CHANGE
        return age;
    }

    public void setAge(int age) { // THIS IS A SETTER IT SETS THE VALUE OF A VARIABLE WITHOUT HARDCODING IT IN YOUR PROGRAM
        this.age = age;
    }
}
