package Practice5.taskTransport;

public class Main {
    public static void main(String[] args) {
        Transport car = new Car();
        // просто транспорт создать нельзя, так как он абстрактный, можно создать одного из наследникв
        //по умолчанию к машине присвоется спид и капасити
        Transport ship = new Ship();
        Transport plane = new Plan();

        Dispatcher dispatcher = new Dispatcher();

        dispatcher.control(car);
        dispatcher.printTransportDetails(car);

        dispatcher.control(ship);
        dispatcher.printTransportDetails(ship);

        dispatcher.control(plane);
        dispatcher.printTransportDetails(plane);
    }
}

// SOLID - принцип проектирования = L Барбара Лисков = принцип подстановки = это замена родителя и наследника
// нужно, чтобы структура создания объекта всегда была одинаковой = одинаковый конструктор у родителя и наследника