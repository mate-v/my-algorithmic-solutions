import java.util.HashMap;
import java.util.Map;

public class FindTheOddInt {

    public static void main(String[] args) {
        int[] firstSample = new int[]{20,1,-1,2,-2,3,3,5,5,1,2,4,20,4,-1,-2,5};

        System.out.println(findIt(firstSample));
    }

    public static int findIt(int[] a) {
        int odd = a[0];

        HashMap<Integer, Integer> numbersAndTheirFrequency = new HashMap<>();
        for (int number : a) {
            if (!numbersAndTheirFrequency.containsKey(number)) {
                numbersAndTheirFrequency.put(number, 1);
            } else {
                numbersAndTheirFrequency.put(number, numbersAndTheirFrequency.get(number) + 1);
            }
        }

        for (Map.Entry<Integer, Integer> set : numbersAndTheirFrequency.entrySet()) {
            if (numbersAndTheirFrequency.get(set.getKey()) % 2 != 0) {
                odd = set.getKey();
            }
        }

        return odd;
    }
}
