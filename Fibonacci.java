public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fib1(10));
        System.out.println(fib2(10));
    }

    public static long fib1 (int n){
        long result = 0;
        if (n == 1) {
            return 1;
        }

        long[] arr = new long[2];
        arr[0] = 0;
        arr[1] = 1;

        for (int i = 1; i < n; i++) {
            result = arr[0] + arr[1];

            arr[0] = arr[1];
            arr[1] = result;
        }

        return result;
    }
    
    //Higher O! But at least: recursive
    public static long fib2 (int n){
        if (n <= 2) {
            return 1;
        }
        return fib2(n - 1) + fib2(n - 2);
    }
}
