package n2exercici1.inter.implem;

import n2exercici1.inter.IAddress;

public class EmptyAddress implements IAddress {
    @Override
    public String createAddress() {
        return "(---)";
    }
}
