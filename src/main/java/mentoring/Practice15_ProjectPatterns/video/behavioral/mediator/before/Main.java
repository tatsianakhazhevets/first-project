package mentoring.Practice15_ProjectPatterns.video.behavioral.mediator.before;

public class Main {
    public static void main(String[] args) {
        Light light = new Light();
        Alarm alarm = new Alarm();
        Thermostat thermostat = new Thermostat();

        // Представим, что у нас есть сложный сценарий, где эти устройства взаимодействуют:
        light.turnOn();
        alarm.activate();
        thermostat.setTemperature(22);
    }
}