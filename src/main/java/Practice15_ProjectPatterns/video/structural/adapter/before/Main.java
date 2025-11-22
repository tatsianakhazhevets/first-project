package Practice15_ProjectPatterns.video.structural.adapter.before;

public class Main {
    public static void main(String[] args) {
        FahrenheitThermometer fThermometer = new FahrenheitThermometer();
        WeatherApp app = new  WeatherApp();

        // Проблема: FahrenheitThermometer возвращает значение в Фаренгейтах
        double fTemp = fThermometer.getFahrenheitThermometer();
        double eTemp = (fTemp - 32) * 5.0 / 9.0; // преобразование в Цельсий

        app.printTemperature(eTemp); // Неудобно и повторяющееся преобразование
    }
}