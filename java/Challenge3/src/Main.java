public class Main {

    public static void main(String[] args) {

        System.out.println(binarySearch(new int[] { 0, 1, 2, 3, 4 }, 1));

    }

    public static int binarySearch(int[] array, int key) {

        int min = array[0];
        int max = array.length - 1;
        int i = -1;
        boolean validator = true;

        while (validator) {
            validator = false;

            int mid = (min + max) / 2;

            if (key == array[mid]) {
                i = mid;
            } else if (key < array[mid]) {
                max = mid - 1;
                validator = true;
            } else {
                min = mid + 1;
                validator = true;
            }
        }

        return i;

    }

}
