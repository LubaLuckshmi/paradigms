package seminar6.task3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[] { 5,2,5,72,4376,34524,9};
        System.out.println(Arrays.toString(mergeSort(arr)));
    }

    public static int[] mergeSort(int[] array) {
        if (array.length == 1){
            return array;
        }
        int half = array.length/2;
        int[] left = Arrays.copyOfRange(array,0, half);
        int[] right = Arrays.copyOfRange(array, half, array.length);

        return merge(mergeSort(left),mergeSort(right));
    }

    public static int[] merge(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];

        int indexLeft = 0;
        int indexRight = 0;

        while (indexLeft < left.length && indexRight < right.length) {
            if (left[indexLeft] < right[indexRight]) {
                result[indexLeft + indexRight] = left[indexLeft];
                indexLeft += 1;
            } else {
                result[indexLeft + indexRight] = right[indexRight];
                indexRight += 1;
            }
        }
        for (int i = indexLeft; i < left.length; i++) {
            result[i + indexRight] = left[i];
        }
        for (int i = indexRight; i < right.length; i++) {
            result[i + indexLeft] = right[i];
        }
        return result;
    }
}
