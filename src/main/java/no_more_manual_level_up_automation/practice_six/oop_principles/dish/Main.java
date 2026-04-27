package no_more_manual_level_up_automation.practice_six.oop_principles.dish;

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        Dish hotDish = new HotDish("Borsch", 45);
        Dish drink = new Drink("Kompot", 250);
        menu.add(hotDish);
        menu.add(drink);
        menu.act();
    }
}