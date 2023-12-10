package n3exercici1;

public class Cycle extends Vehicle{
    @Override
    public void acelerate() {
        System.out.println("La bicicleta acelera");
    }

    @Override
    public void start() {
        System.out.println("La bicicleta comienza a andar");
    }

    @Override
    public void brake() {
        System.out.println("la bicicleta frena y aparca\n");
    }
}
