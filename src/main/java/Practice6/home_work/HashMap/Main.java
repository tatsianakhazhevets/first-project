package Practice6.home_work.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap1_2_3 hashMap1 = new HashMap1_2_3();
        hashMap1.addNameAndAge("Петя", 30);
        hashMap1.addNameAndAge("Таня", 16);
        hashMap1.addNameAndAge("Коля", 17);
        hashMap1.addNameAndAge("Сеня", 16);
        hashMap1.addNameAndAge("Катя", 18);

        // hashMap1.printHashMapOne();

        // hashMap1.checkName();

        hashMap1.printUnderage(hashMap1.getHashMapOne());


    }
}
