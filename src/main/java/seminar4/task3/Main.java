package seminar4.task3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static List<Integer> findDuplicates(List<Integer> list) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> duplicates = new ArrayList<>();
        for (int i : list) {
            if (map.containsKey(i)) {
                int count = map.get(i);
                map.put(i, count + 1);
            } else {
                map.put(i, 1);
            }
        }

        for (int i : list) {
            if (map.get(i) > 1 && !duplicates.contains(i)) {
                duplicates.add(i);
            }
        }
        return duplicates;
    }

    public static void main(String[] args) {
        List<Integer> inputList = List.of(1, 2, 2, 5, 5, 5, 7, 7, 7);
        List<Integer> duplicates = findDuplicates(inputList);
        System.out.println(duplicates);
    }
}
