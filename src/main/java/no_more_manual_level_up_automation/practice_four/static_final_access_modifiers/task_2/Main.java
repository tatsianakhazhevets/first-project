package no_more_manual_level_up_automation.practice_four.static_final_access_modifiers.task_2;

public class Main {
    public static void main(String[] args) {

        double circleAreaForRadiusFive = MathConstants.calculateCircleArea(5);
        double circleCircumferenceForRadiusFive = MathConstants.calculateCircumference(5);
        System.out.println("Result with radius 5:" +
                "\nCircle Area is " + circleAreaForRadiusFive +
                " and Circle Circumference is " + circleCircumferenceForRadiusFive);

        double circleAreaForRadiusTwo = MathConstants.calculateCircleArea(2);
        double circleCircumferenceForRadiusTwo = MathConstants.calculateCircumference(2);
        System.out.println("Result with radius 2:" +
                "\nCircle Area is " + circleAreaForRadiusTwo +
                " and Circle Circumference is " + circleCircumferenceForRadiusTwo);

        double circleAreaForRadiusTen = MathConstants.calculateCircleArea(10);
        double circleCircumferenceForRadiusTen = MathConstants.calculateCircumference(10);
        System.out.println("Result with radius 10:" +
                "\nCircle Area is " + circleAreaForRadiusTen +
                " and Circle Circumference is " + circleCircumferenceForRadiusTen);
    }
}