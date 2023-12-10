package n3exercici1;

import java.util.ArrayList;
import java.util.List;

public class Parking {

    private List<IOperations> operations = new ArrayList<>();

    public void reciveOrders(IOperations operation){
        this.operations.add(operation);
    }

    public void park(){
        this.operations.forEach(IOperations::execute);
        this.operations.clear();
    }
}
