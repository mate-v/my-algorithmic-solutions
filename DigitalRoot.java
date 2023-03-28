/*
    16  -->  1 + 6 = 7
   942  -->  9 + 4 + 2 = 15  -->  1 + 5 = 6
132189  -->  1 + 3 + 2 + 1 + 8 + 9 = 24  -->  2 + 4 = 6
493193  -->  4 + 9 + 3 + 1 + 9 + 3 = 29  -->  2 + 9 = 11  -->  1 + 1 = 2
 */
public class Temp {
    public static void main(String[] args) {
        System.out.println(digital(942));
        System.out.println(digital(132189));
        System.out.println(digital(493193));
    }

    public static int digital(int input) {
        int length = String.valueOf(input).length();

        if (length == 1) {
            return input;
        } else {
            int counter = 0;


            for (int i = 0; i < length; i++) {
                counter += input % 10;
                input /= 10;
            }

            return  digital(counter);
        }

    }
}
