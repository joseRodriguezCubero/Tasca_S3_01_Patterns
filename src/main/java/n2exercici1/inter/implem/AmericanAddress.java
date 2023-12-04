package n2exercici1.inter.implem;

import n2exercici1.inter.IAddress;
import n2exercici1.main.Entrada;

public class AmericanAddress implements IAddress {
    @Override
    public String createAddress() {
        String street = Entrada.leerString("Introduzca la calle");
        String number = Entrada.leerString("Introduzca el número");//TODO pedir números y pasarlos luego a string.
        String city = Entrada.leerString("Introduzca la ciudad");
        String zipcode = Entrada.leerString("Introduzca el código postal");
        String state = Entrada.leerString("introduzca las dos letras correspondientes al estado"); //TODO verificación para que solo se puedan introducir dos letras.
        state = state.toUpperCase();
        return number + " " + street + "\n" + city + ", " + state + " " + zipcode;
    }

    //7026 Greystone Ave.
    //Los Angeles, CA 90019
    //número, calle, ciudad, state (dos letras), zip code

}
