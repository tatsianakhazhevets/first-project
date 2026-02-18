package mentoring.Practice6.home_work.HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMap1_2_3 {
    private HashMap<String, Integer> hashMapOne;

    public HashMap1_2_3() {
        this.hashMapOne = new HashMap<>();
    }

    public void addNameAndAge(String name, Integer age) {
        hashMapOne.put(name, age);
    }

    public void printHashMapOne() {
        System.out.println("HashMap Task One: ");
        hashMapOne.entrySet().forEach((Map.Entry<String, Integer> entry) -> {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("Имя: " + key + ", возраст: " + value);
        });
    }

    public void checkName() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите имя: ");
        String name = scanner.nextLine();

        if (hashMapOne.containsKey(name)) {
            System.out.println("Найдено");
        } else {
            System.out.println("Не найдено");
        }
    }

    public void printUnderage(Map<String, Integer> map) {
        for (Map.Entry<String, Integer> entry : hashMapOne.entrySet()) {
            String name = entry.getKey();
            Integer age = entry.getValue();
            if (age < 18) {
                System.out.println("Имя: " + name + ", возраст: " + age);
            }
        }
    }

    public Map<String, Integer> getHashMapOne() {
        return hashMapOne;
    }
}
