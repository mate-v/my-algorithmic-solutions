import java.util.*;
/*
TODO Description needed!
*/
public class Listing{

    public static void main(String []args){
        System.out.println(listing(new int[]{1, 2, 3, 4, 5, 6}, 11));
        System.out.println(listing(new int[]{1, 2, 3, 4, 5}, 1));
        System.out.println(listing(new int[]{1, 2, 3, 4, 5}, 3));

    }

    public static boolean listing(int[] arr, int n) {
        List<Integer> list = new ArrayList<>();
        int i = 0;

        while (list.size() != arr.length) {
            if (i > arr.length - 1) {
                i -= arr.length;
            }

            if (!list.contains(i)) {
                list.add(i);
            } else {
                return false;
            }

            i += n - ((n / arr.length) * arr.length);
        }

        return true;
    }
  
    //needs revision
    public static boolean listing2(int[] arr, int incr) {

        List<Integer> list = new ArrayList<>();

        for (int k : arr) {
            list.add(k);
        }

        int i = 0;

        do {

            if (i > arr.length - 1) {
                i -= arr.length;
            }

            if (!list.contains(arr[i])){
                return false;
            } else {
                list.remove((Integer) arr[i]);
                /* same as:
                int removeThisNumber = list.indexOf(arr[i]);
                list.remove(removeThisNumber);
                 */
            }

            i+= incr;

        } while (list.size() != 0);

        return true;
    }

}
