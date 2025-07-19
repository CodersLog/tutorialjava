import java.util.Scanner;

public class Flow_Regulation {

    public static void main(String[] args) {
        // Flow Regulation
            // (IF AND SWITCH)

        Scanner scanner = new Scanner(System.in); //Scanner datatype names scanner that lets us input into the console
        System.out.println("How much Health do you have?"); // System output that asks how much health you have
        int health = scanner.nextInt(); // input for int
        boolean isAlive = health > 0; // boolean that specifies if you have enough health to be alive

        if(isAlive) { /* is statements are flow regulators that check if the boolean in the parameters ()
                            are correct... if statements can accept booleans but also boolean expressions
                                if(boolean equals to if statement) {do this}*/
            System.out.println("You are still alive!"); //
        } else { /*if the boolean does not equal what's inside the if statement you can use else
                    to specify what happens if the boolean in the if statement is not met*/
            System.out.println("You have lost the game!");
        }

        System.out.println("How many points do you have?");
        int points = scanner.nextInt();

        if(points >= 100) {
            System.out.println("You passed with HONORS!");
        } else if(points >= 50) {
            System.out.println("You passed");
        } else {
            System.out.println("You failed!");
        }

        // SWITCH
            //used if you have a limited number of options that your variable can take
            // is more specific related but needs more code

        int x = 3;
        switch (x) {
            case 0: System.out.println("X is 0"); break;
            case 1: System.out.println("X is 1"); break;
            case 2: System.out.println("X is 2"); break;
            case 3: System.out.println("X is 3"); break;
            default: System.out.println("X is unknown!"); break;
        }
    }
}








