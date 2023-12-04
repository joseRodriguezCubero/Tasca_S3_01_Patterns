package n2exercici1.inter.implem;

import n2exercici1.inter.IAddress;
import n2exercici1.main.Entrada;

public class SpanishAddress implements IAddress {
    @Override
    public String createAddress() {
        String street = Entrada.leerString("Introduzca la calle");
        String number = Entrada.leerString("Introduzca el número");//TODO pedir números y pasarlos luego a string.
        String city= Entrada.leerString("Introduzca la ciudad");
        String zipcode = Entrada.leerString("Introduzca el código postal");
        String province = Entrada.leerString("introduzca la provincia");

        return street+" "+number+"\n"+zipcode+", "+city+" "+province;
    }

    /*1st line: Full name of the recipient (personal, organization or company name)
    2nd line: Street, building number, flat number, entrance number.
    3rd line: Post code and town name
    4th line: Name of province

    Example (office building of municipality of Mostoles):

    Ayuntamiento de Móstoles
    Plaza de España, 1
    28934 Mostoles (Madrid)
     */

}
