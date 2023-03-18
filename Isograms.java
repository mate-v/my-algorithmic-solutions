/*
DESCRIPTION:
An isogram is a word that has no repeating letters, consecutive or non-consecutive.
 Implement a function that determines whether a string that contains only letters is an isogram.
 Assume the empty string is an isogram. Ignore letter case.

Example: (Input --> Output)

"Dermatoglyphics" --> true "aba" --> false "moOse" --> false (ignore letter case)

isIsogram "Dermatoglyphics" = true
isIsogram "moose" = false
isIsogram "aba" = false
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Isograms {
    public static void main(String[] args) {
        String s1 = "Dermatoglyphics";
        String s2 = "moose";

        System.out.println(isograms1(s2));
        System.out.println(isograms1(s1));
        System.out.println(isograms2(s2));
        System.out.println(isograms2(s1));
    }

    private static boolean isograms2(String input) {
        if (input.isEmpty()) {
            return false;
        }

        char[] array = input.toLowerCase().toCharArray();

        List<Character> characterList = new ArrayList<>();

        for (char c : array) {
            if (!characterList.contains(c)) {
                characterList.add(c);
            } else {
                return false;
            }
        }

        return true;
    }

    public static boolean isograms1(String input) {
        if (input.length() == 0) {
            return false;
        }

        char[] array = new char[input.length()];

        for (int i = 0; i < input.length(); i++) {
            array[i] = input.toLowerCase().charAt(i);
        }

        HashMap<Character, Integer> hashMap = new HashMap<>();

        for (char c : array) {
            if (!hashMap.containsKey(c)) {
                hashMap.put(c, 0);
            } else {
                return false;
            }
        }

        return true;
    }
}
