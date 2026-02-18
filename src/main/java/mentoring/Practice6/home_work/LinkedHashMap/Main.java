package mentoring.Practice6.home_work.LinkedHashMap;

public class Main {
    public static void main(String[] args) {
        // LinkedHashMap1 linkedHashMap1 = new LinkedHashMap1();

        // linkedHashMap1.addNameAndGrade("Маша", 10);
        // linkedHashMap1.addNameAndGrade("Саша", 5);
        // linkedHashMap1.addNameAndGrade("Женя", 8);
        // linkedHashMap1.addNameAndGrade("Катя", 2);
        // linkedHashMap1.addNameAndGrade("Петя", 6);

        // linkedHashMap1.printLinkedHashMapOne();

        // LinkedHashMap2 linkedHashMap2 = new LinkedHashMap2();
        // linkedHashMap2.addNameAndPhone("Катя", "11-22-11");
        // linkedHashMap2.addNameAndPhone("Миша", "22-22-22");
        // linkedHashMap2.addNameAndPhone("Денис", "33-33-33");
        // linkedHashMap2.addNameAndPhone("Артем", "44-44-44");
        // linkedHashMap2.addNameAndPhone("Дима", "55-55-55");

        // linkedHashMap2.printLinkedHashMapTwo();

        LinkedHashMap3 linkedHashMap3 = new LinkedHashMap3();

        linkedHashMap3.addPage("1", "One");
        linkedHashMap3.addPage("2", "Two");
        linkedHashMap3.addPage("3", "Three");
        linkedHashMap3.addPage("4", "Four");
        linkedHashMap3.addPage("5", "Five");
        linkedHashMap3.addPage("6", "Six");
        linkedHashMap3.addPage("7", "Seven");
        linkedHashMap3.addPage("8", "Eight");
        linkedHashMap3.addPage("9", "Nine");
        linkedHashMap3.addPage("10", "Ten");

        linkedHashMap3.printLinkedHashMapThree();

        linkedHashMap3.addPage("11", "Eleven");
        linkedHashMap3.printLinkedHashMapThree();

        linkedHashMap3.addPage("12", "Twelve");
        linkedHashMap3.printLinkedHashMapThree();
    }
}
