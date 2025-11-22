package Practice15_ProjectPatterns.video.structural.adapter.after;

public class CelsuisAdapter {

    private FahrenheitThermometer fahrenheitThermometer;

    public CelsuisAdapter(FahrenheitThermometer fahrenheitThermometer) {
        this.fahrenheitThermometer = fahrenheitThermometer;
    }

    public double getCelsuis() {
        double fTemp = fahrenheitThermometer.getFahrenheitThermometer();
        double eTemp = (fTemp - 32) * 5.0 / 9.0;
        return eTemp;
    }
}