package mentoring.Practice6.home_work.LinkedHashMap;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class LinkedHashMap2 {
    private LinkedHashMap<String, String> linkedHashMapTwo;

    public LinkedHashMap2() {
        this.linkedHashMapTwo = new LinkedHashMap<>();
    }

    public void addNameAndPhone(String name, String phone) {
        linkedHashMapTwo.put(name, phone);
    }

    public void printLinkedHashMapTwo() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите имя: ");
        String name = scanner.nextLine();

        if (linkedHashMapTwo.containsKey(name)) {
            String phone = linkedHashMapTwo.get(name);
            System.out.println("Номер телефон: " + phone);
        } else {
            System.out.println("Контакт не найден");
        }
    }
}
