import java.util.*; 
import java.io.*;
/*
https://coderbyte.com/editor/Min%20Window%20Substring:Java
*/
class MinWindowSubstr {
  
  public static void main (String[] args) {
        System.out.println(MinWindowSubstring(new String[]{"ahffaksfajeeubsne", "jefaa"}));
        System.out.println(MinWindowSubstring(new String[]{"aaffhkksemckelloe", "fhea"}));
  }

  public static String MinWindowSubstring(String[] strArr) {
        char[] kChArr = strArr[1].toCharArray();
        int nLength = strArr[0].length();
        int kLength = strArr[1].length();
        String result = "";

        for (int i = 0; i < nLength; i++) {

            if (i + kLength <= nLength) {

                LinkedList<Character> kChList = new LinkedList<Character>();

                for (char c : kChArr) {
                    kChList.addLast(c);
                }

                String subStr = strArr[0].substring(i, nLength);

                for (int k = 0; k < subStr.length(); k++) {
                    if (!kChList.isEmpty()) {
                        if (kChList.contains(subStr.charAt(k))) {
                            kChList.removeFirstOccurrence(subStr.charAt(k));
                        }
                    } else {
                        subStr = subStr.substring(0, k);
                        break;
                    }
                }

                if ((kChList.isEmpty() && result.length() == 0)
                        || (kChList.isEmpty() && subStr.length() < result.length())) {
                    result = subStr;
                    if (result.length() == kLength) {
                        return result;
                    }
                }

            } else {
                break;
            }

        }

        return result;
  }

}
