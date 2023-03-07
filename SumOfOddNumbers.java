/*
https://www.codewars.com/kata/55fd2d567d94ac3bc9000064
*/
public class SumOfOddNumbers {
    public static void main(String[] args) {
        System.out.println(rowSumOddNumbers(42));
        System.out.println(rowSumOddNumbers2(42));
    }

    public static int rowSumOddNumbers(int n) {
        int counter = 1;
        for (int i = 1; i < n; i++) {
            counter += i * 2;
        }
        int result = counter;

        for (int i = 1; i < n; i++) {
            counter += 2;
            result += counter;
        }

        return result;
    }
  
  //Jonatan's solution:
    private static int rowSumOddNumbersJ(int n) {
        return n*n*n;
    }
}
