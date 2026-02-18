package mentoring.Practice5.HomeWork.ThreeDish;

public class Main {
    public static void main(String[] args) {
        Dish borsch = new Dish("Борщ");
        Dish steak = new HotDish("Стейк");
        Dish compote = new Drink("Компот");

        Menu menu = new Menu();

        menu.addDishDescription(borsch);
        menu.addDishDescription(steak);
        menu.addDishDescription(compote);


    }
}
