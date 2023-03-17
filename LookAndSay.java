/*
https://www.codewars.com/kata/592421cb7312c23a990000cf
*/
public class LookAndSay {
    public static void main(String[] args) {
        //"111221" 1st: 1, the input. 2nd: 11 = 1 times 1. 3rd: 21 = 2 times 1.
        //4th: 1 t 2, 1 t 1 = 1211, finally 5th: 111221.
        System.out.println(lookAndSay("1", 5));
    }

    public static String lookAndSay(String input, int nTh) {

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(input).append(1);

        for (int i = 0; i < nTh - 2; i++) {
            StringBuilder newStrB = new StringBuilder();
            int consecutive = 1;
            for (int j = 0; j < stringBuilder.length() - 1; j++) {
                if (stringBuilder.charAt(j) == stringBuilder.charAt(j + 1)) {
                    consecutive++;
                }
                if (stringBuilder.charAt(j) != stringBuilder.charAt(j + 1)) {
                    newStrB.append(consecutive).append(stringBuilder.charAt(j));
                }
                if (j == stringBuilder.length() - 2) {
                    newStrB.append(consecutive).append(stringBuilder.charAt(i));
                }
            }
            stringBuilder = newStrB;
        }

        return stringBuilder.toString();
    }
}
