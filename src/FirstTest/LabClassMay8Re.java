package FirstTest;

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


    }}


