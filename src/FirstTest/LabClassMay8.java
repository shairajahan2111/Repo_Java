package FirstTest;

import java.util.Arrays;

public class
LabClassMay8 {
    public static void main(String[] args) {


        String[] names = {"peace", "happy", "laugh", "love","grow", "learn"};

        for (int i = 0; i < names.length; i++) {

            System.out.println("names: " + names[i]);
        }


        for (int i = 0; i < names.length; i++) {
            if (names[i].length() >= 5) {
                System.out.println(names[i].substring(0, 1).toUpperCase() + names[i].substring(1).toLowerCase());

            }
        }

        // take values from name arrays & print only odd index value


        for (int iA = 1; iA < names.length; iA += 2) {

            System.out.println("odd index names " + names[iA]);
        }

        for (int i1 = 0; i1 < names.length; i1++) {
            if (i1 % 2 != 0) {
                System.out.println(names[i1]);
            }
        }

        // print names array backwards

        for (int in = names.length - 1; in >= 0; in--) {

            System.out.println("backward name: " + names[in]);
        }


        //if name length is greater than or equal to 5
        // contains P (ignore case) or greater than 5
        // dont include any peace, dont do anything


       for (String name : names) {
          if((name.length() >= 5 || name.toLowerCase().contains("p")) && (!name.toLowerCase().contains("peace"))) {

               System.out.println("Names(5 & p) using forloop: " + name);
           }
       }
        for(int i =0; i < names.length; i++){

          if(names[i].length() >= 5 && names[i].toLowerCase().contains("p")){
              System.out.println("Names(5 & p) using simple forloop: " + names[i]);

            }}

          String [] newWords = {"peace", "happy", "laugh", "love","grow", "learn","loved", "happy", "laungh"};
          // print if it duplicate words


            //String splitWords = newWords

            for (int i = 0; i < newWords.length; i++){
                for (int j = i+1; j<newWords.length; j++){

                if(newWords[i].equalsIgnoreCase(newWords[j])){
                    System.out.println(newWords[i]);
                    break;
                }
            }

            }


        String [] allWords = {"peace", "happy", "laugh", "love","grow", "love", "happy", "happy", "learn","loved", "happy", "laungh", "love","grow", "learn"};
        //how many times each word appears in the given array

        // find the perfect square root from int array
        int [] intArray = {1, 13, 32, 81, 64, 144, 93, 78, 34,};
        boolean breakOuterLoop = false;
        for (int num = 0; num< 20; num++){
        for (int i = 0; i<intArray.length; i++){
            if (intArray[i] == (num*num)) {
                System.out.println(num + "-->" + intArray[i]);
                breakOuterLoop = true;
                break;
            }
        }
        if (breakOuterLoop);{
           break;
        }







    }}}









