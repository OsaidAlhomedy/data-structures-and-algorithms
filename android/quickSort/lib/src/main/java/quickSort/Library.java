/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package quickSort;

import java.util.Arrays;

public class Library {

  public static void main(String[] args) {
    int[] array = {8, 4, 23, 42, 16, 15};
    QuickSort(array, 0, 5);
    System.out.println(Arrays.toString(array));
  }

  public static void QuickSort(int[] array, int left, int right) {

    if (left < right) {
      int position = Partation(array, left, right);

      QuickSort(array, left, position - 1);

      QuickSort(array, position, right);
    }

  }

  public static int Partation(int[] array, int left, int right) {

    int pivot = array[right];
    int low = left - 1;

    for (int i = left; i < right; i++) {
      if (array[i] <= pivot) {
        low++;
        Swap(array, i, low);
      }
    }

    Swap(array, right, low + 1);
    return low + 1;
  }

  public static void Swap(int[] array, int i, int low) {
    int temp = array[i];
    array[i] = array[low];
    array[low] = temp;
  }


}
