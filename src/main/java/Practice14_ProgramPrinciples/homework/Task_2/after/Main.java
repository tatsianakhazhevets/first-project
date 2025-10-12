package Practice14_ProgramPrinciples.homework.Task_2.after;

public class Main {
    public static void main(String[] args) {
        DiscountCalculator discountCalculator = new  DiscountCalculator();

        System.out.println(discountCalculator.calculateDiscount(1000, true, true, false)); // 10% discount
        System.out.println(discountCalculator.calculateDiscount(1000, true, false, false)); // 5% discount
        System.out.println(discountCalculator.calculateDiscount(1000, false, false, true)); // 7% discount
        System.out.println(discountCalculator.calculateDiscount(1000, false, false, false)); // 2% discount
    }
}
