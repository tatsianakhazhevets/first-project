package mentoring.Practice15_ProjectPatterns.homework.facade.task2;

public class SmartHomeFacade {
    private Light light;
    private AirConditioning airConditioning;
    private SecuritySystem securitySystem;

    public SmartHomeFacade(Light light, AirConditioning airConditioning, SecuritySystem securitySystem) {
        this.light = light;
        this.airConditioning = airConditioning;
        this.securitySystem = securitySystem;
    }

    public void onSmartHome() {
        light.on();
        airConditioning.on();
        securitySystem.on();
    }

    public void offSmartHome() {
        light.off();
        airConditioning.off();
        securitySystem.off();
    }
}