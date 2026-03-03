package assignment;
import java.util.Arrays;
import static hint.SortingMethods.*;

/**
 * Implements insertion sort from lecture.
 */

public class InsertionSort {
    static void main() {
        //for testing
        int[] arr = {5, 4, 3, 2, 1};
        sort(arr);
        IO.println(Arrays.toString(arr));
    }

    static void sort(int[] arr) {
        int n = arr.length;
        int i,j,key;

        for (i = 1; i < n; i++) {
            key = arr[i]; // Pick the element to insert;
            j = i -1; // Start comparing with previous elements;

            while (j >= 0 && arr[j] > key) {
                arr[j+1] = arr[j];
                j = j - 1;
            }
            arr[j+1] = key;
        }
    }
}
