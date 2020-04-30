package HomeWork;

public class FirstHomeWork {

    public static void main(String[] args) {

        //Home Work- Part- 1:

        byte numOfHours = 24;
        System.out.println("1. Number of hours in a day- "+ numOfHours+"hours");

        short maxNumOfDays = 366;
        System.out.println("2. Max number of days in a year- "+ maxNumOfDays + "days");

        int numOfEmployees = 2200000;
        System.out.println("3. Total number of employees in Walmart- "+ numOfEmployees);

        int populationInUsa = 331002651;
        System.out.println("4-a. Population in USA- " + populationInUsa);

        long populationInChina = 1439323776L;
        System.out.println("4-b. Population in China- "+ populationInChina);

        float interestRate = 3.7f;
        System.out.println("5. Interest rate- "+ interestRate+ "%");

        double balanceInBankAccount = 10570.54;
        System.out.println("6. Balance in a bank account- "+ "$"+ balanceInBankAccount);

        boolean doesSunRiseWest = false;
        System.out.println("7. Does the sun rise from the west?" +" "+doesSunRiseWest); //I don't understand why it is yellow underline for this boolean//

        String initialsName = "SJ";
        System.out.println("8. Initials of my name- "+ initialsName);

        String myName = "Shaira Jahan";
        System.out.println("9. My name is "+ myName);

        //Home Work: Part-2:

        //°F = 9/5 ( °C) + 32

        double cTemp = 17.00;
        double fTemp = 9/5.00 * cTemp + 32;
        System.out.println("a. °F = 9/5 ( °C) + 32" +"= "+ fTemp+"°");

        //°F = 9/5 (K - 273) + 32

        double kTemp = 290.50;
        double fTemp2 = 9/5.00* (kTemp- 273) + 32;
        System.out.println("b. °F = 9/5 (K - 273) + 32"+ "= "+ fTemp2+ "°");

        //K = °C + 273
        double cTemp2 = 17.00;
        double kTemp2 = cTemp2+ 273;
        System.out.println("c. K = °C + 273" + "= " + kTemp2 + "°");

        //°C = K - 273

        double kTemp3 = 290.50;
        double cTemp3 = kTemp3 - 273;
        System.out.println("d. °C = K - 273"+ "= " + cTemp3 + "°");


        //K = 5/9 (° F - 32) + 273

        double fTemp3 = 63.5;
        double kTemp4 = 5/9.00 * (fTemp3 - 32) + 273;
        System.out.println("e. K = 5/9 (° F - 32) + 273"+ "= " + kTemp4 + "°");












    }
}
