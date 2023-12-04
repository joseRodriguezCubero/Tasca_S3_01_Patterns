package n2exercici1.inter.implem;

import n2exercici1.inter.IPhoneNum;

public class EmptyNumber implements IPhoneNum {
    @Override
    public String createPhoneNumber() {
        return "(---)";
    }
}
