package seminar2Hw;

/*
 Я выбрала процедурное программирование, так как в данной задаче
 используется простой цикл for для обхода всех чисел от 1 до n и
 выполнения умножения. Код выполняет серию последовательных инструкций
 для достижения конкретной цели - вывода на экран таблицы умножения всех
  чисел от 1 до n. */


import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите число n: ");
        int n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(i + "*" +j + "=" + i*j + "\t");
            }
            System.out.println();
        }
    }
}



