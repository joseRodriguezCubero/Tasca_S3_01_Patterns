package n3exercici1;

import java.util.SortedSet;

public class Car extends Vehicle{
    @Override
    public void acelerate() {
        System.out.println("El coche empieza a acelerar");
    }

    @Override
    public void start() {
        System.out.println("El coche arranca, el motor ruge.");
    }

    @Override
    public void brake() {
        System.out.println("El coche frena y aparca\n");
    }
}
