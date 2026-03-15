package no_more_manual_level_up_automation.practice_three.static_final_access_modifiers.task_2;

public class MathConstants {

    private static final double PI = 3.14159;
    private static final double E = 2.71828;

    public static double calculateCircleArea(double radius) {
        return PI * radius * radius;
    }

    public static double calculateCircumference(double radius) {
        return 2 * PI * radius;
    }
}