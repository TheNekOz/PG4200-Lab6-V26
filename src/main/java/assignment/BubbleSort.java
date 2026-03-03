package assignment;
import java.util.Arrays;
import static hint.SortingMethods.*;


/**
 * Implements bubble sort from lecture.
 */
public class BubbleSort {

  static void main() {
      //for testing
      int[] arr = {5, 4, 3, 2, 1};
      sort(arr);
      IO.println(Arrays.toString(arr));
  }

  static void sort(int[] arr) {
    int n = arr.length;
    int i,j,temp;

    for (i = 0; i < n; i++) {
      for (j = 0; j < n -1 - i; j++) {
        if (arr[j] > arr[j + 1]) {
            temp = arr[j];
            arr[j] = arr[j + 1];
            arr[j + 1] = temp;
        }
      }
    }
  }
}
