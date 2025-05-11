package entity;

public interface AutonomousControl {
    String startRoute(String destination);
    String adjustSpeed(double speed);
}
