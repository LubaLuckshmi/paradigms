package seminar1.task01;

// императивный стиль
class ImperativeSearch {

    public static boolean contains(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int target = 3;
        if (contains(array, target)) {
            System.out.println("Target " + target + " is in the array");
        } else {
            System.out.println("Target " + target + " is not in the array");
        }
    }

}

  /*  Эта функция принимает массив целых чисел и целевое число в качестве параметров и
        использует цикл for для перебора всех элементов массива. Если целевое число найдено
        в массиве, функция возвращает true, в противном случае - false.*/
