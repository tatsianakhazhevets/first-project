package mentoring.Practice15_ProjectPatterns.video.structural.adapter.after;

public class Main {
    public static void main(String[] args) {
        FahrenheitThermometer fThermometer = new FahrenheitThermometer();
        WeatherApp app = new WeatherApp();

        // Проблема: FahrenheitThermometer возвращает значение в Фаренгейтах
        //double fTemp = fThermometer.getFahrenheitThermometer();
        //double eTemp = (fTemp - 32) * 5.0 / 9.0; // преобразование в Цельсий
        // убираем это, так как формула добавилась в адаптер

        CelsuisAdapter celsuisAdapter = new CelsuisAdapter(fThermometer);

        //app.printTemperature(eTemp); // Неудобно и повторяющееся преобразование
        app.printTemperature(celsuisAdapter.getCelsuis());
    }
}