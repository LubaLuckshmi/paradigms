package seminar1.task02;


public class ImperativeStat {

    public static void main(String[] args) {
        int[] arr = {1, -2, 3, 0, -4, 5};
        int positiveCount = 0;
        int zeroCount = 0;
        int negativeCount = 0;

        for (int num : arr) {
            if (num > 0) {
                positiveCount++;
            } else if (num == 0) {
                zeroCount++;
            } else {
                negativeCount++;
            }
        }


        double positivePercentage = (positiveCount / arr.length) * 100;
        double zeroPercentage = (zeroCount / arr.length) * 100;
        double negativePercentage = (negativeCount / arr.length) * 100;

        System.out.println("Доля позитивных чисел: " + positivePercentage + "%");
        System.out.println("Доля нулей: " + zeroPercentage + "%");
        System.out.println("Доля отрицательных чисел: " + negativePercentage + "%");
    }
}


