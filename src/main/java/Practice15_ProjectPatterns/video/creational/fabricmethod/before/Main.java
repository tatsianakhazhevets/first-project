package Practice15_ProjectPatterns.video.creational.fabricmethod.before;

public class Main {
    public static void main(String[] args) {
        Transport transport;
        String transportType = "ship";  // Тип может быть основан на входных данных или конфигурации

        // код был открыт к расширению и закрыт к модификации
        if("truck".equals(transportType)) {
            transport = new Truck();               // захардкожено
        } else if("ship".equals(transportType)) {
            transport = new Ship();                 // захардкожено
        } else {
            transport = new Plane();               // захардкожено
        }

        // как сделать новый уровень абстракции и кому-то делегировать способ создания транспорта
        // ответ - внедрить фабричный метод по созданию транспорта

        transport.deliver();
    }
}
