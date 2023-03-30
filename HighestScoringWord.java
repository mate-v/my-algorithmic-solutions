import java.security.KeyStore;
import java.util.*;

/*
https://www.codewars.com/kata/57eb8fcdf670e99d9b000272
Given a string of words, you need to find the highest scoring word.
Each letter of a word scores points according to its position in the alphabet: a = 1, b = 2, c = 3 etc.
For example, the score of abad is 8 (1 + 2 + 1 + 4).
You need to return the highest scoring word as a string.
If two words score the same, return the word that appears earliest in the original string.
All letters will be lowercase and all inputs will be valid.
 */
public class HighestScoringWord {
    public static void main(String[] args) {
        //String sample1 = "abad";

        //System.out.println(high(sample1));

        //String sample2 = "aba d";

        //System.out.println(high(sample2));

        //String alphabet = "a b c d e f g h i j k l m n o p q r s t u v w x y z";
        String sample3 = "what time are we climbing up to the wnlcano volcano";

        System.out.println(high(sample3));

        //String sample4 = "abe acd";

        //System.out.println(high(sample4));
    }

    public static String high(String input) {
        String[] words = input.split(" ");

        HashMap<String, Integer> stringAndItsPositionInWordsMap = new HashMap<>();

        for (int i = 0; i < words.length; i++) {
            String currentString = words[i];
            int positionOfCurrentString = i;
            stringAndItsPositionInWordsMap.put(currentString, positionOfCurrentString);
        }

        HashMap<String, Integer> stringAndItsValueMap = new HashMap<>();

        for (String s : words) {
            char[] characters = s.toCharArray();
            int counter = 0;

            for (Character c : characters) {
                int hashCode = c.hashCode();
                var a = c.charValue();
                int valueOfCharacter = c.hashCode() - 96;
                counter += valueOfCharacter;
            }

            stringAndItsValueMap.put(s, counter);
        }

        String highest = "";
        int highestValue = 0;
        int positionToBeat = Integer.MAX_VALUE;

        for (Map.Entry<String, Integer> entry : stringAndItsValueMap.entrySet()) {
            //position of the String in String[] words:
            int position = stringAndItsPositionInWordsMap.get(entry.getKey());

            if (entry.getValue() > highestValue) {
                positionToBeat = position;
                highestValue = entry.getValue();
                highest = entry.getKey();
            } else if (entry.getValue() == highestValue && position < positionToBeat) {
                positionToBeat = position;
                highestValue = entry.getValue();
                highest = entry.getKey();
            }
        }

        return highest;
    }
}
