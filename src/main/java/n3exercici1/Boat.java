package n3exercici1;

public class Boat extends Vehicle{

    @Override
    public void acelerate() {
        System.out.println("El barco incrementa la velicidad");
    }

    @Override
    public void start() {
        System.out.println("El barco sale del puerto");
    }

    @Override
    public void brake() {
        System.out.println("El barco aminora la velocidad y aparca\n");
    }
}
