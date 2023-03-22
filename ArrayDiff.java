import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayDiff {
    public static void main(String[] args) {
        int[] sample1 = {1, 2, 2, 2, 3, 4};
        int[] sample2 = {2, 4};

        int[] sample3 = {1, 2};
        int[] sample4 = {1};

        System.out.println(Arrays.toString(difference(sample1, sample2)));
        System.out.println(Arrays.toString(difference(sample3, sample4)));
    }

    public static int[] difference(int[] arr1, int[] arr2) {
        List<Integer> resultList = new ArrayList<>();
        List<Integer> removeThese = new ArrayList<>();


        for (int i : arr1) {
            resultList.add(i);
            if (!removeThese.contains(i)) {
                for (int j : arr2) {
                    if (i == j && !removeThese.contains(j)) {
                        removeThese.add(j);
                        break;
                    }
                }
            }
        }

        resultList.removeAll(removeThese);

        int[] resultArr = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            resultArr[i] = resultList.get(i);
        }

        return resultArr;
    }
}
