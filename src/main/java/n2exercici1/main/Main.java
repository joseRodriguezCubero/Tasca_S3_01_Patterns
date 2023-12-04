package n2exercici1.main;

import n2exercici1.inter.FabricaAbstracta;
import n2exercici1.inter.IAddress;

public class Main {

    FabricaAbstracta AddressFabric = FabricProduction.getFactory("Address");
    IAddress eAddress = AddressFabric.createAddress("America");

}
