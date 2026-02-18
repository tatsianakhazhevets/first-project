package mentoring.Practice15_ProjectPatterns.homework.builder.task1;

public class Order {
    private String item;
    private int discount;
    private String payment;

    public Order(String item, int discount, String payment) {
        this.item = item;
        this.discount = discount;
        this.payment = payment;
    }

    public Order(Builder builder) {
        this.item = builder.item;
        this.discount = builder.discount;
        this.payment = builder.payment;
    }

    @Override
    public String toString() {
        return "Order: item " + item + ", discount " + discount + ", payment " + payment;
    }

    public static class Builder {
        private String item;
        private int discount;
        private String payment;

        public Builder setItem(String item) {
            this.item = item;
            return this;
        }

        public Builder setDiscount(int discount) {
            this.discount = discount;
            return this;
        }

        public Builder setPayment(String payment) {
            this.payment = payment;
            return this;
        }

        public Order build() {
            return new Order(this);
        }
    }
}