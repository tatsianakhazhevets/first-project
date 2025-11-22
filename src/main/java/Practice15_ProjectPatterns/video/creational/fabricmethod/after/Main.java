package Practice15_ProjectPatterns.video.creational.fabricmethod.after;

public class Main {
    public static void main(String[] args) {
        // Transport transport; -> убираем транспорт и используем новый уровень абстракции - логистика
        Logistics logistics;
        String transportType = "ship";  // Тип может быть основан на входных данных или конфигурации

        // код был открыт к расширению и закрыт к модификации
        if("truck".equals(transportType)) {
            //transport = new Truck();               // захардкожено
            logistics = new LandLogistics();         // делегирование создани фабричному методу createTransport()
        } else if("ship".equals(transportType)) {
            //transport = new Ship();                 // захардкожено
            logistics = new SeaLogistic();           // делегирование создани фабричному методу createTransport()
        } else {
            //transport = new Plane();               // захардкожено
            logistics = new LandLogistics();        // делегирование создани фабричному методу createTransport()
        }

        // как сделать новый уровень абстракции и кому-то делегировать способ создания транспорта
        // ответ - внедрить фабричный метод по созданию транспорта
        // создаем еще один уровень абстракции - class Logistic

        //transport.deliver();
        logistics.planDelivery();
    }
}
