package seminar4.task2;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> people = new HashMap<>();
        people.put("Иван", 25);
        people.put("Мария", 31);
        people.put("Петр", 40);
        people.put("Елена", 20);
        people.put("Алексей", 55);
        people.put("Ольга", 30);
        people.put("Дмитрий", 35);

        // Вызываем метод filterByAgeAndName и передаем в него мап с данными о людях и число 30
        int result = filterByAgeAndName(people, 30);

        // Выводим результат
        System.out.println("Количество людей старше 30 лет: " + result);
    }

    public static int filterByAgeAndName(HashMap<String, Integer> people, int age) {
        int count = 0;

        // Проходим по каждому человеку в мапе
        for (String person : people.keySet()) {
            // Если возраст человека больше указанного возраста, увеличиваем счетчик
            if (people.get(person) > age) {
                count++;
            }
        }

        return count;
    }
}


  //  Этот скрипт создает HashMap с данными о людях (имя, возраст)
//  и затем вызывает метод filterByAgeAndName, передавая ему мап с
//  данными о людях и число 30. Метод filterByAgeAndName перебирает
//  каждого человека в мапе и увеличивает счетчик, если его возраст
//  больше указанного числа. В конце он возвращает общее количество
//  людей старше указанного возраста.