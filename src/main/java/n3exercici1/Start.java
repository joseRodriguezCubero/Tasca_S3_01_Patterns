package n3exercici1;

public class Start implements IOperations{

    private Vehicle vehicle;

    public Start(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public void execute() {
        this.vehicle.start();
    }
}
