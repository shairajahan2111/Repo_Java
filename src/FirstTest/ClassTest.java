package FirstTest;

import java.sql.SQLOutput;

public class ClassTest {
    public static void main(String[] args) {


        //for (int j=0 ; j<5 ; j-=2) {
        // System.out.println("Hello -> j = " + j);


        // print from 10 to 1

        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }
        //print odd & even from 10 to 1

        for (int j = 2; j <= 10; j += 2) {
            System.out.println("printing the number " + j);
        }

        for (int i = 1; i <= 10; i += 1) {
            if (i % 2 == 0) {
                System.out.println("even number " + i);
            } else System.out.println("odd number " + i);
        }

        int number = 1;

        while (number < 10) {
            if (number % 2 == 0) {
                System.out.println("Even " + number);
            } else {
                System.out.println("Odd " + number);
            }
            number++;
        }


        /**
         * store value in an int variable
         * if number is divisible by 3, print "divisible by 3"
         * if number is divisible by 5, print "divisible by 5"
         * if number is divisible by 3 and 5, print "divisible by both"
         * if not divisible by 3 or 5, print the number
         *
         */


        int num = 1;
        while (num <= 30) {

            if ((num % 3 == 0) && (num % 5 == 0)) {
                System.out.println(num + " Divisible by 3 & 5 ");
            } else if (num % 3 == 0) {
                System.out.println(num + " Divisible by 3 ");
            } else if (num % 5 == 0) {
                System.out.println(num + " Divisible by 5 ");
            } else {
                System.out.println(num + " is not divisible by 3 or 5");
            }
            num++;


        }

        int w = 10;
        System.out.println("while loop starts");
        while (w > 100) {
            System.out.println("w= " + w);
            w++;
        }
        System.out.println("while loops ends");

        int dw = 10;
        System.out.println("Do while loop starts");
        do {
            System.out.println("dw= " + dw);
            dw++;
        } while (dw > 100);
        System.out.println("Do while loop ends");

        String[] namesString = {"Happy","laugh", "Peace", "Love"};
        for (int is = 0; is < namesString.length; is++) {
            System.out.println(namesString[is]);
        }

        for (String name : namesString){

            System.out.println(name);
        }


        /**
         * int[] numbers = {87, 90, 95, 120, 543};
         * Write code to calculate the sum of array numbers (87+90+95+120+543)
         *
         */

        int[] numbersForArray = {87, 90, 95, 120, 543};
        int total = 0;
        for(int sumOfNumber : numbersForArray) {
            total+=sumOfNumber;
        }
            System.out.println(total);


        //String[] students = {"happy", "philip", "peacephlo", "king Pharr"};
        //String keyword = "ph";
        //print all names which contains the keyword (ignoring cases)

        String[] students = new String[]{"happy", "philip", "peacephlo", "king Pharr"};
        String keyword = "ph";
        String findName = "Philip";

        for (String student : students) {
            if (student.toLowerCase().contains(keyword.toLowerCase())) {
                System.out.println(student);
                ;
            }
        }
        // using simple formula


        for (int iStudent =0; iStudent<students.length; iStudent++){
            if (students[iStudent].toLowerCase().contains(keyword.toLowerCase())){
                System.out.println(students[iStudent]);
            }
        }
        //find the index of philip in student array
        String studentNamePh = "Philip";
        for (int i =0; i<students.length; i++)
        {
            boolean indexOfPhilip = students[i].equalsIgnoreCase(studentNamePh);
            if(indexOfPhilip == true ){
                System.out.println("index= "+ i);

            }
        }







            }









    }
