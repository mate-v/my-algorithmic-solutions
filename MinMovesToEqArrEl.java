import java.util.Arrays;
/*
https://leetcode.com/problems/minimum-moves-to-equal-array-elements/
*/
class MinMovesToEqArrEl {
     public static int minMoves(int[] nums) {
        int counter = 0;

        HashMap<Integer, Integer> hMap = new HashMap<Integer, Integer>();
        int highest = Integer.MAX_VALUE;

        while (hMap.size() != 1) {

            for (int i : nums) {
                if (hMap.containsKey(i)) {
                    hMap.put(i, hMap.get(i) + 1);
                } else {
                    hMap.put(i, 1);
                }
            }

            if (hMap.size() == 1) {
                return counter;
            }

            Arrays.sort(nums);

            if ((hMap.size() == 2) && (hMap.get(nums[nums.length - 1]) == 1)) {
                highest = nums[nums.length - 1];
            }

            hMap.clear();

            for (int i = 0; i < nums.length - 1; i++) {
                if ((nums[i] < highest)) {
                    nums[i] += 1;
                }
            }

            counter++;
        }

        return counter;
    }
}
