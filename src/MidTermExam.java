import java.util.Arrays;

public class MidTermExam {}

  /* public static void main(String[] args)

     /*  /**
        * Question 1:
        * Create a method to return an array after remove a specific value from a given int array.
        * Original array: {32, 14, 24, 98, 24, 56, 148, 24, 78, 24}    Remove: 24
        * Returned array: {32, 14, 98, 56, 148, 78}
        *
        * Input array:     {1, 2, 4, 3, 1, 6, 1}    Remove: 11
        * Returned Array:  {1, 2, 4, 3, 1, 6, 1}
        *
        */


        /*int[] inputArray = {32, 14, 24, 98, 24, 56, 148, 24, 78, 24};
        int remove = 24;
        System.out.println(Arrays.toString(removeElementFromArray(inputArray, remove)));

        int [] array = {1, 3, 5, 4, 2, 7};
        System.out.println(missingPositiveInteger(array));

        ticketingSystem(79);




    }


   /* public static int [] removeElementFromArray (int [] array, int elementToRemove){
        int temp = 0;
        int [] newArray = new int [array.length];
        for (int i = 0; i< array.length; i++){
            if (array[i] != elementToRemove){
                newArray[temp]=array[i];
                temp++;
            }
        }
        return newArray;
    }





    /**
         * Question 2:
         * Create a method to return missing smallest positive integer (greater than 0) from given array.
         * Example:
         * 	For array : {1, 3, 5, 4, 2, 7}
         * 	Method should return : 6
         *
         * 	For array : {-1, -3, 4, 2}
         * 	Method should return : 1
         *
         * 	For array : {0, 5, -1, 1, 2, 5, 3, 7, 1, 2}
         * 	Method should return : 4
         */

       /* public static int missingPositiveInteger (int [] array) {


            int missingValue = 0;
            while(true){
                boolean found = false;
                int checkFor = 0;

            }




            // sorting the array by ascending order

            for (int i = 0; i < array.length - 1; i++) {
                int temp = 0;
                for (int j = 1; j < array.length; j++) {
                    if (array[j] > array[i]) {
                        temp = array[j];
                        array[j] = array[i];
                        array[i] = temp;
                    }
                }
            }
            int[] sortedArray = array;

            for (int i = 0; i < sortedArray.length; i++) {
                for (int j = 1; j < sortedArray.length; i++) {
                    if (sortedArray[i] > 0 && (sortedArray[j] != sortedArray[i] + 1)) {
                     // missingValue = sortedArray(i);
                    }
                }

            }
            return missingValue;
        }



        /**
         * Question 3:
         * Scenario: Traffic ticketing system
         * Write a method, that will print (not return) the points charged against the license for over speeding.
         *    1. Speed Limit = 70
         *    2. Every 5 miles over the speed limit will add 1 point
         *    3. If user gets 12 points for a speed then license is suspended
         *
         *  Example:
         *      user speed = 78 ; 1 points
         *      user speed = 88 ; 3 points
         *      user speed = 178 ; 21 points (License suspended).
         *      user speed = 70 ; Thank you for driving within the speed limit.
         *
         *      88 -> 3
         *      70
         *      70-75 : 1
         *      75-80 : 1
         *      80-85 : 1
         *      85-88
         *
         */

   /* public static String ticketingSystem (double userSpeed){
        String result = "";
        double speedLimit = 70;
        double point = 0;
        double overSpeed = userSpeed - speedLimit;
        point = (overSpeed / 5);
        int intPoint = (int) point;

        if (userSpeed <= speedLimit) {
            result = "Thank you for driving within the speed limit.";
        }
        else if (userSpeed > speedLimit){
                if (point > 12){
                    result = "Your point is: "+ intPoint;
                }
                else if (point <= 12){
                    result = "Your point is: " +intPoint+ "\n" + "Because of 12 points & more, your license got suspended";





            }

        }
        return result;
    }*/



