package n2exercici1.inter.implem;

import n2exercici1.inter.IPhoneNum;
import n2exercici1.main.Entrada;

public class SpanishPhoneNum implements IPhoneNum {
    @Override
    public String createPhoneNumber() {
        String number = Entrada.leerString("Introduzca el número de teléfono sin prefijo internacional"); //TODO pedir numero y descomponerlo y transformarlo en string
        //TODO subdividir el String number para espacios en número.
        //TODO utilizar j-option pane para crear una ventana tipo formulario.
        String prefix = "+34";

        return prefix + " " + number;
        //+34 953 662 021
    }
}
