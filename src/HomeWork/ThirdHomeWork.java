package HomeWork;

import java.sql.SQLOutput;

public class ThirdHomeWork {
    public static void main(String[] args) {

            /**
             * Create variable to store student-score, and total-possible-score based on the percentage,
             * display grade to student
             * Grade A: 91-100
             * Grade B: 81-90
             * Grade C: 71-80
             * Grade D: 61-70
             * Grade E: 51-60
             * Grade F: less than or equal to 50
             */
            //int studentScore = 135;
            //int maxScore = 150;
            //calculate percentage
            //Your percentage: XX.yy and your grade is: A


        double studentScore = 97;
        double maxScore = 200;

        float scorePercentage = (float) ((studentScore*100)/maxScore);


        if (scorePercentage>91 && scorePercentage<= 100){
            System.out.println("Your percentage "+ "=> " + scorePercentage + "%" +"\n"+
                    "Your grade is: A");}
        else if(scorePercentage>81 && scorePercentage<= 90) {
            System.out.println("Your percentage " + "=> " + scorePercentage +"%" + "\n" +
                    "Your grade is: B");}
        else if(scorePercentage>71 && scorePercentage<= 80) {
            System.out.println("Your percentage " + "=> " + scorePercentage +"%" + "\n" +
                    "Your grade is: C");}
        else if(scorePercentage>61 && scorePercentage<= 70) {
            System.out.println("Your percentage " + "=> " + scorePercentage +"%" + "\n" +
                    "Your grade is: D");}
        else if(scorePercentage>51 && scorePercentage<= 60) {
            System.out.println("Your percentage " + "=> " + scorePercentage +"%" + "\n" +
                    "Your grade is: E");}
        else if(scorePercentage<=51) {
            System.out.println("Your percentage " + "=> " + scorePercentage +"%" + "\n" +
                    "Your grade is: F");}
        else {
            System.out.println("Your result is not published, contact administrator");
        }



            /**
             * Checking car mode (P, D, N, R)
             * if car mode is P and "you can park car"
             * if car mode is D drive car
             *      if drive type is Snow, display "You are on Snow mode"
             *      if drive type is Sport, display "You are on Sport mode"
             *      if drive type is Eco, display "You are on Eco mode"
             * if car mode is N you can "put car in car wash"
             * if car mode is R you can "revere the car"
             */

            char carMode = 'N';
            String driveType = "Eco";

            if (carMode == 'P'){
                    System.out.println("You can park car");
            }
            else if (carMode == 'D') {

                System.out.println("Drive Car");

                switch (driveType) {
                    case "Snow":
                        System.out.println("You are on Snow mode");
                        break;
                    case "Sport":
                        System.out.println("You are on Sport mode");
                        break;
                    case "Eco":
                        System.out.println("You are on Eco mode");
                }
            }

             else if (carMode == 'N') {
                    System.out.println("Put car in car wash");
                }

             else if (carMode =='R'){
                 System.out.println("Reverse the car");
             }

             else{
                 System.out.println("Currently there is no mode");
            }





            /**
             * store value in an int variable
             * if number is divisible by 3, print "divisible by 3"
             * if number is divisible by 5, print "divisible by 5"
             * if number is divisible by 3 and 5, print "divisible by both"
             * if not divisible by 3 or 5, print the number
             *
             */


            int var = 45;


            if ((var%3 ==0) && (var%5 ==0)){
                System.out.println("Divisible by 3 & 5");
            }
            else if (var%3 ==0){
                System.out.println("Divisible by 3");
            }
            else if (var%5 ==0){
                System.out.println("Divisible by 5");
            }
            else{
            System.out.println(var);

            }


            }




        }

