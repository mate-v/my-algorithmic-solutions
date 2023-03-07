/*
https://www.codewars.com/kata/5552101f47fc5178b1000050/train/java
*/
public class PlayingWithDigits {
	
    public static long digPow(int n, int p) {
        int originalN = n;
        int nLength = String.valueOf(n).length();
        
        //the sum of the digits of n taken to the successive powers of p:
        int sum = 0;

        for (int i = 0; i < nLength; i++, p++) {
            sum += Math.pow(((int) (n / Math.pow(10, nLength - i - 1))), p);
            n %= Math.pow(10, nLength - i - 1);
        }

        if (sum % originalN == 0) {
            return sum / originalN;
        }

        return -1;
    }
}
