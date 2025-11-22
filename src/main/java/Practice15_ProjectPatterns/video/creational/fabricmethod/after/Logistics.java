package Practice15_ProjectPatterns.video.creational.fabricmethod.after;

/**
 * Класс для управления логистикой доставок
 */

public abstract class Logistics {
    // * класс спрячет функциональность под разные способы доставки
    // внутри храниться транспорт

    abstract Transport createTransport();
        // это фабричный метод, так как он реализует способ создания транспорта

    public void planDelivery() {
        Transport transport = createTransport();
        transport.deliver();
    }
}