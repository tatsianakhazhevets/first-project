package mentoring.Practice5.taskGoods;

public class Item implements Printable {
    // этот класс уже будет неабстрактный
    // есть неизменяемые данные для всех детей, которые сразу прайвет

    private String name;
    private double price;
    private int count;
    // все поля


    public Item(String name, double price, int count){
        this.name = name;
        this.price = price;
        this.count = count;
    }
    //конструктор
    //в теле присваиваем в поля

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getCount() {
        return count;
    }

    // геттеры

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public void print() {
        System.out.print("Мой товар: имя"
        + this.name + ", цена " + this.price + ", количество на складе " + this.count);
    }

    // сеттер для изменяемой переменной
}
