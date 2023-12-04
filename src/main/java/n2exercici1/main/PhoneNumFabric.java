package n2exercici1.main;

import n2exercici1.inter.FabricaAbstracta;
import n2exercici1.inter.IAddress;
import n2exercici1.inter.IPhoneNum;
import n2exercici1.inter.implem.AmericanPhoneNum;
import n2exercici1.inter.implem.EmptyNumber;
import n2exercici1.inter.implem.ItalianPhoneNum;
import n2exercici1.inter.implem.SpanishPhoneNum;

public class PhoneNumFabric implements FabricaAbstracta {

    @Override
    public IAddress createAddress(String pais) {
        return null;
    }

    public IPhoneNum createPhoneNumber(String pais) {

        if (pais == null) {
            return new EmptyNumber();
        }
        if (pais.equalsIgnoreCase("America")) {
            return new AmericanPhoneNum();
        } else if (pais.equalsIgnoreCase("Italia")) {
            return new ItalianPhoneNum();
        } else if (pais.equalsIgnoreCase("España")) {
            return new SpanishPhoneNum();
        }

        return new EmptyNumber();
    }

}
