package FirstTest;

import java.util.Arrays;

public class LabClassMay8Re {

    public static void main(String[] args) {

        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        String season = "";

        for (String month : months) {

            switch (month.toLowerCase()) {
                case "december":
                case "january":
                case "february":
                    season = "winter";
                    break;
                case "march":
                case "april":
                case "may":
                    season = "spring";
                    break;
                case "june":
                case "july":
                case "august":
                    season = "summer";
                    break;
                case "september":
                case "october":
                case "november":
                    season = "fall";
                    break;
                default:
                    System.out.println("invalid month name: " + month);
            }

            if (season.length() > 0) {
                System.out.println("Month: " + month + " & season: " + season);
            }


        }



        int[] numbers = {11, 131, 11, 32, 43, 54, 2, 21};
        int findPresenceOf = 11;
        System.out.println(isValuePresent(numbers,findPresenceOf));
        System.out.println(Arrays.toString(sortNumbers(numbers)));



    }
    /**
     * Find the number of times a given value present in an array
     *
     * if value is present: Display -> <value> is present <x> times in <array>
     * if value is NOT present: Display -> <value> is not present in <array>
     *
     * NOTE: no sout statement in the method
     *
     * int[] numbers = {11, 32, 43, 12, 32, 54, 11, 54, 65, 32}
     * int findPresenceOf = 11
     *
     * 11 is present 2 times in [11, 32, 43, 12, 32, 54, 11, 54, 65, 32]
     *
     * int findPresenceOf = 1
     * 1 is not present in [11, 32, 43, 12, 32, 54, 11, 54, 65, 32]
     *
     */


    public static String isValuePresent (int [] numbers, int findPresenceOf){
        int count = 0;
        String result = "";
        for (int i = 0; i<numbers.length; i++){
            if (numbers[i]==findPresenceOf){
                count++;
            }
        }
        if (count > 0){
            result = findPresenceOf + "is present in the :" + Arrays.toString(numbers) + count + " times.";
        }
        else {
            result = findPresenceOf + "is not present in the: "+ Arrays.toString(numbers);
        }
        return result;
    }

    public static int [] sortNumbers (int [] numbers){

        for(int i = 0; i< numbers.length-1;i++){
            int temp = 0;
            for(int j = 1; j< numbers.length; j++){
                if (numbers[i] > numbers[j]){
                     temp = numbers[i];
                    numbers[i]=numbers[j];
                    numbers[j]=temp;
                }
                }
            }
        return numbers ;
        }

    }





