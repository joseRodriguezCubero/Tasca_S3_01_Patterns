package n3exercici1;

public class Main {
    public static void main(String[] args) {

        Boat boat = new Boat();
        Plane plane = new Plane();
        Cycle cycle = new Cycle();
        Car car = new Car();

        Start start = new Start(boat);
        Start start1 = new Start(plane);
        Start start2 = new Start(cycle);
        Start start3 = new Start(car);

        Acelerate acelerate = new Acelerate(boat);
        Acelerate acelerate1 = new Acelerate(plane);
        Acelerate acelerate2 = new Acelerate(cycle);
        Acelerate acelerate3 = new Acelerate(car);

        Brake brake = new Brake(boat);
        Brake brake1 = new Brake(plane);
        Brake brake2 = new Brake(cycle);
        Brake brake3 = new Brake(car);

        Parking parking = new Parking();
        parking.reciveOrders(start);
        parking.reciveOrders(acelerate);
        parking.reciveOrders(brake);
        parking.park();

        parking.reciveOrders(start1);
        parking.reciveOrders(acelerate1);
        parking.reciveOrders(brake1);
        parking.park();

        parking.reciveOrders(start2);
        parking.reciveOrders(acelerate2);
        parking.reciveOrders(brake2);
        parking.park();

        parking.reciveOrders(start3);
        parking.reciveOrders(acelerate3);
        parking.reciveOrders(brake3);
        parking.park();

    }
}
