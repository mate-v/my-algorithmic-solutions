/*
Given a string s, find the length of the longest substring without repeating characters.
*/

import java.util.ArrayList;
import java.util.List;

public class MaxSubStrWORep {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
        System.out.println(lengthOfLongestSubstring("bbbb"));
        System.out.println(lengthOfLongestSubstring("pwwkew"));
    }

    public static int lengthOfLongestSubstring(String s) {
        if (s.isEmpty()) {
            return 0;
        } else if (s.length() == 1) {
            return 1;
        }

        int longest = 1;
        List<Character> chars = new ArrayList<>();
        StringBuilder strB = new StringBuilder();

        for (int i = 0; i < s.length() - 1; i++) {
            if ((s.length() - i) > longest) {
                strB.append(s.charAt(i));
                chars.add(s.charAt(i));

                for (int j = i + 1; j < s.length(); j++) {
                    if (!chars.contains(s.charAt(j))) {
                        strB.append(s.charAt(j));
                        chars.add(s.charAt(j));

                        if (strB.length() > longest) {
                            longest = strB.length();
                        }
                    } else {
                        strB.setLength(0);
                        chars.clear();
                        break;
                    }
                }
            }
        }

        return longest;
    }
}
