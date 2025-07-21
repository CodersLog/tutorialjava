package assignment_operators;

public class Assignment_Operators {

    public static void main(String[] args) {
        // Assignment operators assign values to objects

        //equal operator =
        int numberOfLives = 9; // = assigns the number 0 to variable numberOfLives with datatype int
        System.out.println("Number of lives: " + numberOfLives);

        // ADDITION +=
        numberOfLives += 2; /* would do the same as numberOfLives(assigned during equal operator)
                                 = itself + 2
                                 making the sum numberOfLives = numberOfLives + 2;
                            */
        System.out.println("Number of lives: " + numberOfLives);

        // you can also use
        numberOfLives++;
        System.out.println("Number of lives: " + numberOfLives);
        //which would add one to the variable
        /* this means it would be the same as
        * numberOfLives += 1;
        * numberOfLives = numberOfLives + 1;
        * or numberOfLives + 1;
        * */

        numberOfLives -= 1; //subtracts 1 from existing value of variable numberOfLives
        System.out.println("Number of lives: " + numberOfLives);
        //is the same as

        numberOfLives--;
        System.out.println("Number of lives: " + numberOfLives);

        //Multiplication
        numberOfLives *= 2; // MULTIPLIES BY 2 FROM EXISTING VALUE OF VARIABLE numberOfLives
        System.out.println("Number of lives: " + numberOfLives);

        //DEVIDE
        numberOfLives /= 3; // DEVIDES BY 3 FROM EXISTING VALUE OF VARIABLE numberOfLives
        System.out.println("Number of lives: " + numberOfLives);

        //REMAINDER (MODULO)
        numberOfLives %= 2; // SUBTRACTS FROM ITSELF UNTIL REMAINING NUMBER CAN BE OUTPUTTED
        System.out.println("Number of lives: " + numberOfLives);}

}
