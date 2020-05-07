import java.util.Arrays;

public class TestClass {

    public static void main(String[] args) {


        String sentence = "happy new year";

        String[] newWords = sentence.split(" ");
        System.out.println(Arrays.toString(newWords));

        newWords[0] = newWords[0].substring(0,1).toUpperCase() + newWords[0].substring(1).toLowerCase() + " ";
        newWords[1] = newWords[1].substring(0,1).toUpperCase() + newWords[1].substring(1).toLowerCase() + " ";
        newWords[2] = newWords[2].substring(0,1).toUpperCase() + newWords[2].substring(1).toLowerCase();

        sentence = newWords[0] + newWords[1] + newWords [2];
        System.out.println("new sentence " + sentence);

        String strNew = "Hello dear. how are you";
        int lengthOfStr = strNew.length();
        System.out.println(lengthOfStr);

        boolean result = lengthOfStr>10?true:false;
        System.out.println(result);

        String fullName = "Shaira Jahan";
        String firstName1 = "";
        String[] afterSplit = fullName.split(" ");
        System.out.println(Arrays.toString(afterSplit));

        firstName1 = afterSplit[0];
        System.out.println(firstName1);

        int lengthOfFirstName = firstName1.length();
        System.out.println("first name length "+ lengthOfFirstName);

        String decision = lengthOfFirstName>6||firstName1.toUpperCase().startsWith("A")?"enrolled": "try again";
        System.out.println(decision);

        String theSentence = "My name is Shaira Jahan";
        String[] wordSplit = theSentence.split(" ");
        System.out.println(Arrays.toString(wordSplit));

        boolean isThreeWord = wordSplit.length ==3;
        System.out.println(isThreeWord);

        //create abbreviation
        // Happy new year
        //lab session classes

        String firstSentence = "happy new year";
        String secondSentence = "lab session classes";

        String[] splitFirstSentence = firstSentence.split(" ");
        System.out.println(Arrays.toString(splitFirstSentence));
        String abbreviation= splitFirstSentence[0].substring(0,1).toUpperCase()+ splitFirstSentence[1].substring(0,1).toUpperCase()+splitFirstSentence[2].substring(0,1).toUpperCase();
        System.out.println(abbreviation);


        String[] splitSecondSentence = secondSentence.split(" ");

        String sent1 = "Happy Eid";
        String sent2 = "happy Eid";

        String [] sentSplit1 = sent1.split(" ");
        String [] sentSplit2 = sent2.split( " ");

        String compareWords = sentSplit1[0].equals(sentSplit2[0]) && sentSplit1[1].equals(sentSplit2[1])?"Identical":"not identical";
        System.out.println(compareWords);


        String sentenceNew = "Hallo dear how are you?";

        String compareSent = sentenceNew.toLowerCase().contains("how")?sentenceNew.toUpperCase():sentenceNew.replace('r','R');
        System.out.println(compareSent);
















    }
}
