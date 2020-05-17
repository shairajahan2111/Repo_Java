package FirstTest;

public class ClassWork2 {


    public static void main(String[] args) {
    int[] array = {34, 45, 56, 76};
    int totalNumber = intArray(array);
        System.out.println(totalNumber);

        String checkPalindrome = ("shaira");
        System.out.println(isPalindrome(checkPalindrome));

    }

    public static int intArray (int [] array ){
        int total = 0;
        //int [] array = {1,2,22,34, 43, 98};
        for (int value : array){
            total = total+ value;
        }return total;

    }

    public static String findReverseString (String msg ){
        String reverseMessage = "";

        for (int i = msg.length() - 1 ; i >= 0; i--) {
            reverseMessage += msg.charAt(i);
        }
        return reverseMessage;

    }

    public static boolean isPalindrome (String word){

        String reverseWord = findReverseString(word);
        return word.equalsIgnoreCase(reverseWord);

    }





}
