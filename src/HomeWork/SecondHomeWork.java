package HomeWork;

import java.util.Arrays;

public class SecondHomeWork {

    public static void main(String[] args) {

        //Store my first name in a variable

        String myFirstName = "Shaira";

        //Display length of the first name

        int lengthOfFirstName = myFirstName.length();
        System.out.println("1. Length of my first name- "+ lengthOfFirstName);

        //Does your name starts with "k"

        boolean myNameInitial = myFirstName.startsWith("K");
        System.out.println("2. Does my name start with 'K'- "+ myNameInitial);

        //First alphabet of your name

        char firstAlphabetOfName = myFirstName.charAt(0);
        System.out.println("3. First alphabet of my name- "+ firstAlphabetOfName);

        //Does your name ends with "M"

        boolean myNameEndsWith = myFirstName.toUpperCase().endsWith("M");
        System.out.println("4. Does my name end with 'M'- " + myNameEndsWith);

        //String my statement = "I am a good programmer"


        String myStatement = "I am a good programmer";
        System.out.println("String myStatement is- " + myStatement);

        //1. Fetch the last word of the sentence

        int lastIndexOfSpace = myStatement.lastIndexOf(" ");
        System.out.println("Last index of space for the sentence is- "+ lastIndexOfSpace);

        /** Note: To get the last word for any sentence we can use-
         * the index of last space + 1 to get the beginning index for the last word
         */

        int beginningIndexOfLastWord = lastIndexOfSpace + 1;
        System.out.println("Beginning index for last word is- "+ beginningIndexOfLastWord);
        String lastWord = myStatement.substring(12);
        System.out.println("1. Last word of the sentence is- " + lastWord);

        // Display the total number of words in the myStatement

        int totalNumberOfWords = myStatement.length();
        System.out.println("2. Total number of words in myStatement- "+ totalNumberOfWords);

        //Replace all the "r: characters with "f" characters

        String afterReplace = myStatement.replace('r', 'f');
        System.out.println("3. After replacing all 'r' characters with 'f'- "+ afterReplace);

        //Store your first name in String variable

        String myFirstName2 = "Shaira";
        System.out.println("My first Name- " + myFirstName2);

        int lengthOfName = myFirstName2.lastIndexOf(" ");
        System.out.println("Length of my first name without using length method of string is- " + lengthOfFirstName);
















    }
}
