package HomeWork;

import java.util.*;

public class HomeWork9 {

    /**
     * Question 1:
     * Create a method, that will return all duplicates values with count from the given String List
     * List<String> words = {"happy", "peace", "joy", "grow", "joy", "laugh", "happy", "laugh", "joy"};
     * Output:
     *      happy - 2
     *      joy - 3
     *      laugh - 2
     *
     * Question:2
     * Create a hashMap with any numbers of key-value pairs from the user
     * Key should be Integer
     * Value should be String
     * if there are keys with same value, print the keys otherwise, create method that will "All keys have different values"
     *
     *
     * Question 3:
     * Create a hashMap with any numbers of key-value pairs from the user (Key - String, Value - Integer)
     * Create a method that will take hashMap as input and returns the name of student(s) who scored maximum marks.
     */

    public static void main(String[] args) {

        //question: 1

        List<String> listWords = new ArrayList<>(Arrays.asList("happy", "peace", "joy", "grow", "joy", "laugh", "happy", "laugh", "joy"));
        System.out.println(duplicateValuesWithCount(listWords));


        // question: 2

        HashMap<Integer, String> pairs = new HashMap<>();
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.println("Enter a key- Integer");
            Integer key = input.nextInt();
            System.out.println("Enter a value - String");
            String value = input.next();
            pairs.put(key, value);
        }
        System.out.println(pairs);
        System.out.println(findIfDifferentValue(pairs));


        // Question: 3

        HashMap <String, Integer> scorePairs = new HashMap<>();
        Scanner input2 = new Scanner(System.in);

        for (int i = 0; i < 3; i++){
            System.out.println("Enter Key here - Name");
            String keyName = input2.next();
            System.out.println("Enter value here - Score");
            Integer score = input2.nextInt();

            scorePairs.put(keyName,score);
        }
        System.out.println(scorePairs);
        System.out.println(nameOfTopScorer(scorePairs));

    }

    // method for question 3

    public static String nameOfTopScorer (HashMap <String, Integer> scores) {

        String result = "";
        int maxValue = (Collections.max(scores.values()));
        for (String key : scores.keySet()) {
            if(scores.get(key).equals(maxValue)){
                result = key;
            }


        }

        return result;
    }

    // method for question 2

    public static Set<Integer> findIfDifferentValue (HashMap<Integer,String> pairs){

        Set<Integer> result = new HashSet<>();
        for (int i = 0; i < pairs.size()-1; i++) {
            for (int j = i + 1; j < pairs.size(); j++) {
                if (pairs.get(i).equalsIgnoreCase(pairs.get(j))){
                    result= pairs.keySet();

                } else {
                    System.out.println("All pairs have unique values");
                }
            }

        }
        return result;

    }


    // method for question 1

    public static HashMap<String, Integer> duplicateValuesWithCount (List <String> words){

        HashMap<String, Integer> result = new HashMap<>();


        for (int i = 0; i<words.size(); i ++){
            int count = 1;
            if (!result.containsKey(words.get(i))){
            for (int j = i + 1; j < words.size(); j ++) {
                if (words.get(i).equals(words.get(j))) {
                    count++;
                }
            }
            if (count > 1){
                    result.put(words.get(i),count);
                }
            }
        }
        return result;
    }



}
