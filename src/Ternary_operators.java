public class Ternary_operators {
    public static void main(String[] args) {
        /* TERNARY OPERATOR */

        int health = 3;
        String status = "";
        System.out.println("What is your Status? " + status);

        /*As seen before in CLASS#FLOW_REGULATION we can use if statements
        * to see if a boolean is the value required to perform an operation*/
        if(health > 0) {
            status = "Alive";
        } else {
            status = "Non-Alive";
        }
        System.out.println("What is your Status? " + status);
        status = "";


        /*As seen below we can also use a ternary operator in this case we see
        * status which before was defined as a String with no value
        *  which now checks if health(variable we made before to determain the integer of HP) is higher than 0 using the ? operator
        *  than if true outputs the first string and of not the second string
        * it is not that big of a deal if you use them or not but it must be seen so that if you look
        * for inspiration into someone elses code they might use them rather than if statements
        * however they do not make for good read-ability*/
        status = health > 0 ? "Alive" : "Non-Alive";
        System.out.println("What is your Status? " + status);
    }
}
