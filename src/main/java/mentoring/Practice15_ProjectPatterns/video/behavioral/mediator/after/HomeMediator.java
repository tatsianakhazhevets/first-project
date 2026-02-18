package mentoring.Practice15_ProjectPatterns.video.behavioral.mediator.after;

public class HomeMediator implements Mediator{

    private Light light;
    private Alarm alarm;
    private Thermostat thermostat;

    public HomeMediator(Light light, Alarm alarm, Thermostat thermostat) {
        this.light = light;
        this.alarm = alarm;
        this.thermostat = thermostat;
    }

    @Override
    public void notify(Object sender, String event) {
       // если событие утро
        if(event.equals("morning")) {
            // если отправитель не свет, то включаем свет
            if(!(sender instanceof Light)) {
                light.turnOn();
                alarm.deactivate();
            }
            thermostat.setTemperature(22);

            // если событие вечер
        } else {
            // если отправитель не сигнализация, то активируем сигнализацию и выключаем свет
            if (!(sender instanceof Alarm)) {
                alarm.activate();
                light.turnOff();
            }
        }
    }
}