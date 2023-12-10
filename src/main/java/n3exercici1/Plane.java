package n3exercici1;

public class Plane extends Vehicle{
    @Override
    public void acelerate() {
        System.out.println("El avión está tomando altura");
    }

    @Override
    public void start() {
        System.out.println("El avión despega");
    }

    @Override
    public void brake() {
        System.out.println("el avión aterriza y aparca\n");
    }
}
