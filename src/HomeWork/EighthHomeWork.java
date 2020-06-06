package HomeWork;

import java.util.*;

public class EighthHomeWork {

    /**
     * Create a method, that will return all duplicates values in the given String array.
     * String[] words = {"happy", "peace", "joy", "grow", "laugh", "happy", "laugh", "joy"};
     * Result -> ["happy", "joy", "laugh"]
     * <p>
     * <p>
     *     /** Create a method, that will return the common elements/value in two given int-array
     *          * int[] arr1 = {11, 32, 43, 54, 65}
     *          * int[] arr2 = {76, 11, 89, 43, 87, 23, 32}
     *          * Result -> [11, 32, 43]
     */

    public static void main(String[] args) {

        String[] words = {"happy", "peace", "joy", "grow", "laugh", "happy", "laugh", "joy"};
        System.out.println("Duplicate values are: " + findDuplicateValues(words));

        int[] arr1 = {11, 32, 43, 54, 65};
        int[] arr2 = {76, 11, 89, 43, 87, 23, 32};
        System.out.println("Duplicates values from Arrays are: "+ findDuplicatesArraysElements(arr1,arr2));


    }
    public static ArrayList<String> findDuplicateValues (String [] words) {

    ArrayList<String> result = new ArrayList<>();

    for (int i = 0; i < words.length; i++) {
        for (int j = i + 1; j < words.length; j++) {
            if (words[i].equals(words[j])) {
                result.add(words[i]);
            }
        }
    } return result;
}

    public static ArrayList<Integer> findDuplicatesArraysElements (int [] arr1, int [] arr2){

        ArrayList<Integer> result2 = new ArrayList<>();

        for (int i = 0; i< arr1.length ; i++){
            for  (int j = 0; j < arr2.length; j++){
                if (arr1[i] == arr2[j]){
                    result2.add(arr1[i]);
                }
            }
        } return result2;
    }

}








