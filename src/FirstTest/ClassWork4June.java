package FirstTest;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class ClassWork4June {

    public static void main(String[] args) {


    /**
     * School:
     * Student1 - 55
     * Student2 - 65
     * Student3 - 75
     * Student4 - 85
     * Student5 - 95
     *
     * Store the data in appropriate variable
     * and print the name of student who scored max marks.
     *
     * 1. Store data in scoreSheet map variable
     * 2. get allValues from scoreSheet (scores)
     * 3. find max value in score-Collection
     * 4. find key(Student Name) corresponding to max-value (max-score)
     *
     */


    HashMap<String, Integer> scoreList = new HashMap<>();

        scoreList.put("Student 1",55);
        scoreList.put("Student 2",65);
        scoreList.put("Student 3", 75);
        scoreList.put("Student 4",85);
        scoreList.put("Student 5", 95);

        System.out.println(scoreList);

    Collection<Integer> scores =scoreList.values();

    Integer maxScore = Collections.max(scores);

    String topper = "";
        for (String name : scoreList.keySet()){
        if (scoreList.get(name)== maxScore){
            topper = name;
            break;
        }

        System.out.println(topper + "scores max " + maxScore);



    }

        System.out.println("Enter Student ID & Score");


        Scanner scanner = new Scanner(System.in);
        HashMap <String, Integer> scoreWithScanner = new HashMap<>();

        for (int i = 0; i< 5; i++) {
            System.out.println("Enter your student name");
            String studentName = scanner.next();
            System.out.println("Enter a score");
            int studentScore = scanner.nextInt();
            scoreWithScanner.put(studentName, studentScore);
        }

        System.out.println(scoreWithScanner);



        }


}
