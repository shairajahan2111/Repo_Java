package HomeWork;

public class FifthHomeWork {

    public static void main(String[] args) {

        /**
         * String[] names = {"john" , "michael" , "dora" , "philip" , "ilena" , "palena" , "fahry"}
         * String nameToSearch = "philip";
         * Create a method that will tell the position of name of the given array
         * If name present in the names-array, tel user the position (i.e. index+1) else say, name not present
         * <p>
         * philip is on position-4
         * happy is not present in the array
         */

        String[] names = {"john", "michael", "dora", "philip", "ilena", "palena", "fahry"};
        String nameToCheck = "john";
        System.out.println("First question: " + isNamePresent(names, nameToCheck));

        /**
         * Create a method to find average of an int-array
         * Average of the given array: 123
         */

        int [] intArray = {21,34,65,34,54,45};
        System.out.println("Second question: Average for int array is: " + findAverage(intArray));


        /**
         * Create a method to find maximum value in the given int-array
         * int[] numbers = {45, 22, 11, 65, 189, 91, 100, 81};
         *
         * Maximum value in the given array: 189
         */

        int [] intNumbers = {45, 22, 11, 65, 189, 91, 100, 81};
        System.out.println("Third question: maximum value from the int array is: "+ maxValue(intNumbers));

        /**
         * Create a method that will tell the name of student with maximum marks/score.
         * int[] scores = {90, 89, 191, 100, 81};
         * String[] names = {"Happy", "Peace", "Jesse", "Kaitlin", "Lucky"};
         *
         * Jesse scored the maximum score(191)
         */

        int[] scores = {90, 89, 191, 100, 81};
        String[] studentNames = {"Happy", "Peace", "Jesse", "Kaitlin", "Lucky"};
        System.out.println("fourth question: " + maxScore(scores,studentNames));

        }


    //question: 1
    public static String isNamePresent(String[] stringArray, String stringToSearch) {

        int position = 0;
        String stringStatement = "";

        for (int i = 0; i < stringArray.length; i++) {
            if (stringArray[i].equalsIgnoreCase(stringToSearch)) {
                position = i + 1;
                break;
            }
        }
            if (position > 0) {

                stringStatement = "Position of " + stringToSearch + " of the given array: " + position;
            }
            else {
                stringStatement = stringToSearch + " is not present in the array";
            }

            return stringStatement;

    }


    // Question: 2

    public static double findAverage ( int [] numbers){
        double total =0;
        double avg = 0;

        for (double number: numbers) {
            total += number;
        }
        avg = total/numbers.length;
        return avg;
    }

    // Question: 3


    public static int maxValue (int [] numbers) {
    int maxNum = numbers[0];
        for (int i = 0; i< numbers.length; i++) {
        if (maxNum < numbers[i]) {
            maxNum = numbers[i];
        }
    } return maxNum;
    }
    // Question: 4

    public static String maxScore (int [] studentScores, String [] studentNames){
        int scoreIndex = 0;
        int maxScore = studentScores[0];
        String topScorer = "";
        for (int i = 0; i< studentScores.length; i++) {
            if (maxScore < studentScores[i]) {
                maxScore = studentScores[i];
                scoreIndex= i;
            }
        } topScorer = studentNames[scoreIndex];
        return topScorer + " scored the top with "+ maxScore + " numbers";
    }
}



