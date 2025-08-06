package Practice6.cost_counter_ArrayList;

public class Main {
    public static void main(String[] args) {
        CostCounter costCounter = new CostCounter();
        // при его создании сразу создастся структура данных
        costCounter.addCost(1,123.12);
        costCounter.addCost(2,1233.2);
        costCounter.addCost(3,3737.1);
        costCounter.addCost(4,344.2);
        costCounter.addCost(5,1233.2);

        System.out.println(costCounter.getCosts(3));
       // System.out.println(costCounter.minCostsPerMonth());


    }
}
