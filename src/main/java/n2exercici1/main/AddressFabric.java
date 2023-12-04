package n2exercici1.main;

import n2exercici1.inter.FabricaAbstracta;
import n2exercici1.inter.IAddress;
import n2exercici1.inter.IPhoneNum;
import n2exercici1.inter.implem.*;

public class AddressFabric implements FabricaAbstracta {
    public IAddress createAddress(String pais) {

        if (pais == null) {
            return new EmptyAddress();
        }
        if (pais.equalsIgnoreCase("America")) {
            return new AmericanAddress();
        } else if (pais.equalsIgnoreCase("Italia")) {
            return new ItalianAddress();
        } else if (pais.equalsIgnoreCase("España")) {
            return new SpanishAddress();
        }

        return new EmptyAddress();
    }

    @Override
    public IPhoneNum createPhoneNumber(String pais) {
        return null;
    }
}
