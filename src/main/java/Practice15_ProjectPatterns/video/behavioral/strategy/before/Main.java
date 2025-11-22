package Practice15_ProjectPatterns.video.behavioral.strategy.before;

public class Main {
    public static void main (String[] args) {
        Navigator navigator = new Navigator("fastest");
        navigator.buildRoute();
    }}