package n2exercici1.main;

import n2exercici1.inter.FabricaAbstracta;
import n2exercici1.inter.IAddress;
import n2exercici1.inter.IPhoneNum;

import java.util.Map;
import java.util.Scanner;

public class Menu { //TODO añadir complejidad a la app.

    public static byte showMenu() {
        Scanner entrada = new Scanner(System.in);
        byte option;
        final byte MIN = 0;
        final byte MAX = 4;

        do {
            System.out.println("\n    MENú PRINCIPAL");
            System.out.println(" 1.  - Añadir una entrada en la agenda (España)");
            System.out.println(" 2.  - Añadir una entrada en la agenda (Italia)");
            System.out.println(" 3.  - Añadir una entrada en la agenda (America)");
            System.out.println(" 4.  - Consultar agenda");
            System.out.println(" 0.  - Salir de la aplicación.\n");
            option = entrada.nextByte();
            if (option < MIN || option > MAX) {
                System.out.println("Escoge una opción válida");
            }
        } while (option < MIN || option > MAX);
        return option;
    }

    public static void choseMenu(Map<String, String> entries) {

        boolean exit = false;

        do {
            switch (showMenu()) {
                case 1:
                    createSpanishEntry(entries);
                    break;
                case 2:
                    createItalianEntry(entries);
                    break;
                case 3:
                    createAmericanEntry(entries);
                    break;
                case 4:
                    showEntries(entries);
                    break;
                case 0:
                    exit = true;
                    break;
            }
        } while (!exit);

    }

    public static void createSpanishEntry(Map<String, String> entries) {
        FabricaAbstracta AddressFabric = FabricProduction.getFactory("Address");
        assert AddressFabric != null;
        IAddress eAddress3 = AddressFabric.createAddress("España");
        FabricaAbstracta AddressFabric2 = FabricProduction.getFactory("PhoneNumber");
        assert AddressFabric2 != null;
        IPhoneNum ePhone3 = AddressFabric2.createPhoneNumber("España");
        entries.put(ePhone3.createPhoneNumber(), eAddress3.createAddress());
    }


    public static void createItalianEntry(Map<String, String> entries) {
        FabricaAbstracta AddressFabric = FabricProduction.getFactory("Address");
        assert AddressFabric != null;
        IAddress eAddress3 = AddressFabric.createAddress("Italia");
        FabricaAbstracta AddressFabric2 = FabricProduction.getFactory("PhoneNumber");
        assert AddressFabric2 != null;
        IPhoneNum ePhone3 = AddressFabric2.createPhoneNumber("Italia");
        entries.put(ePhone3.createPhoneNumber(), eAddress3.createAddress());
    }

    public static void createAmericanEntry(Map<String, String> entries) {
        FabricaAbstracta AddressFabric = FabricProduction.getFactory("Address");
        assert AddressFabric != null;
        IAddress eAddress3 = AddressFabric.createAddress("America");
        FabricaAbstracta AddressFabric2 = FabricProduction.getFactory("PhoneNumber");
        assert AddressFabric2 != null;
        IPhoneNum ePhone3 = AddressFabric2.createPhoneNumber("America");
        entries.put(ePhone3.createPhoneNumber(), eAddress3.createAddress());
    }

    public static void showEntries(Map<String, String> entries) {
        entries.forEach((key, value) -> System.out.println("Teléfono: " + key + " Dirección: " + value));
    }

}
