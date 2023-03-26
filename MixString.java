/*
Given two strings, a and b, create a bigger string
made of the first char of a, the first char of b, the second char of a,
the second char of b, and so on.
Any leftover chars go at the end of the result.

        mixString("abc", "xyz") → "axbycz"
        mixString("Hi", "There") → "HTihere"
        mixString("xxxx", "There") → "xTxhxexre"*/
public class Temp {
    public static void main(String[] args) {
        System.out.println(mixString("abc", "xyz"));
        System.out.println(mixString("Hi", "There"));
        System.out.println(mixString("xxxx", "There"));
    }

    public static String mixString(String first, String second) {
        //By the way Math.max could replace a "good old" if else statement,
        // however I didn't need it here after all:
        //int longer = Math.max(first.length(), second.length());

        String shorter = first;
        String longer = second;

        if (first.length() > second.length()) {
            shorter = second;
            longer = first;
        }

        StringBuilder mix = new StringBuilder();

        for (int i = 0; i < longer.length(); i++) {
            if (i < shorter.length()) {
                mix.append(shorter.charAt(i));
            }
            mix.append(longer.charAt(i));
        }

        return mix.toString();
    }
}
