package n3exercici1;

public class Brake implements IOperations{

    private Vehicle vehicle;

    public Brake(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public void execute() {
        this.vehicle.brake();
    }
}
