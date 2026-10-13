public class LaunchFacade {

    private final FuelSystem fuelSystem;
    private final NavigationSystem navigationSystem;
    private final CommunicationSystem communicationSystem;
    private final EngineSystem engineSystem;

    public LaunchFacade() {
        fuelSystem = new FuelSystem();
        navigationSystem = new NavigationSystem();
        communicationSystem = new CommunicationSystem();
        engineSystem = new EngineSystem();
    }

    public void launchMission() {
        System.out.println("=== Space Mission Launch ===");

        if (!fuelSystem.prepareFuel()) {
            abortLaunch();
            return;
        }

        if (!navigationSystem.checkNavigation()) {
            abortLaunch();
            return;
        }

        if (!communicationSystem.connect()) {
            abortLaunch();
            return;
        }

        engineSystem.startEngine();

        System.out.println("Mission launched successfully!");
    }

    private void abortLaunch() {
        System.out.println("Launch aborted!");
    }
}