package seminar1Hw;

import java.util.Arrays;

public class DeclarativeSortNumbers {

    public static void main(String[] args) {
        int[] numbers = {5, 2, 8, 3, 1, 6, 4, 7};

        Arrays.stream(numbers)
                .boxed()
                .sorted((num1, num2) -> num2 - num1)
                .mapToInt(Integer::intValue)
                .toArray();

        System.out.println("Отсортированный список в порядке убывания: " + Arrays.toString(numbers));
    }
}