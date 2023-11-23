package seminar1.task02;

import java.util.Arrays;

public class DeclarativeStat {
    public static void main(String[] args) {
        int[] arr = {1, -2, 3, 0, -4, 5};
        long positiveCount = Arrays.stream(arr).filter(num -> num > 0).count();
        long zeroCount = Arrays.stream(arr).filter(num -> num == 0).count();
        long negativeCount = Arrays.stream(arr).filter(num -> num < 0).count();

        double total = arr.length;

        double positivePercentage = (positiveCount / total) * 100;
        double zeroPercentage = (zeroCount / total) * 100;
        double negativePercentage = (negativeCount / total) * 100;

        System.out.println("Доля позитивных чисел: " + positivePercentage + "%");
        System.out.println("Доля нулей: " + zeroPercentage + "%");
        System.out.println("Доля отрицательных чисел: " + negativePercentage + "%");
    }
}

