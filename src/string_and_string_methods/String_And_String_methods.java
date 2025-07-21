package string_and_string_methods;

import java.util.Scanner;

public class String_And_String_methods {
    public static void main(String[] args) {
        /* STRING & STRING METHODS */

        String name = "Kaupenjoe";
        String occupation = "YouTube";

        occupation = occupation + "r";

        System.out.println("My name is " + name + " and I am a " + occupation);


        String sentence = "Hello, how are you doing?";
        System.out.println(sentence);

        // Upper Case or Lower Case
        System.out.println("Lower Case: " + sentence.toLowerCase());
        System.out.println("Upper Case: " + sentence.toUpperCase());

        // Contain
        System.out.println("Does it contain \"Howdy\": " + sentence.contains("Howdy"));

        // Replacing
        System.out.println(sentence.replace("Hello", "Howdy"));

        // charAt
        System.out.println(sentence.charAt(7));

        // Original String is not modified
        System.out.println(sentence);

        Scanner scanner = new Scanner(System.in);
        String test = scanner.next();

        System.out.println(test.equals("Hello"));
    }
}
