package Practice14_ProgramPrinciples.homework.Task_2.after;

public class DiscountCalculator {
    public double calculateDiscount(double price, boolean isLoyalCustomer, boolean isFirstPurchase, boolean hasCoupon) {

        double tenPercentDiscount = 0.9;
        double fivePercentDiscount = 0.95;
        double sevenPercentDiscount = 0.93;
        double twoPercentDiscount = 0.98;

        double discount = isLoyalCustomer ?
                (isFirstPurchase ? tenPercentDiscount : fivePercentDiscount) :
                (hasCoupon ? sevenPercentDiscount : twoPercentDiscount);

        return price * discount;
    }
}