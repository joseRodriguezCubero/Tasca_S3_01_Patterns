package n1exercici1;

import java.util.LinkedList;
import java.util.NoSuchElementException;

public class Undo {
    private static Undo instance;

    private static LinkedList<String> commandList =new LinkedList<String>();

    private Undo() {

    }

    public static void getUndo() {
        if (instance == null) {
            instance = new Undo();
        }

    }

    public static void commandAdd(String s) {
        commandList.add(s);
    }

    public static void commandDel() throws NoSuchElementException {
      commandList.removeLast();
    }

    public static void commandPrint() {
        System.out.println("Últimos 4 comandos introducidos");
        int i = commandList.size()-1;
        int counter = 0;
        do {
            System.out.println(commandList.get(i));
            i--;
            counter ++;
        } while (counter < 4);
    }
}

