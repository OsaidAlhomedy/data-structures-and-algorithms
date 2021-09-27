import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(insertShiftArray(new int[] { 2, 4, 6, -8 }, 5)));
        System.out.println(Arrays.toString(insertShiftArray(new int[] { 42, 8, 15, 23, 42 }, 16)));

    }



    public static int[] insertShiftArray(int[] array, int newValue) {

        int[] newArray = new int[array.length + 1];
        int placement = array.length % 2 == 0 ? (array.length) / 2 : ((array.length) / 2) + 1;

        for (int i = 0; i < newArray.length; i++) {
            if (i == placement) {
                newArray[i] = newValue;
            } else if (i < placement) {
                newArray[i] = array[i];
            } else if (i > placement) {
                newArray[i] = array[i - 1];
            }
        }
        return newArray;

    }


    
}