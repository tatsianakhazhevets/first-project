package mentoring.Practice8.HomeWork.task_5;

public class Main {
    public static void main(String[] args) {
        Box<String> boxString = new Box<>();
        boxString.setElement("Элемент один");
        System.out.println(boxString.getElement());

        Box<Integer> boxInteger = new Box<>();
        boxInteger.setElement(1);
        System.out.println(boxInteger.getElement());

    }
}
