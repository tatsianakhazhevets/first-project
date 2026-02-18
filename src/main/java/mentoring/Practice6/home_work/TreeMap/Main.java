package mentoring.Practice6.home_work.TreeMap;

public class Main {
    public static void main(String[] args) {
        TreeMap1_2 treeMap1 = new TreeMap1_2();

        treeMap1.addNameWithGrade("Виталий", 6);
        treeMap1.addNameWithGrade("Яна", 4);
        treeMap1.addNameWithGrade("Анна", 8);
        treeMap1.addNameWithGrade("Сергей", 9);
        treeMap1.addNameWithGrade("Борис", 10);

        // treeMap1.printTreeMapOne();

        treeMap1.minAndMapKey();
    }
}
