package Practice5.taskTransport;

public class Dispatcher {

    // передаем транспорт (как бы любой) в аргументах
    public void control(Transport transport) {
        transport.start();
    }

    public void printTransportDetails(Transport transport) {
        System.out.println("Скорость транспорта: " + transport.getSpeed());
        System.out.println("Вместимость транспорта: " + transport.getCapacity());
    }
}