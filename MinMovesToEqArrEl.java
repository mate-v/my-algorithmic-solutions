import java.util.Arrays;
/*
https://leetcode.com/problems/minimum-moves-to-equal-array-elements/
*/
class MinMovesToEqArrEl {
    public static void main(String[] args) {
        System.out.println(minMoves1(new int[]{1, 1000000000}));
        //System.out.println(minMoves1(new int[]{1, 2}));
        //System.out.println(minMoves1(new int[]{1, 2, 3}));
        //System.out.println(minMoves2(new int[]{1, 2, 3}));
    }

    public static int minMoves1(int[] nums) {
        int counter = 0;
        Arrays.sort(nums);
        boolean equivalent = false;

        if (nums[0] == nums[nums.length - 1]) {
            return counter;
        }

        int indexOf = nums[nums.length - 1];

        while (!equivalent) {
            equivalent = true;

            for (int i = nums.length - 1; i > 0; i--) {
                if (nums[i - 1] != nums[i]) {
                    equivalent = false;
                    if (nums[i] > nums[i - 1]) {
                        indexOf = i;
                    } else {
                        indexOf = i - 1;
                    }
                }
            }

            for (int i = 0; i < nums.length; i++) {
                if (i != indexOf) {
                    nums[i]++;
                }
            }

            if (!equivalent) {
                counter++;
            }
        }

        return counter;
    }

    public static int minMoves2(int[] nums) {
        int counter = 0;
        Arrays.sort(nums);
        boolean equivalent = false;

        if (nums[0] == nums[nums.length - 1]) {
            return counter;
        }

        int highest = nums[nums.length - 1];
        int indexOfHighest = nums.length - 1;

        while (!equivalent) {
            equivalent = true;

            for (int i = nums.length - 1; i > 0; i--) {
                if (nums[i] != nums[i - 1]) {
                    equivalent = false;
                    break;
                }
            }

            if (!equivalent) {
                for (int i = 0; i < nums.length; i++) {
                    if (nums[i] > highest) {
                        highest = nums[i];
                        indexOfHighest = i;
                        break;
                    }
                }

                if (indexOfHighest != 0) {
                    for (int i = 0; i < indexOfHighest; i++) {
                        nums[i]++;
                    }
                    if (indexOfHighest != nums.length - 1) {
                        for (int i = indexOfHighest + 1; i < nums.length; i++) {
                            nums[i]++;
                        }
                    }
                } else {
                    for (int i = 1; i < nums.length; i++) {
                        nums[i]++;
                    }
                }
                counter++;
            }

        }

        return counter;
    }

    public static int minMoves3(int[] nums) {
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
