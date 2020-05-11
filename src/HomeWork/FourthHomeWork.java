package HomeWork;

import com.sun.org.apache.xpath.internal.objects.XString;

import javax.sound.sampled.Line;
import java.util.Arrays;

public class FourthHomeWork {


    public static void main(String[] args) {

        // First Problem=

        /**
         * Write code to create abbreviation for any given string
         */

        String msg = "have a great day to you";
        String abr = "";

        String[] splitMsg = msg.toUpperCase().split(" ");

        for (String words : splitMsg) {
            abr += words.charAt(0);
        }
        System.out.println("Abbreviation: " + abr);

        /**
         * Change Case
         */

        String line = "once upOn a tiMe in the UNIVERSE";
        System.out.println("Line (Before modification) : " + line);

        String newLine = "";
        String[] splitLine = line.toLowerCase().split(" ");

        for (String words : splitLine) {
            newLine += words.substring(0, 1).toUpperCase() + words.substring(1) + " "; // words.substring(1).toLowerCase()+ " ";
        }
        System.out.println("Line (After modification) : " + newLine);


    /**
     * reverse a string
     */


        String message = "happy holidays";
            String reverseMessage = "";

       System.out.println("Message : " + message);

       for (int i = message.toLowerCase().length() - 1 ; i >= 0; i--) {
           reverseMessage += message.charAt(i);
       }
       System.out.println("Message in reverse: " + reverseMessage);


        /**
         * Check if word is palindrome
         */

        String word = "Level"; 
        String newWord = "";

        for (int iW = word.length() - 1; iW >= 0; iW--){
            newWord += word.charAt(iW);
        }
        boolean result = word.equalsIgnoreCase(newWord);

        System.out.println("is " + word + " a palindrome: " + result);



        }



}







