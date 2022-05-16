package creational.builder_pattern_application_v_3;

/* Feature */
public class GPSNavigator {
    private String route;

    public GPSNavigator() {
        this.route = Constants.DEFAULT_ROUTE;
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }
}
