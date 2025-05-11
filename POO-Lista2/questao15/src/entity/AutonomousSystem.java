package entity;

public class AutonomousSystem {
    public AutonomousSystem(){}

    public String navigation(AutonomousControl control, String destination, double speed){
        String dest = control.startRoute(destination);
        String spe = control.adjustSpeed(speed);

        return dest + spe;
    }
}
