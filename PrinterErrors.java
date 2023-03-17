/*
https://www.codewars.com/kata/56541980fa08ab47a0000040
*/
public class PrinterErrors {
    public static void main(String[] args) {
        String s1 = "aaabbbbhaijjjmn";
        String s2 = "aaaxbbbbyyhwawiwjjjwwm";

        System.out.println(printerError(s1));
        System.out.println(printerError(s2));
    }

    public static String printerError(String s) {
        String result = "";

        int first = Character.hashCode('a');
        int last = Character.hashCode('m');

        int i = 0;
        int counter = 0;

        for (i = 0; i < s.length(); i++) {

            char charItself = s.charAt(i);
            int value = Character.hashCode(s.charAt(i));

            if (!(Character.hashCode(s.charAt(i)) >= first)
                    || !(Character.hashCode(s.charAt(i)) <= last)) {
                counter++;
            }

        }

        return result.concat(String.valueOf(counter)).concat("/").concat(String.valueOf(s.length()));
    }
}
