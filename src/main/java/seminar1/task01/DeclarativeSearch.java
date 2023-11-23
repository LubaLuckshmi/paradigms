package seminar1.task01;

import java.util.Arrays;

public class DeclarativeSearch {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5};
        int target = 3;
        if (Arrays.stream(array).anyMatch(num -> num == target)) {
            System.out.println("Target " + target + " is in the array");
        } else {
            System.out.println("Target " + target + " is not in the array");
        }
    }

}
