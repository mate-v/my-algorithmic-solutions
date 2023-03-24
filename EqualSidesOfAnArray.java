/*
https://www.codewars.com/kata/5679aa472b8f57fb8c000047
 */
public class EqualSidesOfAnArray {
    public static void main(String[] args) {
        int[] array1 = new int[]{1,2,3,4,3,2,1};
        int[] array2 = new  int[]{1,100,50,-51,1,1};

        System.out.println(equal(array1));
        System.out.println(equal(array2));

    }

    private static int equal(int[] input) {
        int ifNone = -1;

        int leftCounter = 0;
        int rightCounter = 0;

        for (int i = 0; i < input.length; i++) {
            leftCounter += input[i];

            for (int j = input.length - 1; j > i + 1; j--) {
                rightCounter += input[j];
            }

            if (leftCounter == rightCounter) {
                return i;
            } else {
                rightCounter = 0;
            }
        }

        return ifNone;
    }

}
