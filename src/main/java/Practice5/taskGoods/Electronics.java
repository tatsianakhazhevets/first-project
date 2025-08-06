package Practice5.taskGoods;

public class Electronics extends Item{
    private final static int DEFAULT_GUARANTEE = 2; // константа
    private int guaranted;

    public Electronics(String name, double price, int count) {
        super(name, price, count);
        this.guaranted = DEFAULT_GUARANTEE;
    }
    // в ребенке такой же конструктор как в родителе, с такой же сигнатурой
    // дефолтный конструктор и конструктор с набором аргументов

    public int getGuaranted() {
        return guaranted;
    }

    @Override
    public void print() {
        super.print();
        System.out.println(", гарантия " + this.guaranted + " года");
    }

}

