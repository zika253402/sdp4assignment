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

        fuelSystem.prepareFuel();
        navigationSystem.checkNavigation();
        communicationSystem.connect();
        engineSystem.startEngine();

        System.out.println("Mission launched successfully!");
    }
}