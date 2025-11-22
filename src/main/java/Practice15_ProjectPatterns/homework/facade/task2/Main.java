package Practice15_ProjectPatterns.homework.facade.task2;

public class Main {
    public static void main(String[] args) {
        Light light = new Light();
        AirConditioning airConditioning = new AirConditioning();
        SecuritySystem securitySystem = new SecuritySystem();

        SmartHomeFacade smartHomeFacade = new SmartHomeFacade(light, airConditioning, securitySystem);
        smartHomeFacade.onSmartHome();
        smartHomeFacade.offSmartHome();
    }
}