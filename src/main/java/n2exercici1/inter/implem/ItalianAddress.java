package n2exercici1.inter.implem;

import n2exercici1.inter.IAddress;
import n2exercici1.main.Entrada;

public class ItalianAddress implements IAddress {
    @Override
    public String createAddress() {
        String street = Entrada.leerString("Introduzca la calle");
        String number = Entrada.leerString("Introduzca el número");//TODO pedir números y pasarlos luego a string.
        String city= Entrada.leerString("Introduzca la ciudad");
        String zipcode = Entrada.leerString("Introduzca el código postal");
        String province = Entrada.leerString("introduzca las provincia");

        return street+" "+number+"\n"+zipcode+", "+city+" "+province;
    }

    //[Strada] [Numero Civico]
    //[CAP] [Città] [Provincia]
    //[Nazione]

}
