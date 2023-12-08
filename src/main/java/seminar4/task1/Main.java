package seminar4.task1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        double[] array = {1, 2, 3, 4, 5};
        double[] normalizedArray = normalization(array);
        System.out.println(Arrays.toString(normalizedArray));
    }

    public static double[] normalization(double[] array) {
        double min = array[0];
        double max = array[0];

        // Находим минимальное и максимальное значение в массиве
        for (double value : array) {
            if (value < min) {
                min = value;
            }
            if (value > max) {
                max = value;
            }
        }

        // Нормализуем каждый элемент массива
        for (int i = 0; i < array.length; i++) {
            array[i] = (array[i] - min) / (max - min);
        }

        return array;
    }
}