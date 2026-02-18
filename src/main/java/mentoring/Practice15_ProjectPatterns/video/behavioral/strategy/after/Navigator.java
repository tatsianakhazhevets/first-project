package mentoring.Practice15_ProjectPatterns.video.behavioral.strategy.after;

public class Navigator {
    //private String strategy; - вместо переменной пишем интерфейс
    private RouteStrategy strategy;

    public Navigator(RouteStrategy strategy) {
        this.strategy = strategy;
    }

    //public void buildRoute() {
        // модифицируемым, не расширяемым
//        if(strategy.equals("fastest")) {
//            System.out.println("Building the fastest route.");
//        } else if (strategy.equals("economical")) {
//            System.out.println("Building the most economical route.");
//        } else if (strategy.equals("leastTurns")) {
//            System.out.println("Building the route with the least turns.");
//        } - и вместо всего это нужно всего лишь


    public void setStrategy(RouteStrategy strategy) {
        this.strategy = strategy;
    }

    public void buildRoute() {
        strategy.buildRoute();
    }
}