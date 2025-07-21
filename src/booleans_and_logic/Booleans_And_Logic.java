package booleans_and_logic;

import java.util.Scanner;

public class Booleans_And_Logic {

    public static void main(String[] args) {


        // As mentioned in CLASS#VARIABLES
        // booleans van be either true(1) or false(0)

        boolean IsHelpfull = true;
        boolean MightNeedExplanation = false;

        //OPERATORS
            // in java we use operators to determine the value after data has been compared
        // in CLASS#MATH we used(+ , / , * and -) to compare 2 datatypes like ints
        // with booleans we can use operators ( < , > , <= , >= , == and != )
        /*

        < first variable is smaller than second variable
        >  first variable is bigger than second variable
        <= first variable is smaller or equals second variable
        >= first variable is bigger than or equals second variable
        == first variable equals second variable
        != first variable does NOT! equal second variable
         */

        boolean isHelpfull = true;
        boolean needsWork = false;

        /* if will be explained later*/
        if(isHelpfull != needsWork) {
            System.out.println("Does not need work");
        }

        //this will always output true since variable isHelpfull does not equal(!=) variable needsWork

        // if can be used to compare if comparison inside () euqals true


        // LOGIC (AND OR NOT)

        // OR(if one of them is correct than result will happen) ||
        // a | b | c
        // 0 | 0 | 0
        // 1 | 0 | 1
        // 0 | 1 | 1
        // 1 | 1 | 1

        // AND(if both are correct than result will happen) &&
        // a | b | c
        // 0 | 0 | 0
        // 1 | 0 | 0
        // 0 | 1 | 0
        // 1 | 1 | 1

        // NOT(if input is not correct result will happen) !
        // a | !a
        // 0 |  1
        // 1 |  0

        boolean passedTest1 = true;
        boolean passedTest2 = true;
        boolean hasHonors = passedTest1 && passedTest2; // true if BOTH are true!

        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your age?");
        int age = scanner.nextInt();
        System.out.println("Put in true or false, are you from Europe?");
        boolean isEuropean = scanner.nextBoolean();

        int euDrinkingAge = 18;
        int usDrinkingAge = 21;

        boolean canDrink = age >= euDrinkingAge && isEuropean || age >= usDrinkingAge && !isEuropean;
        System.out.println("Can you drink?..." + canDrink);

        //Lets make a list to see waht happens

        /*             (|| is an OR operator)
        euDrinkingAge   || usDrinking >= age (>= higher than or equals)
        isEuropean      || !isEuropean  (! = not)
                        ||
          if both of    ||  if both of
        them are true   ||  them are true
        true than:      ||  than:
                        ||
                        ||
      __________________||__________________
      result = canDrink || result = canDrink
         */

    }

}
