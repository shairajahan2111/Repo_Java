package FirstTest;

public class ClassWork {


    public static void main(String[] args) {
        // create a method to calculate sum of values in a given int array


    }

    public static int additionForArray(int[] array) {

        int result = 0;
        for (int value : array) {
            result += value;

        }
        return result;


    }

      public static String reverseString (String message){

        String reverseMessage = "";

        for (int i = message.toLowerCase().length() - 1 ; i >= 0; i--) {
            reverseMessage += message.charAt(i);
        }return reverseMessage;

    }
    public static boolean stringPalindrome (String string) {

        String newString = "";

        for (int i = string.length() - 1; i >= 0; i--) {
            newString += string.charAt(i);
        }
        boolean result = string.equalsIgnoreCase(newString);
        return result;
    }




    }




