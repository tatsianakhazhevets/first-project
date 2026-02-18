package mentoring.Practice6.cost_counter_ArrayList;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

public class CostCounter {
    // хранение - массив, индекс = месяц
    private ArrayList<Double> costPerMonth;
    // инициализация через конструктор (как вариант)
    public CostCounter() {
        this.costPerMonth = new ArrayList<>();
    }

    // метод по добавлению значения по номеру месяца (от 1 до 12) и расходам в этот месяц
    public void addCost(int month, Double costs) {
        costPerMonth.add(month-1, costs);
    }

    // метод получения значения расхода по месяцу
    public Double getCosts(int month) {
        return costPerMonth.get(month-1);
    }

    // считать минимальный расход за месяц
//    public Double minCostsPerMonth () {
//        //AtomicReference<Double> min = new AtomicReference<>(costPerMonth.getFirst());
//        costPerMonth.forEach(
//                costPerMonth -> {
//                    if (costPerMonth < min.get()) {
//                        min.set(costPerMonth);
//                    }
//                }
//        );
//        return min.get();
//    }
}
