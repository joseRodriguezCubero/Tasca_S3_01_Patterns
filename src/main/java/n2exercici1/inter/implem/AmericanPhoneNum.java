package n2exercici1.inter.implem;

import n2exercici1.inter.IPhoneNum;
import n2exercici1.main.Entrada;

public class AmericanPhoneNum implements IPhoneNum {
    @Override
    public String createPhoneNumber() {
        String number = Entrada.leerString("Introduzca el número de teléfono sin prefijo internacional"); //TODO pedir numero y descomponerlo y transformarlo en string
        //TODO subdividir el String number para introducir guion y paréntesis.
        //TODO utilizar j-option pane para crear una ventana tipo formulario.
        String prefix = "+1";

        return prefix + " " +number;
    }

    //+1 (415) 555‑0132



}
