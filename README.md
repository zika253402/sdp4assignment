# Space Launch Control

## Assignment 4 — Facade Pattern

**Course:** Software Design Patterns
**Language:** Java

This project demonstrates the Facade design pattern using a space launch system.

## Facade Pattern

The Facade pattern provides a simple interface to a complex subsystem.

* **Facade:** `LaunchFacade`
* **Subsystems:** `FuelSystem`, `NavigationSystem`, `CommunicationSystem`, `EngineSystem`
* **Client:** `Main`

The client calls only one method:

```java
facade.launchMission();
```

The facade coordinates the subsystems in the correct order and stops the launch if a preparation check fails.

## Clean Code Principles

### 1. Meaningful Names

```java
launchMission();
```

The method name clearly describes its purpose.

### 2. Single Responsibility

Each subsystem class has one responsibility, such as preparing fuel or checking navigation.

### 3. Encapsulation

The facade hides subsystem details. The client does not need to manage each subsystem separately.

### 4. Small Methods

```java
private void abortLaunch() {
    System.out.println("Launch aborted!");
}
```

This method handles one specific task.

### 5. Error Handling

```java
if (!fuelSystem.prepareFuel()) {
    abortLaunch();
    return;
}
```

The launch stops if fuel preparation fails, preventing later steps from running.

## Project Structure

```text
src/
├── FuelSystem.java
├── NavigationSystem.java
├── CommunicationSystem.java
├── EngineSystem.java
├── LaunchFacade.java
└── Main.java
```

## How to Run

Open the project in IntelliJ IDEA and run `Main.java`.
