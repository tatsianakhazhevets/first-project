package Practice6.home_work.ArrayDeque;

public class Main {
    public static void main(String[] args) {
        // ArrayDeque1 arrayDeque1 = new ArrayDeque1();

        // arrayDeque1.addColor("Белый");
        // arrayDeque1.addColor("Желтый");
        // arrayDeque1.addColor("Розовый");
        // arrayDeque1.addColor("Синий");
        // arrayDeque1.addColor("Зеленый");

        // arrayDeque1.printArrayDequeOne1();

        // arrayDeque1.printArrayDequeOne2();

        // ArrayDeque2 arrayDeque2 = new ArrayDeque2();

        // arrayDeque2.addNumbersInStack(5);
        // arrayDeque2.addNumbersInStack(4);
        // arrayDeque2.addNumbersInStack(3);
        // arrayDeque2.addNumbersInStack(2);
        // arrayDeque2.addNumbersInStack(1);

        // arrayDeque2.printArrayDequeTwo();

        ArrayDeque3 arrayDeque3 = new ArrayDeque3();

        arrayDeque3.addFirstInArrayDequeThree(5);
        arrayDeque3.addFirstInArrayDequeThree(4);
        arrayDeque3.addFirstInArrayDequeThree(3);
        arrayDeque3.addFirstInArrayDequeThree(2);
        arrayDeque3.addFirstInArrayDequeThree(1);

        arrayDeque3.addLastInArrayDequeThree(6);
        arrayDeque3.addLastInArrayDequeThree(7);
        arrayDeque3.addLastInArrayDequeThree(8);
        arrayDeque3.addLastInArrayDequeThree(9);
        arrayDeque3.addLastInArrayDequeThree(10);

        arrayDeque3.printArrayDequeThree();

        System.out.println();

        arrayDeque3.removeFirstInArrayDequeThree();
        System.out.println();
        arrayDeque3.printArrayDequeThree();

        System.out.println();

        arrayDeque3.removeLastInArrayDequeThree();
        System.out.println();
        arrayDeque3.printArrayDequeThree();




    }
}
