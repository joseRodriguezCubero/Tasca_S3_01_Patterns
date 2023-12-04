package n2exercici1.main;

import n2exercici1.inter.FabricaAbstracta;

public class FabricProduction {

    public static FabricaAbstracta getFactory(String typeOfFabric) {
        if (typeOfFabric.equalsIgnoreCase("Address")) {
            return new AddressFabric();
        } else if (typeOfFabric.equalsIgnoreCase("PhoneNumber")) {
            return new PhoneNumFabric();
        }
        return null;
    }

}
