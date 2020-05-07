import java.util.Arrays;

public class SecondTest {

    public static void main(String[] args) {


        int num = 11;
        if (num%2 !=0){

            System.out.println(num);
        }


            String fullName = "Shaira Jahan";

            String [] fullNameWords= fullName.split(" ");
            int wordsCount = fullNameWords.length;

            if (wordsCount == 1){

                System.out.println("First Name: " +fullNameWords[0]);
            }
            else if (wordsCount == 2){

                System.out.println("First Name: "+ fullNameWords[0]+ "\n" +
                        "Second Name: "+ fullNameWords[1]);
            }
            else if (wordsCount == 3){
                System.out.println("First Name: "+ fullNameWords[0]+ "\n"+
                        "Second Name: "+ fullNameWords[1]+ "\n"+
                        "Third Name: "+ fullNameWords[2]);
            }
            else {
                System.out.println("the name is not valid: "+ fullName);
            }



            //switch

        int sNum = 11;

            switch (sNum){
                case 11:
                    System.out.println("snum is equal to 11");
                    break;
                case 12:
                    System.out.println("snum is equal to 12");
                    break;
                case 13:
                    System.out.println("snum is equal to 13");
                    break;
                default:
                    System.out.println("sum isnt equal to any case value ");


            }

            String daysName = "Friday";
            String msg = "";
            boolean anyMeeting = false;
            boolean isSabbatical = true;

            if (!isSabbatical) {

                switch (daysName) {

                    case "Monday":
                    case "Tuesday":
                    case "Wednesday":
                    case "Thursday":
                    case "Friday":
                        if (anyMeeting) {
                            msg = "You have a meeting, must go office";

                        } else
                            msg = "work from home";

                        break;

                    case "Saturday":
                        msg = "Go out";
                        break;

                    case "Sunday":
                        msg = "Take rest";
                        break;

                    default:
                        msg = "Invalid input";

                }
                System.out.println("message is " + msg);

            }else {
                System.out.println("Enjoy sabbatical");
            }


            String monthName = "decmber";
            String seasonName = "";

            String updatedMonthName = monthName.toLowerCase();
            switch (updatedMonthName) {
                case "december":
                case"january":
                case"february":
                    seasonName = "winter";
                    break;
                case "march":
                case"april":
                case"may":
                    seasonName = "summer";
                    break;
                case"june":
                case"july":
                case"august":
                    seasonName = "fall";
                    break;
                case"september":
                case"october":
                case"november":
                    seasonName = "spring";
                    break;
                default:
                    System.out.println("Invalid month name "+ monthName);

            } if (seasonName.length() != 0){

                System.out.println("Season Name is "+ seasonName);}


    }

}