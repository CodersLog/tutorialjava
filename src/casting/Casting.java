package casting;

public class Casting {
    public static void main(String[] args) {
        /* CASTING */
            /*CASTING IS THE ACTION OF TURNING ONE DATATYPE INTO ANOTHER*/

        // Turning one Data Type into another
         /*TO PERFORM THIS ACTION WE FIRST NEED TO DEFINE OUR INITIAL DATATYPES THAT WE WANT TO MODIFY*/
        int health = 10;
        float damage = 1.5f;

        // int result = health - damage; /*THIS WILL GIVE AN ERROR BECAUSE SIMPLY
        //                                  TRYING TO SAY THAT THE INT - FLOAT CAN'T BE DONE*/

        float resultFloat = health - damage; /*WHAT HAPPENS HERE IS WHAT WE CALL IMPLICIT CASTING
                                                WHERE IT IS IMPLIED THAT WE WANT TO TURN HEALTH
                                                INTO A FLOAT SO THERE WILL BE NO LOSS OF DATA*/
        System.out.println("Result: " + resultFloat); // RESULT WILL BE 8.5

        int resultInteger = health - (int)damage; // explicitly casting damage from float to int
        System.out.println("Result: " + resultInteger); // 9

        resultInteger = (int)((float)health - damage); // 8.5 to int --> 8
        System.out.println("Result: " + resultInteger); // 8

        String point = "100";
        System.out.println("Result: " + point + 5);

        int result = Integer.parseInt(point) + 5;
        System.out.println("Result: " + result);
    }
}
