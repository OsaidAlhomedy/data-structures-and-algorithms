/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package mergeSort;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {
  @Test
  void sortMergeTesting() {
    Library classUnderTest = new Library();

    // Happy Path
    int[] array = {8, 4, 23, 42, 16, 15};
    int[] arraySorted = {4, 8, 15, 16, 23, 42};

    assertNotEquals(Arrays.toString(arraySorted), Arrays.toString(array));

    classUnderTest.mergeSort(array);

    assertEquals(Arrays.toString(arraySorted), Arrays.toString(array));

    // Less used

    int[] arrayLU = {8, 100, -4, 0, 3, 3};
    int[] arrayLUSorted = {-4, 0, 3, 3, 8, 100};

    assertNotEquals(Arrays.toString(arrayLUSorted), Arrays.toString(arrayLU));

    classUnderTest.mergeSort(arrayLU);

    assertEquals(Arrays.toString(arrayLUSorted), Arrays.toString(arrayLU));

    // Edge Cases
    int[] arrayEC = {8};
    int[] arrayECSorted = {8};

    assertEquals(Arrays.toString(arrayEC), Arrays.toString(arrayECSorted));

    classUnderTest.mergeSort(arrayEC);

    assertEquals(Arrays.toString(arrayEC), Arrays.toString(arrayECSorted));

  }
}
