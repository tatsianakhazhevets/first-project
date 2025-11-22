package Practice15_ProjectPatterns.video.behavioral.strategy.after;

public class FastestRouteStrategy implements RouteStrategy {
    @Override
    public void buildRoute() {
        System.out.println("Building the fastest route.");
    }
}