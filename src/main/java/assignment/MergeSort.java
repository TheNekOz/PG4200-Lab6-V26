package assignment;
import java.util.Arrays;
import static hint.SortingMethods.*;

/**
 * Implements merge sort from lecture.
 */

public class MergeSort {

    static void main() {
        //for testing
        int[] arr = {5, 4, 3, 2, 1};
        sort(arr);
        IO.println(Arrays.toString(arr));

    }
    public static void sort(int[] arr) {
        int n = arr.length;
        int[] left,right;
        int i,j,k;
        if (n > 1) {
            left = new int[n/2];
            right = new int[n - left.length];
            System.arraycopy(arr, 0, left, 0, left.length);
            System.arraycopy(arr, left.length, right, 0, right.length);
            sort(left);
            sort(right);


        }
    }





}
