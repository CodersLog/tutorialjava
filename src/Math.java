public class Math {
    public static void main(String[] args) {

        // You can use math in a variable see CLASS#VARIABLES

        int a = 200;
        int b = 100;

        //ADDITION
        int add = a + b;
        System.out.println("Addition: " + add);

        //SUBTRACTION
        int minus = a-b;
        System.out.println("Subtraction: " + minus);

        //MULTIPLICATION
        int multi = a*b;
        System.out.println("Multiplication: " + multi);

        //DEVISION
        int devis = a/b;
        System.out.println("Devision:" + devis);

        //NEVER DIVIDE BY 0!!

        //EXAMPLE DIVISION BY 0


        /*
        int devbyzero = a / 0;
        System.out.println(devbyzero);
        */

        /*
        gives exception:
        Exception in thread "main" java.lang.ArithmeticException: / by zero
	    at Math.main(Math.java:28)
        Process finished with exit code 1
         */

        //REMAINDER (MODULO)
        // determines if remaining number is odd or not
        int remains = 100 % 2; // <- % is used for remainders
        /* will devide number in this case
         100 by 2 until what remains will be outputted as a number*/

        System.out.println(remains + " Remains"); // <- will output 0 since 2 can be multiplied by itself until 0 remains

        int remains2 = 100 % 1; // <- will also output 0 since 1 can be added to itself until 0 remains

        System.out.println(remains2 + " Remains");

        int remains3 = 100 % 3;

        System.out.println(remains3 + " Remains"); // <- will output 1 since 3 can be added to itself until it reaches 99 which leaves one remaining

        int remains4 = 101 % 3; // with logic above this will output 2... adds until 99 leaving 2 remaining

        System.out.println(remains4 + " Remains");

        // you can also use the Math Class from java.lang.Math for mathematical equations

        System.out.println("2.555 is now rounded up to: " + java.lang.Math.ceil(2.555));
        // ^- this will output 3 since ceil rounds doubles (see CLASS#VARIABLES) up to whole numbers
        // 2.555 rounded up is 3







    }
}
