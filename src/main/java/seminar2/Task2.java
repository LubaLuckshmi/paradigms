package seminar2;

public class Task2 {

    //Я выбрала для решения данной задачи процедурную
    // парадигму, так как задача не требует создания
    // каких-то сложных структур данных или использования
    // объектно-ориентированного подхода.


        public static String convertToBase(int number, int base) {
            if (base < 2 || base > 36) {
                return "Invalid base";
            }

            return Integer.toString(number, base);
        }

        public static void main(String[] args) {
            int decimalNumber = 10;
            int base = 8;
            String result = convertToBase(decimalNumber, base);
            System.out.println("Number " + decimalNumber + " in base " + base + " is: " + result);
        }
    }



