import java.util.*;
// Returns {3, 3, 3, 5, 5, 7, 7, 2, 9}
// We sort by highest frequency to lowest frequency.
// If two elements have same frequency, we sort by increasing value.
public class DecreasingFrequency {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortByFrequency(new int[]{2, 3, 5, 3, 7, 9, 5, 3, 7})));
    }

    public static int[] sortByFrequency(int[] array) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (int j : array) {
            if (!hashMap.containsKey(j)) {
                hashMap.put(j, 1);
            } else {
                hashMap.put(j, hashMap.get(j) + 1);
            }
        }

        int maxKey = Integer.MIN_VALUE;
        int maxValue = Integer.MIN_VALUE;
        int index = 0;

        while (hashMap.size() != 0) {
            for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
                if (entry.getValue() > maxValue) {
                    maxValue = entry.getValue();
                    maxKey = entry.getKey();
                } else if ((entry.getValue() == maxValue) && (entry.getKey() < maxKey)) {
                    maxKey = entry.getKey();
                }
            }
            for (int i = 0; i < maxValue; i++) {
                array[index] = maxKey;
                index++;
            }
            hashMap.remove(maxKey);
            maxKey = Integer.MIN_VALUE;
            maxValue = Integer.MIN_VALUE;
        }

        return array;
    }
}
