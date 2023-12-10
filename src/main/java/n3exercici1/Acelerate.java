package n3exercici1;

public class Acelerate implements IOperations{

    private Vehicle vehicle;

    public Acelerate(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public void execute() {
        this.vehicle.acelerate();
    }
}
